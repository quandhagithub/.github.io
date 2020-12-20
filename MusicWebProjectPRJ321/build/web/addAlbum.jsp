<!DOCTYPE html>
<html lang="en">
<head>
<title>Edit Albums</title>
<meta charset="utf-8">
<meta name="description" content="Colorlib Templates">
<meta name="author" content="Colorlib">
<meta name="keywords" content="Colorlib Templates">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Mixtape template project">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" type="text/css" href="styles/bootstrap-4.1.2/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/song.css">
<link rel="stylesheet" type="text/css" href="styles/song_responsive.css">
<link href="css/droplist.css" rel="stylesheet" type="text/css" />
<!-- Icons font CSS-->
    <link href="Register/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="Register/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="Register/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="Register/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="Register/css/Editsong.css" rel="stylesheet" media="all">
</head>
<body>

<div class="super_container">
	
	
	<!-- Home -->

	<div class="home">
		<div class="home_inner">
			<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/single.jpg" data-speed="0.8"></div>
			<div class="home_container">
				<div class="home_content text-center">
					<div class="home_subtitle">Clowns</div>
					<div class="home_title">Edit Albums Page</div>
				</div>
			</div>
		</div>
	</div>

	 <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Album Info</h2>
                    <form action="addalbum" method="POST">
						<div class="input-group">
                            <input class="input--style-3" type="text" placeholder="ID" name="id" pattern="[a-zA-Z0-9]+" title="ID only contains letters and number">
                        </div>
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Title" name="title" pattern="[a-zA-Z0-9 ]+" title="Title only contains letters and number">
                        </div>
						<div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Genre" name="genre" pattern="[a-zA-Z0-9 ]+" title="Genre only contains letters and number">
                        </div>

						
						<div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Path" name="path" pattern="^(.*/)([^/]*)$" title="Path not valid">
                        </div>
                        
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="ID Artist" name="idartist" pattern="[a-zA-Z0-9]+" title="ID Artist only contains letters and number">
                        </div>
                        
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Artist" name="artist" pattern="[a-zA-Z0-9 ]+" title="Artist only contains letters and number">
                        </div>
						
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit">Add</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
	

</div>

<script src="js/jquery-3.2.1.min.js"></script>
<script src="styles/bootstrap-4.1.2/popper.js"></script>
<script src="styles/bootstrap-4.1.2/bootstrap.min.js"></script>
<script src="plugins/greensock/TweenMax.min.js"></script>
<script src="plugins/greensock/TimelineMax.min.js"></script>
<script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="plugins/greensock/animation.gsap.min.js"></script>
<script src="plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="plugins/easing/easing.js"></script>
<script src="plugins/progressbar/progressbar.min.js"></script>
<script src="plugins/parallax-js-master/parallax.min.js"></script>
<script src="plugins/jPlayer/jquery.jplayer.min.js"></script>
<script src="plugins/jPlayer/jplayer.playlist.min.js"></script>
<script src="plugins/fit-vids/jquery.fitvids.js"></script>
<script src="js/single.js"></script>

<!-- Jquery JS-->
<script src="Register/vendor/jquery/jquery.min.js"></script>
<!-- Vendor JS-->
<script src="Register/vendor/select2/select2.min.js"></script>
<script src="Register/vendor/datepicker/moment.min.js"></script>
<script src="Register/vendor/datepicker/daterangepicker.js"></script>

<!-- Main JS-->
<script src="js/global.js"></script>
</body>
</html>