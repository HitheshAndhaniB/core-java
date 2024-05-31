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
                        <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                         <a class="nav-link active" aria-current="page" href="Hotel.jsp">Hotel</a>
                     </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <h2>Hotel Application</h2>
        <form name="hotelForm" action="room" method="post" onsubmit="return validateForm()" >
    <span style="color:red;">
    <c:forEach items="${errors}" var="objectError">
    ${objectError.defaultMessage}</br>
    </c:forEach>
    </span>
            <div class="mb-3">
                <label for="name" class="form-label">Name :</label>
                <input type="text" class="form-control" name="name" placeholder="Enter name here" aria-describedby="nameHelp">
                <span id="nameError" class="error"></span>
            </div>
            <div class="mb-3">
                <label for="phone" class="form-label">Phone no :</label>
                <input type="number" class="form-control" name="phone" placeholder="Enter Phone number here" aria-describedby="phoneHelp">
                <span id="phoneError" class="error"></span>
            </div>
            <div class="mb-3">
                <label for="menu" class="form-label">Menu :</label>
                <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="menu" aria-describedby="menuHelp">
                    <option selected>Hotel Menu</option>
                    <option value="1">Chicken Biriyani</option>
                    <option value="2">Veg Biriyani</option>
                    <option value="3">Mutton Biriyani</option>
                    <option value="4">Chicken Kabab</option>
                    <option value="5">Fish fry</option>
                    <option value="6">Chicken 65</option>
                    <option value="7">Something else here</option>
                </select>
                <span id="menuError" class="error"></span>
            </div>
            <div class="mb-3">
                <label for="type" class="form-label">Payment Type :</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" value="Online" name="type">
                    <label class="form-check-label" for="type">Online</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" value="Offline" name="type">
                    <label class="form-check-label" for="type">Offline</label>
                </div>
                <span id="paymentError" class="error"></span>
            </div>
            <input type="submit" id="submitButton" class="btn btn-primary" value="Submit"/>
        </form>
    </div>
    </body>
    </html>