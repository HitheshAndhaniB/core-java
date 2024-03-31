<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>index page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script>function team1Validate() {
                    var team1Value = document.getElementById("team1").value.trim();
                    var team1Error = document.getElementById("team1Error");
                    if (team1Value === "") {
                        team1Error.textContent = "Team 1 name is not valid.";
                        team1Error.style.display = "block";
                        team1Error.style.color = "red";

                        return false;
                    } else {
                        team1Error.style.display = "none";
                        return true;
                    }
                }

                function team2Validate() {
                    var team2Value = document.getElementById("team2").value.trim();
                    var team2Error = document.getElementById("team2Error");
                    if (team2Value === "") {
                        team2Error.textContent = "Team 2 name is not valid";
                        team2Error.style.display = "block";
                         team2Error.style.color = "red";
                        return false;
                    } else {
                        team2Error.style.display = "none";
                        return true;
                    }
                }

                function venueValidate() {
                    var venueValue = document.getElementById("venue").value.trim();
                    var venueError = document.getElementById("venueError");
                    if (venueValue === "") {
                        venueError.textContent = "Venue is not valid";
                        venueError.style.display = "block";
                        venueError.style.color = "red";
                        return false;
                    } else {
                        venueError.style.display = "none";
                        return true;
                    }
                }

                function dateValidate() {
                    var dateValue = document.getElementById("date").value.trim();
                    var dateError = document.getElementById("dateError");
                    if (dateValue === "") {
                        dateError.textContent = "Match Date is not valid.";
                        dateError.style.display = "block";
                        dateError.style.color = "red";
                        return false;
                    } else {
                        dateError.style.display = "none";
                        return true;
                    }
                }

                function timeValidate() {
                    var timeValue = document.getElementById("time").value.trim();
                    var timeError = document.getElementById("timeError");
                    if (timeValue === "") {
                        timeError.textContent = "Match Time is not valid.";
                        timeError.style.display = "block";
                        timeError.style.color = "red";
                        return false;
                    } else {
                        timeError.style.display = "none";
                        return true;
                    }
                }

                function umpire1Validate() {
                    var umpire1Value = document.getElementById("umpire1").value.trim();
                    var umpire1Error = document.getElementById("umpire1Error");
                    if (umpire1Value === "") {
                        umpire1Error.textContent = "Umpire 1 is  not valid";
                        umpire1Error.style.display = "block";
                        umpire1Error.style.color = "red";
                        return false;
                    } else {
                        umpire1Error.style.display = "none";
                        return true;
                    }
                }

                function umpire2Validate() {
                    var umpire2Value = document.getElementById("umpire2").value.trim();
                    var umpire2Error = document.getElementById("umpire2Error");
                    if (umpire2Value === "") {
                        umpire2Error.textContent = "Umpire 2 is not valid.";
                        umpire2Error.style.display = "block";
                        umpire2Error.style.color = "red";
                        return false;
                    } else {
                        umpire2Error.style.display = "none";
                        return true;
                    }
                }

                function tossValidation() {
                    var tossWinnerValue = document.getElementById("tossWinner").value.trim();
                    var tossError = document.getElementById("tossError");
                    if (tossWinnerValue === "") {
                        tossError.textContent = "Enter valid Toss Winner .";
                        tossError.style.display = "block";
                        tossError.style.color = "red";
                        return false;
                    } else {
                        tossError.style.display = "none";
                        return true;
                    }
                }

                function winnerValidation() {
                    var matchWinnerValue = document.getElementById("matchWinner").value.trim();
                    var winnerError = document.getElementById("winnerError");
                    if (matchWinnerValue === "") {
                        winnerError.textContent = "Enter valid Match Winner team.";
                        winnerError.style.display = "block";
                        winnerError.style.color = "red";
                        return false;
                    } else {
                        winnerError.style.display = "none";
                        return true;
                    }
                }

                function manOfTheMatchValidation() {
                    var manOfTheMatchValue = document.getElementById("manOfTheMatch").value.trim();
                    var manOfTheMatchError = document.getElementById("manOfTheMatchError");
                    if (manOfTheMatchValue === "") {
                        manOfTheMatchError.textContent = "Enter valid Man of the Match .";
                        manOfTheMatchError.style.display = "block";
                        manOfTheMatchError.style.color = "red";
                        return false;
                    } else {
                        manOfTheMatchError.style.display = "none";
                        return true;
                    }
                }

                function totalRunsValidation() {
                    var totalRunsValue = document.getElementById("totalRuns").value.trim();
                    var totalRunsError = document.getElementById("totalRunsError");
                    if (totalRunsValue === "") {
                        totalRunsError.textContent = "Enter valid Total Runs Scored.";
                        totalRunsError.style.display = "block";
                        totalRunsError.style.color = "red";
                        return false;
                    } else {
                        totalRunsError.style.display = "none";
                        return true;
                    }
                }

                function wicketsValidation() {
                    var totalWicketsValue = document.getElementById("totalWickets").value.trim();
                    var wicketsError = document.getElementById("wicketsError");
                    if (totalWicketsValue === "") {
                        wicketsError.textContent = "Enter valid Total Wickets Taken .";
                        wicketsError.style.display = "block";
                        wicketsError.style.color = "red";
                        return false;
                    } else {
                        wicketsError.style.display = "none";
                        return true;
                    }
                }

                </script>

    </head>

    <body>
    <nav  class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="TvRecharge.html">TvRecharge page</a>
                    </li>
                     <li class="nav-item">
                         <a class="nav-link active" aria-current="page" href="index.html">Index page</a>
                     </li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
    <div class="container">
        <h2>Market  Application</h2>
        <form  action="Market" method="post">
            <div class="mb-3">
                        <label for="team1">Team 1:</label>
                        <input type="text" class="form-control" id="team1" name="team1" onblur="team1Validate()">
                        <span id="team1Error" class="error-massage"></span>

                    </div>
            <div class="mb-3">
                        <label for="team2">Team 2:</label>
                        <input type="text" class="form-control" id="team2" name="team2" onblur="team2Validate()">
                        <span id="team2Error" class="error-massage"></span>
                    </div>
            <div class="mb-3">
                        <label for="venue">Venue:</label>
                        <input type="text" class="form-control" id="venue" name="venue" onblur="venueValidate()">
                        <span id="venueError" class="error-massage"></span>
                    </div>
            <div class="mb-3">
                        <label for="date">Match Date:</label>
                        <input type="date" class="form-control" id="date" name="date" onblur="dateValidate()">
                        <span id="dateError" class="error-massage"></span>

                    </div>

            <div class="mb-3">
                   <label for="time">Match Time:</label>
                   <input type="time" class="form-control" id="time" name="time" onblur="timeValidate()">
                   <span id="timeError" class="error-massage"></span>

               </div>
            <div class="mb-3">
                   <label for="umpire1">Umpire 1:</label>
                   <input type="text" class="form-control" id="umpire1" name="umpire1" onblur="umpire1Validate()">
                   <span id="umpire1Error" class="error-massage"></span>

               </div>
            <div class="mb-3">
                   <label for="umpire2">Umpire 2:</label>
                   <input type="text" class="form-control" id="umpire2" name="umpire2" onblur="umpire2Validate()">
                    <span id="umpire2Error" class="error-massage"></span>
               </div>
            <div class="mb-3">
                   <label for="tossWinner">Toss Winner:</label>
                   <input type="text" class="form-control" id="tossWinner" name="tossWinner" onblur="tossValidation()">
                        <span id="tossError" class="error-massage"></span>

               </div>
            <div class="mb-3">
                   <label for="matchWinner">Match Winner:</label>
                   <input type="text" class="form-control" id="matchWinner" name="matchWinner" onblur="winnerValidation()">
                        <span id="winnerError" class="error-massage"></span>

               </div>
            <div class="mb-3">
                   <label for="manOfTheMatch">Man of the Match:</label>
                   <input type="text" class="form-control" id="manOfTheMatch" name="manOfTheMatch" onblur="manOfTheMatchValidation()">
                        <span id="manOfTheMatchError" class="error-massage"></span>

               </div>
            <div class="mb-3">
                   <label for="totalRuns">Total Runs Scored:</label>
                   <input type="number" class="form-control" id="totalRuns" name="totalRuns" onblur="totalRunsValidation()">
                         <span id="totalRunsError" class="error-massage"></span>

               </div>
            <div class="mb-3">
                   <label for="totalWickets">Total Wickets Taken:</label>
                   <input type="number" class="form-control" id="totalWickets" name="totalWickets" onblur="wicketsValidation()">
                         <span id="wicketsError" class="error-massage"></span>
              </div>
            <div class="mb-3">
                   <label for="matchResult">Match Result:</label>
                   <select class="form-control" id="matchResult" name="matchResult" onblur="resulrValidation()">
                       <option value="Won by Team 1">Won by Team 1</option>
                       <option value="Won by Team 2">Won by Team 2</option>
                       <option value="Match Tied">Match Tied</option>
                   </select>
                   <span id="resultError" class="error-massage"></span>
               </div>
                <button type="submit"  id="btn" class="btn btn-primary" >Submit</button>



        </form>
    </div>
    </body>

    </html>