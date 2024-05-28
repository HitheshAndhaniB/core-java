<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Matrimony Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<nav  class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Marriage.jsp">Marriage Page</a>
                </li>
            </ul>
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                   <a class="nav-link active" aria-current="page" href="Contact.jsp">Contact Page</a>
                </li>
            </ul>

        </div>
    </div>
</nav>
<body>
<div class="container">
    <h2>Matrimony Application Form</h2>
    //<% String name = (String)request.getAttribute("name");%>//
     //:${name}//
    <form action="go" method="post">
        <div class="mb-3">
            <label for="CandidateName" class="form-label"> Name :</label>
            <input type="text" onblur="candidateName()" id="CandidateName" class="form-control" name="name" placeholder="Enter name here">
        </div>
        <div class="mb-3">
            <label for="MobileNumber" class="form-label">Mobile Number :</label>
            <input type="text" onblur="mobileNumber()" id="MobileNumber" class="form-control" name="mobileNumber" placeholder="Enter mobile number here" required>
        </div>
        <div class="mb-3">
            <label for="Age" class="form-label">Age :</label>
            <input type="text" onblur="Age()" id="Age" class="form-control" name="age" placeholder="Enter Age here" >
        </div>
        <div class="mb-3">
            <label for="Status" class="form-label">Maritial Status :</label>
            <select class="form-select" onblur="mstatus()" id="Status" name="maritialStatus" aria-label="Default select example" >
                <option>Select Status</option>
                <option>Married</option>
                <option>Divosed</option>
                <option>Single</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="Qualification" class="form-label">Qualification :</label>
            <input type="text" onblur="qualification()" id="Qualification" class="form-control" name="qualification" placeholder="Enter Qualification here" >
        </div>
        <div class="mb-3">
            <label for="Religion" class="form-label">Religion :</label>
            <input type="text" onblur="religion()" id="Religion" class="form-control" name="religion" placeholder="Enter Religion here" >
        </div>
        <div class="mb-3">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="Male" value="Male" required>
                <label class="form-check-label" for="Male">Male</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="Female" value="Female" required>
                <label class="form-check-label" for="Female">Female</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="Other" value="Other" required>
                <label class="form-check-label" for="Other">Other</label>
            </div>
        </div>

        <input type="submit" id="submitButton" class="btn btn-primary" value="register"/>
    </form>
</div>
</body>
</html>