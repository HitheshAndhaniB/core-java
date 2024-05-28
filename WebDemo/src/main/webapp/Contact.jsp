<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Matrimony Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        .error-message {
            color: red;
            font-size: 1rem;
            display: none;
        }
    </style>
    <script>
        function validateName() {
            const name = document.getElementById('Name').value;
            const namePattern = /^[a-zA-Z\s]+$/;
            const nameError = document.getElementById('nameError');
            if (!namePattern.test(name)) {
                nameError.style.display = 'block';
                return false;
            } else {
                nameError.style.display = 'none';
                return true;
            }
        }

        function validateEmail() {
            const email = document.getElementById('Email').value;
            const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
            const emailError = document.getElementById('emailError');
            if (!emailPattern.test(email)) {
                emailError.style.display = 'block';
                return false;
            } else {
                emailError.style.display = 'none';
                return true;
            }
        }

        function validateMobileNo() {
            const mobileNo = document.getElementById('Mobile').value;
            const mobilePattern = /^\d{10}$/;
            const mobileError = document.getElementById('mobileError');
            if (!mobilePattern.test(mobileNo)) {
                mobileError.style.display = 'block';
                return false;
            } else {
                mobileError.style.display = 'none';
                return true;
            }
        }

        function validateComments() {
            const comments = document.getElementById('comments').value;
            const commentsError = document.getElementById('commentsError');
            if (comments.trim() === "") {
                commentsError.style.display = 'block';
                return false;
            } else {
                commentsError.style.display = 'none';
                return true;
            }
        }

        function validateForm() {
            const isNameValid = validateName();
            const isEmailValid = validateEmail();
            const isMobileValid = validateMobileNo();
            const isCommentsValid = validateComments();
            return isNameValid && isEmailValid && isMobileValid && isCommentsValid;
        }
    </script>
</head>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Marriage.jsp">Marriage Page</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<body>
<div class="container">
    <h2>Contact Form</h2>
    <form action="contact" method="post" onsubmit="return validateForm()">
        <b>${name}</b>
        <div class="mb-3">
            <label for="Name" class="form-label">Name :</label>
            <input type="text" id="Name" class="form-control" name="name" placeholder="Enter name here" onblur="validateName()">
            <div id="nameError" class="error-message">Please enter a valid name.</div>
        </div>
        <div class="mb-3">
            <label for="Email" class="form-label">Email :</label>
            <input type="text" id="Email" class="form-control" name="email" placeholder="Enter EmailId here" onblur="validateEmail()">
            <div id="emailError" class="error-message">Please enter a valid email address.</div>
        </div>
        <div class="mb-3">
            <label for="Mobile" class="form-label">Mobile NO :</label>
            <input type="text" id="Mobile" class="form-control" name="mobileNO" placeholder="Enter Mobile number here" onblur="validateMobileNo()">
            <div id="mobileError" class="error-message">Please enter a valid 10-digit mobile number.</div>
        </div>
        <div class="mb-3">
            <label for="comments">Comments :</label>
            <textarea class="form-control" placeholder="Leave a comment here" id="comments" name="comments" onblur="validateComments()"></textarea>
            <div id="commentsError" class="error-message">Please enter your comments.</div>
        </div>
        <input type="submit" id="submitButton" class="btn btn-primary" value="Contact"/>
    </form>
</div>
</body>
</html>
