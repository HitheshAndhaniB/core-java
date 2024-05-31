<%@ page isELIgnored = "false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hotel Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
     </head>
    <body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light" id="nav">
        <div class="container-fluid">
            <div id="logo"></div>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.jsp">Home-Page</a>
                    </li>
                    <li class="nav-item">
                         <a class="nav-link active" aria-current="page" href="Hotel.jsp">Hotel-Page</a>
                     </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <h2>Room-Booking Application</h2>
        <form name="hotelForm" action="room" method="post" onsubmit="return validateForm()" >
    <span style="color:red;">
    <c:forEach items="${errors}" var="objectError">
    ${objectError.defaultMessage}</br>
    </c:forEach>
    ${roomDto}
    </span>
            <div class="mb-3">
                <label for="name" class="form-label">Name :</label>
                <input type="text" class="form-control" name="name" value="${roomDto.name}" placeholder="Enter name here" aria-describedby="nameHelp">
                <span id="nameError" class="error"></span>
            </div>
            <div class="mb-3">
                <label for="phone" class="form-label">Phone no :</label>
                <input type="number" class="form-control" name="phone" value="${roomDto.phone}" placeholder="Enter Phone number here" aria-describedby="phoneHelp">
                <span id="phoneError" class="error"></span>
            </div>
            <div class="mb-3">
                 <label for="email" class="form-label">Email :</label>
                 <input type="text" class="form-control" name="email" value="${roomDto.email}" placeholder="Enter Email here" aria-describedby="EmailHelp">
                 <span id="EmailError" class="error"></span>
            </div>
            <div class="mb-3">
                <label for="type" class="form-label">Type :</label>
                <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="type" aria-describedby="typeHelp">
                    <option value="0" ${roomDto.type==null ? 'selected' : ''} selected>Room Type</option>
                    <option value="1" ${roomDto.type eq '1' ? 'selected' : ''}>2 Sharing with AC</option>
                    <option value="2" ${roomDto.type eq '2' ? 'selected' : ' '}>2 Sharing without AC</option>
                    <option value="3" ${roomDto.type eq '3' ? 'selected' : ' '}>3 sharing with Ac</option>
                    <option value="4" ${roomDto.type eq '4' ? 'selected' : ' '}>3 sharing without Ac</option>
                    <option value="5" ${roomDto.type eq '5' ? 'selected' : ' '}>single Sharing with Ac</option>
                    <option value="6" ${roomDto.type eq '6' ? 'selected' : ' '}>Single sharing with out Ac</option>
                </select>
                <span id="typeError" class="error"></span>
            </div>
            <div class="mb-3">
                <label for="gender" class="form-label">Gender :</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" value="Male" ${roomDto.gender eq 'Male' ? 'checked':' '} name="gender">
                    <label class="form-check-label" for="gender">Male</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" value="Female" ${roomDto.gender eq 'Male' ? 'checked':' '} name="gender">
                    <label class="form-check-label" for="gender">Female</label>
                </div>
                <span id="genderError" class="error"></span>
            </div>
            <input type="submit" id="submitButton" class="btn btn-primary" value="Submit"/>
        </form>
    </div>
    </body>
    </html>