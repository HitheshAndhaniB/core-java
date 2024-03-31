
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>index page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
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
        <form onsubmit="return validateForm()" name="validation" action="Market" method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Name :</label>
                <input type="text" class="form-control"  onblur="nameValidation()" id="name" placeholder="Enter Market name" name="name"  required>
                <span id="nameError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="location" class="form-label">Location :</label>
                <select class="form-select"  onblur="locationValidation()" name="location" id="location" required>
                    <option selected>--Select-Location---</option>
                    <option>Jayanagar</option>
                    <option>Shivaji Nagar</option>
                    <option>vidya nagar</option>
                    <option>Shrirangpatna</option>
                </select >
                <span id="locationError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="city" class="form-label">City :</label>
                <select class="form-select"  onblur="cityValidation()" name="city" id="city" required>
                    <option selected>--Select-city---</option>
                    <option>Bangaluru</option>
                    <option>Shivmogga</option>
                    <option>Dhavangere</option>
                    <option>Mysore</option>
                </select >
                <span id="cityError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="pincode" class="form-label">Pincode :</label>
                <input type="text" class="form-control" onblur="pincodeValidation()" id="pincode" placeholder="Enter pincode " name="pincode" required>
                <span id="pincodeError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="area" class="form-label">Area :</label>
                <input type="text" class="form-control" onblur="areaValidation()" id="area" placeholder="Enter Area " name="area" required>
                <span id="areaError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="type"  class="form-label">Type :</label>
                <select name="type" class="form-select" onblur="typeValidation()" id="type"  required>
                    <option selected>Select type</option>
                    <option>Vegitables</option>
                    <option>Fruits</option>
                    <option>flowers</option>
                </select>
                <span id="typeError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="stall" class="form-label">Stall no :</label>
                <input type="text" class="form-control" onblur="satllValidation()"  id="stall" placeholder="Enter stall " name="stall" required>
                <span id="stallError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="item" class="form-label">Item Name :</label>
                <input type="text" class="form-control" onblur="itemValidation()" id="item" placeholder="Enter item name " name="item" required>
                <span id="itemError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="quantity" class="form-label">Item Quantity :</label>
                <input type="text" class="form-control" onblur="quantityValidation()"  id="quantity" placeholder="Enter item quantity " name="quantity" required>
                <span id="quantityError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="quality" class="form-label">Item Quality :</label>
                <input type="text" class="form-control" onblur="qualityValidation()" id="quality" placeholder="Enter item quality " name="quality" required>
                <span id="qualityError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="cost" class="form-label">Item Cost :</label>
                <input type="text" class="form-control" onblur="costValidation()"  id="cost" placeholder="Enter item cost " name="cost" required>
                <span id="costError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="Owner" class="form-label">Stall Owner :</label>
                <input type="text" class="form-control" onblur="ownerValidation()" id="Owner" placeholder="Enter Stall Owner " name="Owner" required>
                <span id="ownerError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="keb" class="form-label">Stall KEB NO :</label>
                <input type="text" class="form-control" onblur="kebValidation()"  id="keb" placeholder="Enter Stall KEB No " name="keb" required>
                <span id="kebError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="gst" class="form-label">Stall GST NO :</label>
                <input type="text" class="form-control" onblur="gstValidation()"  id="gst" placeholder="Enter Stall GST No " name="gst" required>
                <span id="gstError" class="error-message"></span>
            </div>
            <div class="mb-3">
                <label for="transaction" class="form-label">Weekly Transaction :</label>
                <input type="text" class="form-control" onblur="transactionValidation()" id="transaction" placeholder="Enter Weekly Transaction Amount " name="transaction" required>
                <span id="transactionError" class="error-message"></span>
            </div>
            <div>
                <button type="submit" id="buttonId" class="btn btn-primary" >Submit</button>
            </div>
        </form>
    </div>
    </body>
    </html>