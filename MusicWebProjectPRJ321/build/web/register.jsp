<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>ClownsMusik Registration</title>

    <!-- Icons font CSS-->
    <link href="Register/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="Register/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="Register/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="Register/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="Register/css/main.css" rel="stylesheet" media="all">
</head>

<body>
    <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Registration Info</h2>
                    <form action="register" method="POST">
                        <div class="input-group" data-validate="Username is required">
                            <input class="input--style-3" type="text" placeholder="Username" name="username" pattern="[a-zA-Z0-9]+" title="Username only contains letters and number">
                        </div>
						<div class="input-group" data-validate="Password is required">
                            <input class="input--style-3" type="password" placeholder="Password" name="password" pattern="[a-zA-Z0-9]+" title="Password only contains letters and number">
                        </div>
                       
                        <div class="input-group">
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="gender">
                                    <option disabled="disabled" selected="selected">Gender</option>
                                    <option name="gender" value="true">Male</option>
                                    <option name="gender" value="false">Female</option>
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
						
						<div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Nation" name="nation" pattern="[a-zA-Z ]+" title="Nation only contains letters">
                        </div>
						
                        <div class="input-group" data-validate="Email is required">
                            <input class="input--style-3" type="email" placeholder="Email" name="email" pattern="^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$" title="Email not valid">
                        </div>
                        
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="Register/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="Register/vendor/select2/select2.min.js"></script>
    <script src="Register/vendor/datepicker/moment.min.js"></script>
    <script src="Register/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="Register/js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->