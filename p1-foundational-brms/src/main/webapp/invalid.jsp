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
    <link
      rel="stylesheet"
      href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
      media="screen"
    />
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
                    <a href="index.jsp"
                      ><img
                        src="images/logo.png"
                        alt="#"
                        style="height: 70px; width: 100px"
                    /></a>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
              <nav class="navigation navbar navbar-expand-md navbar-dark">
                <button
                  class="navbar-toggler"
                  type="button"
                  data-toggle="collapse"
                  data-target="#navbarsExample04"
                  aria-controls="navbarsExample04"
                  aria-expanded="false"
                  aria-label="Toggle navigation"
                >
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarsExample04">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                      <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="about.jsp">About</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="trips.jsp">Trips</a>
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
    <!-----login page-->
    <section class="h-100 gradient-form" style="background-color: #eee">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-xl-10">
            <div class="card rounded-3 text-black">
              <div class="row g-0">
                <div class="col-lg-6">
                  <div class="card-body p-md-5 mx-md-4">
                    <div class="text-center">
                      <img
                        src="images/bus1.png"
                        style="width: 185px"
                        alt="logo"
                      />
                      <h4 class="mt-1 mb-5 pb-1">
                       <b>Welcome to MSTANG Bus Services</b> 
                      </h4>
                    </div>

                    <form>
                      <h2>Please login to your account</h5>
                      <br>
                      <p style="color:red">Invalid credentials</p>
                      <br>
                      
                      <div class="form-outline mb-4">
                        <input
                          type="email"
                          id="form2Example11"
                          class="form-control"
                          placeholder="Phone number or email address"
                        />
                        <label class="form-label" for="form2Example11"
                          >Username</label
                        >
                      </div>

                      <div class="form-outline mb-4">
                        <input
                          type="password"
                          id="form2Example22"
                          class="form-control"
                        />
                        <label class="form-label" for="form2Example22"
                          >Password</label
                        >
                      </div>

                      <div class="text-center pt-1 mb-5 pb-1">
                       <a href="dashboard.jsp"> <button
                          class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3"
                          type="button" >Log in </button></a>
                        <a class="text-muted" href="#!">Forgot password?</a>
                      </div>

                      <div
                        class="d-flex align-items-center justify-content-center pb-4"
                      >
                        <p class="mb-0 me-2">Don't have an account?</p>
                        <button type="button" class="btn btn-outline-danger">
                          Create new
                        </button>
                      </div>
                    </form>
                  </div>
                </div>
                <div
                  class="col-lg-6 d-flex align-items-center gradient-custom-2"
                >
                  <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                    <h4 class="mb-4">We are more than just a company</h4>
                    <p class="small mb-0">
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                      sed do eiusmod tempor incididunt ut labore et dolore magna
                      aliqua. Ut enim ad minim veniam, quis nostrud exercitation
                      ullamco laboris nisi ut aliquip ex ea commodo consequat.
                    </p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

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
                  <i class="fa fa-envelope" aria-hidden="true"></i
                  ><a href="#"> demo@gmail.com</a>
                </li>
              </ul>
            </div>
            <div class="col-md-4">
              <h3>Menu Link</h3>
              <ul class="link_menu">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="about.jsp"> about</a></li>
                <li><a href="room.jsp">Our Room</a></li>
                <li><a href="gallery.jsp">Gallery</a></li>
                <li><a href="blog.jsp">Blog</a></li>
                <li><a href="contact.jsp">Contact Us</a></li>
              </ul>
            </div>
            <div class="col-md-4">
              <h3>News letter</h3>
              <form class="bottom_form">
                <input
                  class="enter"
                  placeholder="Enter your email"
                  type="text"
                  name="Enter your email"
                />
                <button class="sub_btn">subscribe</button>
              </form>
              <ul class="social_icon">
                <li>
                  <a href="#"
                    ><i class="fa fa-facebook" aria-hidden="true"></i
                  ></a>
                </li>
                <li>
                  <a href="#"
                    ><i class="fa fa-twitter" aria-hidden="true"></i
                  ></a>
                </li>
                <li>
                  <a href="#"
                    ><i class="fa fa-linkedin" aria-hidden="true"></i
                  ></a>
                </li>
                <li>
                  <a href="#"
                    ><i class="fa fa-youtube-play" aria-hidden="true"></i
                  ></a>
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
                  ?? 2019 All Rights Reserved. Design by
                  <a href="https://html.design/"> Free Html Templates</a>
                  <br /><br />
                  Distributed by
                  <a href="https://themewagon.com/" target="_blank"
                    >ThemeWagon</a
                  >
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
