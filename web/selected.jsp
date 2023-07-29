<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Hostler's | Home</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Oswald:wght@400;500;600&display=swap" rel="stylesheet">

        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Flaticon Font -->
        <link href="lib/flaticon/font/flaticon.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="style.css" rel="stylesheet">
    </head>

    <body>
       

        <%

            String pincode = (String) session.getAttribute("pincode");
            
            if (pincode == null) {
                response.sendRedirect("home.jsp");
            } else {
            }

        %>

        <%  String hostelname = request.getParameter("hostelname");
            String name = request.getParameter("name");
            
            String contact = request.getParameter("contact");
            String Hosteladdress = request.getParameter("hosteladdress");
            String Email = request.getParameter("email");
            String charges = request.getParameter("charges");
            String furnished = request.getParameter("furnished");
            String wifi = request.getParameter("wifi");
            String convencefacility = request.getParameter("convencefacility");
            String geyser = request.getParameter("geyser");
            String medicalfacility = request.getParameter("medicalfacility");
            String bankingfacility = request.getParameter("bankingfacility");
            String ac = request.getParameter("ac");
            String messfacility = request.getParameter("messfacility");

            

        %>
        <!-- Topbar Start -->
        <div class="container-fluid bg-dark py-3">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 text-center text-lg-left mb-2 mb-lg-0">
                        <div class="d-inline-flex align-items-center">
                            <a class="text-white pr-3" href="">FAQs</a>
                            <span class="text-white">|</span>
                            <a class="text-white px-3" href="">Help</a>
                            <span class="text-white">|</span>
                            <a class="text-white pl-3" href="">Support</a>
                        </div>
                    </div>
                    <div class="col-md-6 text-center text-lg-right">
                        <div class="d-inline-flex align-items-center">
                            <a class="text-white px-3" href="">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                            <a class="text-white px-3" href="">
                                <i class="fab fa-twitter"></i>
                            </a>
                            <a class="text-white px-3" href="">
                                <i class="fab fa-linkedin-in"></i>
                            </a>
                            <a class="text-white px-3" href="">
                                <i class="fab fa-instagram"></i>
                            </a>
                            <a class="text-white pl-3" href="">
                                <i class="fab fa-youtube"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Topbar End -->


        <!-- Navbar Start -->
        <div class="container-fluid position-relative nav-bar p-0">
            <div class="container position-relative" style="z-index: 9;">
                <nav class="navbar navbar-expand-lg bg-secondary navbar-dark py-3 py-lg-0 pl-3 pl-lg-5">
                    <a href="" class="navbar-brand">
                        <h1 class="m-0 display-5 text-white"><span class="text-primary"></span>HOSTLER'S</h1>
                    </a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-between px-3" id="navbarCollapse">
                        <div class="navbar-nav ml-auto py-0">
                            <a href="index.jsp" class="nav-item nav-link active">Home</a>
                            <a href="searchhostel.jsp" class="nav-item nav-link">Search Hostel</a>
                            <a href="service.jsp" class="nav-item nav-link">Service</a>
                            <a href="project.jsp" class="nav-item nav-link">Project</a><a href="contact.jsp" class="nav-item nav-link">Contact</a>
                            <a href="index.jsp" class="nav-item nav-link"> LogOut</a>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
        <!-- Navbar End -->


        <!-- Under Nav Start -->
        <div class="container-fluid bg-white py-3">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 text-left mb-3 mb-lg-0">
                        <div class="d-inline-flex text-left">
                            <h1 class="flaticon-office font-weight-normal text-primary m-0 mr-3"></h1>
                            <div class="d-flex flex-column">
                                <h5>Our Office</h5>
                                <p class="m-0">Indore,India</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 text-left text-lg-center mb-3 mb-lg-0">
                        <div class="d-inline-flex text-left">
                            <h1 class="flaticon-email font-weight-normal text-primary m-0 mr-3"></h1>
                            <div class="d-flex flex-column">
                                <h5>Email Us</h5>
                                <p class="m-0">prasoonbhargava71694@gmail.com</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 text-left text-lg-right mb-3 mb-lg-0">
                        <div class="d-inline-flex text-left">
                            <h1 class="flaticon-telephone font-weight-normal text-primary m-0 mr-3"></h1>
                            <div class="d-flex flex-column">
                                <h5>Call Us</h5>
                                <p class="m-0">+91 9826672029</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Under Nav End -->

        <!-- Carousel Start -->
        <div class="container-fluid p-0">
            <div id="header-carousel" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="w-100" src="images/download.jpeg" alt="Image">
                        <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
                            <div class="p-3" style="max-width: 800px;">
                                <h4 class="text-primary text-uppercase font-weight-normal mb-md-3">Creative Interior Design</h4>
                                <h3 class="display-3 text-white mb-md-4">Make Your Home Better</h3>
                                <a href="" class="btn btn-primary py-md-3 px-md-5 mt-2 mt-md-4">Learn More</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="w-100" src="images/image1.jpeg" alt="Image">
                        <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
                            <div class="p-3" style="max-width: 800px;">
                                <h4 class="text-primary text-uppercase font-weight-normal mb-md-3">Creative Interior Design</h4>
                                <h3 class="display-3 text-white mb-md-4">Stay At Home In Peace</h3>
                                <a href="" class="btn btn-primary py-md-3 px-md-5 mt-2 mt-md-4">Learn More</a>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#header-carousel" data-slide="prev">
                    <div class="btn btn-primary" style="width: 45px; height: 45px;">
                        <span class="carousel-control-prev-icon mb-n2"></span>
                    </div>
                </a>
                <a class="carousel-control-next" href="#header-carousel" data-slide="next">
                    <div class="btn btn-primary" style="width: 45px; height: 45px;">
                        <span class="carousel-control-next-icon mb-n2"></span>
                    </div>
                </a>
            </div>
        </div>
        <!-- Carousel End -->


        <!-- About Start -->
        <div class="container-fluid bg-light">
            <div class="container">
                <div class="row">
                    
                    <%
                     String Name= (String)session.getAttribute("name");
                    
                    %>
                    
                    <div class="col-lg-7 m-0 my-lg-5 pt-5 pb-5 pb-lg-2 pl-lg-5">
                        <h6 class="text-primary font-weight-normal text-uppercase mb-3">Welcome</h6>
                        <h1 class="mb-4 section-title">Hello <%=Name%>,You have selected <%=hostelname%></h1>
                        <p></p>
                        
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- About End -->


        <!-- Services Start -->
        <table border="6px" align="center" width="85"> 
            <tr>
                <td><strong>hostel name</strong></td>
                <td><strong>name</strong></td>
                <td><strong>Contact</strong></td>
                <td><strong> Hostel Address</strong></td>
                 <td><strong>Email</strong></td>
                <td><strong>Charges</strong></td>
               <td><strong>Furnished</strong></td>
                <td><strong> Convence Facility </strong></td>
                <td><strong> Medical Facility</strong></td>
                <td><strong>Banking facility</strong></td>
                <td><strong>Mess Facility</strong></td>  
            </tr>
            <form action="" method="post"> 

                <tr>
                    <td> <%=hostelname%></td>
                    <td><%=name%></td>
                    <td><%=contact%></td>
                    <td><%=Hosteladdress%></td>
                    <td><%=Email%></td>
                    <td><%=charges%></td>
                    <td><%=furnished%></td>
                    <td><%=convencefacility%></td>
                    <td><%=medicalfacility%></td>
                    <td><%=bankingfacility%></td>
                    <td><%=messfacility%></td>
                   </tr>
            </form>

        </table>
                    
        <br>
        
        
        <!-- Services End -->
        <!-- 2nd form for no. of rooms,and all -->
        
        
