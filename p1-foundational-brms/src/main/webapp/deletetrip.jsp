<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- basic -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="viewport" content="initial-scale=1, maximum-scale=1" />
    <!-- site metas -->
    <title>Bus Booking</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!-- bootstrap css -->
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <!-- style css -->
    <link rel="stylesheet" href="css/style.css" />
    <!-- Responsive-->
    <link rel="stylesheet" href="css/responsive.css" />
    <!-- fevicon -->
    <link rel="icon" href="images/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css" />
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
        media="screen" />
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script
    ><![endif]-->
</head>
<!-- body -->

<body class="main-layout">
    <!-- loader  -->
    <div class="loader_bg">
        <div class="loader"><img src="images/loading.gif" alt="#" /></div>
    </div>
    <!-- end loader -->
    <!-- header -->
    
    <header>
          
        <!-- header inner -->
        <div class="header">
            <div class="container">
                <div class="row">
                    <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                        <div class="full">
                            <div class="center-desk">
                                <div class="logo">
                                    <a href="index.jsp"><img src="images/logo.png" alt="#"
                                            style="height: 70px; width: 100px" /></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                        <nav class="navigation navbar navbar-expand-md navbar-dark">
                            <button class="navbar-toggler" type="submit" data-toggle="collapse"
                                data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false"
                                aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarsExample04">
                                <ul class="navbar-nav mr-auto">
                                    <li class="nav-item">
                                        <a class="nav-link" href="index.jsp">Home</a>
                                    </li>
                                    <li class="nav-item active">
                                        <a class="nav-link" href="about.jsp">About</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="cities.jsp">Cities</a>
                                    </li>

                                    <!-- <li class="nav-item">
                                        <a class="nav-link" href="index2.jsp">Trips</a>
                                    </li> -->
                                    <li class="nav-link" id="dropdown" style="text-align: center;" size="3">
                                        <a href="trips.jsp"><span>Trips</span> <i class="bi bi-chevron-down"></i></a>
                                        <ul>
                                            <li><a href="showtrips.jsp">Show All Trip Details</a></li>
                                            <li><a href="addtrip.jsp">Add Trip</a></li>
                                            <li><a href="edittrip.jsp">Update Trip</a></li>
                                            <li><a href="deletetrip.jsp">Delete Trip</a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="contact.jsp">Contact Us</a>
                                    </li>
                                    
                                    <li class="nav-item">
                                        <a class="nav-link" href="login.jsp">Admin login</a>
                                    </li>
                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- end header inner -->
    <!-- end header -->
     
    

    <main id="main">
        <!-- ======= Breadcrumbs ======= -->
        <!-- <div class="breadcrumbs" data-aos="fade-in">
            <div class="container">
                <h2>Add Trip</h2>
            </div>
        </div> -->
        <!-- End Breadcrumbs -->
    
        <section class="vh-100" style="background-color: #eee">
            <div class="container h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-lg-12 col-xl-11">
                        <div class="card text-black" style="border-radius: 25px">
                            <div class="card-body p-md-5">
                                <div class="row justify-content-center">
                                    <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
                                        <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">
                                            Delete Trip Details</p>
                                        <form method="get" action="DeleteTrip" class="mx-1 mx-md-4">
                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-book fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <input type="text" name="TripId" id="form3Example1c"
                                                        class="form-control" placeholder="Enter TripId" />
                                                </div>
                                            </div>
    
    
    
                                            <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                                <input type="submit" value="delete Trip" class="btn btn-primary btn-lg">
                                            </div>
                                        </form>
                                        <!--   <div
    											class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
    											<img src="my_img/add-animate.svg" class="img-fluid"
    												alt="Sample image" />
    										</div> -->
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>
     

    <!--  footer -->
    <footer>
        <div class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <h3>Contact US</h3>
                        <ul class="conta">
                            <li>
                                <i class="fa fa-map-marker" aria-hidden="true"></i> Address
                            </li>
                            <li>
                                <i class="fa fa-mobile" aria-hidden="true"></i> +01 1234569540
                            </li>
                            <li>
                                <i class="fa fa-envelope" aria-hidden="true"></i><a href="#"> demo@gmail.com</a>
                            </li>
                        </ul>
                    </div>
                    <div class="col-md-4">
                        <h3>Menu Link</h3>
                        <ul class="link_menu">
                            <li><a href="#">Home</a></li>
                            <li class="active"><a href="about.jsp"> about</a></li>
                            <li><a href="room.jsp">Our Room</a></li>
                            <li><a href="gallery.jsp">Gallery</a></li>
                            <li><a href="blog.jsp">Blog</a></li>
                            <li><a href="contact.jsp">Contact Us</a></li>
                        </ul>
                    </div>
                    <div class="col-md-4">
                        <h3>News letter</h3>
                        <form class="bottom_form">
                            <input class="enter" placeholder="Enter your email" type="text" name="Enter your email" />
                            <button class="sub_btn">subscribe</button>
                        </form>
                        <ul class="social_icon">
                            <li>
                                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-youtube-play" aria-hidden="true"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="copyright">
                <div class="container">
                    <div class="row">
                        <div class="col-md-10 offset-md-1">
                            <p>
                                © 2019 All Rights Reserved. Design by
                                <a href="https://html.design/"> Free Html Templates</a>
                                <br /><br />
                                Distributed by
                                <a href="https://themewagon.com/" target="_blank">ThemeWagon</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- end footer -->
    <!-- Javascript files-->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.bundle.min.js"></script>
    <script src="js/jquery-3.0.0.min.js"></script>
    <!-- sidebar -->
    <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/custom.js"></script>
</body>

</html>