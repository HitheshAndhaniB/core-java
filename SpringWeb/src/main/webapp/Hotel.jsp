<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hotel Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        #logo {
            background-image: url("XworkzLogo.png");
            height: 60px;
            width: 100px;
            background-position: center;
            background-repeat: no-repeat;
            background-size: contain;
        }
        #nav {
            background-color: black;
        }
        .error {
            color: red;
        }
    </style>
    <script>
        function validateName() {
            var name = document.forms["hotelForm"]["name"].value;
            var nameError = document.getElementById("nameError");
            if (name === "") {
                nameError.textContent = "Name must be filled out";
                return false;
            } else {
                nameError.textContent = "";
                return true;
            }
        }

        function validatePhone() {
            var phone = document.forms["hotelForm"]["phone"].value;
            var phoneError = document.getElementById("phoneError");
            if (phone === "") {
                phoneError.textContent = "Phone number must be filled out";
                return false;
            } else {
                phoneError.textContent = "";
                return true;
            }
        }

        function validateMenu() {
            var menu = document.forms["hotelForm"]["menu"].value;
            var menuError = document.getElementById("menuError");
            if (menu === "Hotel Menu") {
                menuError.textContent = "Please select a menu item";
                return false;
            } else {
                menuError.textContent = "";
                return true;
            }
        }

        function validatePaymentType() {
            var paymentTypeOnline = document.forms["hotelForm"]["type"][0].checked;
            var paymentTypeOffline = document.forms["hotelForm"]["type"][1].checked;
            var paymentError = document.getElementById("paymentError");
            if (!paymentTypeOnline && !paymentTypeOffline) {
                paymentError.textContent = "Please select a payment type";
                return false;
            } else {
                paymentError.textContent = "";
                return true;
            }
        }

        function validateForm() {
            return validateName() && validatePhone() && validateMenu() && validatePaymentType();
        }

        window.onload = function() {
            var nameField = document.forms["hotelForm"]["name"];
            var phoneField = document.forms["hotelForm"]["phone"];
            var menuField = document.forms["hotelForm"]["menu"];
            var paymentTypes = document.forms["hotelForm"]["type"];

            nameField.onblur = validateName;
            phoneField.onblur = validatePhone;
            menuField.onchange = validateMenu;
            for (var i = 0; i < paymentTypes.length; i++) {
                paymentTypes[i].onclick = validatePaymentType;
            }
        }
    </script>
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
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <h2>Hotel Application</h2>
    <form name="hotelForm" action="hotel" method="post" onsubmit="return validateForm()">
        <div class="mb-3">
            <label for="name" class="form-label">Name :</label>
            <input type="text" class="form-control" name="name" placeholder="Enter name here" aria-describedby="nameHelp">
            <span id="nameError" class="error"></span>
        </div>
        <div class="mb-3">
            <label for="phone" class="form-label">Phone no :</label>
            <input type="text" class="form-control" name="phone" placeholder="Enter Phone number here" aria-describedby="phoneHelp">
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