<!--2nd form ends-->
        <!-- Features Start -->
        <div class="container-fluid bg-light">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7 mt-5 py-5 pr-lg-5">
                        <h6 class="text-primary font-weight-normal text-uppercase mb-3">Why Choose Us?</h6>
                        <h1 class="mb-4 section-title">25+ Years Experience In providing hostels and customer service</h1>
                      
                            <li>
                                <h5><i class="far fa-check-square text-primary mr-3"></i>25+ Years service</h5>
                            </li>
                            <li>
                                <h5><i class="far fa-check-square text-primary mr-3"></i>Best Interior Design of rooms</h5>
                            </li>
                            <li>
                                <h5><i class="far fa-check-square text-primary mr-3"></i>Customer Satisfaction</h5>
                            </li>
                        </ul>
                        <a href="" class="btn btn-primary mt-3 py-2 px-4">View More</a>
                    </div>
                    <div class="col-lg-5">
                        <div class="d-flex flex-column align-items-center justify-content-center h-100 overflow-hidden">
                            <img class="h-100" src="img/feature.jpg" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Features End -->


       


        <!-- Footer Start -->
       <div class="container-fluid bg-dark text-white py-5 px-sm-3 px-md-5">
        <div class="row pt-5">
            <div class="col-lg-3 col-md-6 mb-5">
                <h4 class="text-primary mb-4">Get In Touch</h4>
                <p><i class="fa fa-map-marker-alt mr-2"></i>Indore,India</p>
                <p><i class="fa fa-phone-alt mr-2"></i>+91 9826672029</p>
                <p><i class="fa fa-envelope mr-2"></i>prasoonbhargava71694@gmail,com</p>
                <div class="d-flex justify-content-start mt-4">
                    <a class="btn btn-outline-light rounded-circle text-center mr-2 px-0" style="width: 38px; height: 38px;" href="#"><i class="fab fa-twitter"></i></a>
                    <a class="btn btn-outline-light rounded-circle text-center mr-2 px-0" style="width: 38px; height: 38px;" href="#"><i class="fab fa-facebook-f"></i></a>
                    <a class="btn btn-outline-light rounded-circle text-center mr-2 px-0" style="width: 38px; height: 38px;" href="#"><i class="fab fa-linkedin-in"></i></a>
                    <a class="btn btn-outline-light rounded-circle text-center mr-2 px-0" style="width: 38px; height: 38px;" href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 mb-5">
                <h4 class="text-primary mb-4">Quick Links</h4>
                <div class="d-flex flex-column justify-content-start">
                    <a class="text-white mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Home</a>
                    <a class="text-white mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>About Us</a>
                    <a class="text-white mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Our Services</a>
                    <a class="text-white mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Our Projects</a>
                    <a class="text-white" href="#"><i class="fa fa-angle-right mr-2"></i>Contact Us</a>
                </div>
            </div>
            
            
            
        </div>
        <div class="container border-top border-secondary pt-5">
            <p class="m-0 text-center text-white">
                &copy; <a class="text-white font-weight-bold" href="#"> HOSTLER'S</a>. All Rights Reserved. Designed by
                <a class="text-white font-weight-bold" href="">Prasoon Bhargava</a>
            </p>
        </div>
    </div>
        <!-- Footer End -->


        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>


        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="lib/isotope/isotope.pkgd.min.js"></script>
        <script src="lib/lightbox/js/lightbox.min.js"></script>

        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>

</html>