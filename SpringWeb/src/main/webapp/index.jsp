<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        #logo{
            background-image: url("XworkzLogo.png");
            height: 60px;
            width: 100px;
            background-position: center;
            background-repeat: no-repeat;
            background-size: contain;
        }
        #nav{
            background-color: black;
        }
    </style>
</head>
<nav  class="navbar navbar-expand-lg navbar-light bg-light" id="nav">
    <div class="container-fluid">
        <div id = "logo"></div>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Hotel.jsp">Hotel</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="RoomBooking.jsp">RoomBooking</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<body>
<h1>This is index page...</h1>
</body>
</html>