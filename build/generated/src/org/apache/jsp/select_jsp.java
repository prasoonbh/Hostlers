package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UserdaoT;
import java.util.Iterator;
import java.util.List;
import dto.UserDTO;
import dao.UserDAO;

public final class select_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Hostler's | Home</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <!-- Google Web Fonts -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat&family=Oswald:wght@400;500;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Flaticon Font -->\n");
      out.write("    <link href=\"lib/flaticon/font/flaticon.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Libraries Stylesheet -->\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Topbar Start -->\n");
      out.write("    <div class=\"container-fluid bg-dark py-3\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 text-center text-lg-left mb-2 mb-lg-0\">\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                        <a class=\"text-white pr-3\" href=\"\">FAQs</a>\n");
      out.write("                        <span class=\"text-white\">|</span>\n");
      out.write("                        <a class=\"text-white px-3\" href=\"\">Help</a>\n");
      out.write("                        <span class=\"text-white\">|</span>\n");
      out.write("                        <a class=\"text-white pl-3\" href=\"\">Support</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 text-center text-lg-right\">\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                        <a class=\"text-white px-3\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"text-white px-3\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-twitter\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"text-white px-3\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"text-white px-3\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-instagram\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"text-white pl-3\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-youtube\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Topbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Navbar Start -->\n");
      out.write("    <div class=\"container-fluid position-relative nav-bar p-0\">\n");
      out.write("        <div class=\"container position-relative\" style=\"z-index: 9;\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-secondary navbar-dark py-3 py-lg-0 pl-3 pl-lg-5\">\n");
      out.write("                <a href=\"\" class=\"navbar-brand\">\n");
      out.write("                    <h1 class=\"m-0 display-5 text-white\"><span class=\"text-primary\"></span>HOSTLER'S</h1>\n");
      out.write("                </a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-between px-3\" id=\"navbarCollapse\">\n");
      out.write("                      <div class=\"navbar-nav ml-auto py-0\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                        <a href=\"searchhostel.jsp\" class=\"nav-item nav-link\">Search Hostel</a>\n");
      out.write("                        <a href=\"service.jsp\" class=\"nav-item nav-link\">Service</a>\n");
      out.write("                        <a href=\"project.jsp\" class=\"nav-item nav-link\">Project</a><a href=\"contact.jsp\" class=\"nav-item nav-link\">Contact</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Navbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Under Nav Start -->\n");
      out.write("    <div class=\"container-fluid bg-white py-3\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4 text-left mb-3 mb-lg-0\">\n");
      out.write("                    <div class=\"d-inline-flex text-left\">\n");
      out.write("                        <h1 class=\"flaticon-office font-weight-normal text-primary m-0 mr-3\"></h1>\n");
      out.write("                        <div class=\"d-flex flex-column\">\n");
      out.write("                            <h5>Our Office</h5>\n");
      out.write("                            <p class=\"m-0\">Indore,India</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 text-left text-lg-center mb-3 mb-lg-0\">\n");
      out.write("                    <div class=\"d-inline-flex text-left\">\n");
      out.write("                        <h1 class=\"flaticon-email font-weight-normal text-primary m-0 mr-3\"></h1>\n");
      out.write("                        <div class=\"d-flex flex-column\">\n");
      out.write("                            <h5>Email Us</h5>\n");
      out.write("                            <p class=\"m-0\">prasoonbhargava71694@gmail.com</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 text-left text-lg-right mb-3 mb-lg-0\">\n");
      out.write("                    <div class=\"d-inline-flex text-left\">\n");
      out.write("                        <h1 class=\"flaticon-telephone font-weight-normal text-primary m-0 mr-3\"></h1>\n");
      out.write("                        <div class=\"d-flex flex-column\">\n");
      out.write("                            <h5>Call Us</h5>\n");
      out.write("                            <p class=\"m-0\">+91 9826672029</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Under Nav End -->\n");
      out.write("\n");
      out.write("<!-- Carousel Start -->\n");
      out.write("    <div class=\"container-fluid p-0\">\n");
      out.write("        <div id=\"header-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"w-100\" src=\"images/download.jpeg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 800px;\">\n");
      out.write("                            <h4 class=\"text-primary text-uppercase font-weight-normal mb-md-3\">Creative Interior Design</h4>\n");
      out.write("                            <h3 class=\"display-3 text-white mb-md-4\">Make Your Home Better</h3>\n");
      out.write("                            <a href=\"\" class=\"btn btn-primary py-md-3 px-md-5 mt-2 mt-md-4\">Learn More</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"w-100\" src=\"images/image1.jpeg\" alt=\"Image\">\n");
      out.write("                    <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                        <div class=\"p-3\" style=\"max-width: 800px;\">\n");
      out.write("                            <h4 class=\"text-primary text-uppercase font-weight-normal mb-md-3\">Creative Interior Design</h4>\n");
      out.write("                            <h3 class=\"display-3 text-white mb-md-4\">Stay At Home In Peace</h3>\n");
      out.write("                            <a href=\"\" class=\"btn btn-primary py-md-3 px-md-5 mt-2 mt-md-4\">Learn More</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#header-carousel\" data-slide=\"prev\">\n");
      out.write("                <div class=\"btn btn-primary\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon mb-n2\"></span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#header-carousel\" data-slide=\"next\">\n");
      out.write("                <div class=\"btn btn-primary\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                    <span class=\"carousel-control-next-icon mb-n2\"></span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Carousel End -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- About Start -->\n");
      out.write("    <div class=\"container-fluid bg-light\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-5\">\n");
      out.write("                    <div class=\"d-flex flex-column align-items-center justify-content-center bg-primary h-100 py-5 px-3\">\n");
      out.write("                        <i class=\"flaticon-brickwall display-1 font-weight-normal text-secondary mb-3\"></i>\n");
      out.write("                        <h4 class=\"display-3 mb-3\">25+</h4>\n");
      out.write("                        <h1 class=\"m-0\">Years of Service</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-7 m-0 my-lg-5 pt-5 pb-5 pb-lg-2 pl-lg-5\">\n");
      out.write("                    <h6 class=\"text-primary font-weight-normal text-uppercase mb-3\">Innovative way to get your Hostel</h6>\n");
      out.write("                    <h1 class=\"mb-4 section-title\">Providing best way to get search your hostel</h1>\n");
      out.write("                    <p></p>\n");
      out.write("                    <div class=\"row py-2\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"d-flex align-items-center mb-4\">\n");
      out.write("                                <h1 class=\"flaticon-house font-weight-normal text-primary m-0 mr-3\"></h1>\n");
      out.write("                                <h5 class=\"text-truncate m-0\">Hostler's Pay</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"d-flex align-items-center mb-4\">\n");
      out.write("                                <h1 class=\"flaticon-stairs font-weight-normal text-primary m-0 mr-3\"></h1>\n");
      out.write("                                <h5 class=\"text-truncate m-0\">Easy access to hostels</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"d-flex align-items-center mb-4\">\n");
      out.write("                                <h1 class=\"flaticon-office font-weight-normal text-primary m-0 mr-3\"></h1>\n");
      out.write("                                <h5 class=\"text-truncate m-0\">Furnished rooms</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"d-flex align-items-center mb-4\">\n");
      out.write("                                <h1 class=\"flaticon-living-room font-weight-normal text-primary m-0 mr-3\"></h1>\n");
      out.write("                                <h5 class=\"text-truncate m-0\"> 24hrs Mess facility  </h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- About End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Services Start -->\n");
      out.write("    <div class=\"container-fluid py-5\">\n");
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 pr-lg-5\">\n");
      out.write("                    <h6 class=\"text-primary font-weight-normal text-uppercase mb-3\">Our Awesome Services</h6>\n");
      out.write("                    <h1 class=\"mb-4 section-title\">Awesome Interior Designing Services For Your Home</h1>\n");
      out.write("                    <p>Invidunt lorem justo clita. Erat lorem labore ea, justo dolor lorem ipsum ut sed eos, ipsum et dolor kasd sit ea justo. Erat justo sed sed diam. Ea et erat ut sed diam sea ipsum</p>\n");
      out.write("                    <a href=\"\" class=\"btn btn-primary mt-3 py-2 px-4\">View More</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 p-0 pt-5 pt-lg-0\">\n");
      out.write("                    <div class=\"owl-carousel service-carousel position-relative\">\n");
      out.write("                        <div class=\"d-flex flex-column text-center bg-light mx-3 p-4\">\n");
      out.write("                            <h3 class=\"flaticon-bedroom display-3 font-weight-normal text-primary mb-3\"></h3>\n");
      out.write("                            <h5 class=\"mb-3\">Bedroom Design</h5>\n");
      out.write("                            <p class=\"m-0\">Diam amet eos at no eos sit lorem, amet rebum ipsum clita stet, diam sea est diam eos</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-flex flex-column text-center bg-light mx-3 p-4\">\n");
      out.write("                            <h3 class=\"flaticon-kitchen display-3 font-weight-normal text-primary mb-3\"></h3>\n");
      out.write("                            <h5 class=\"mb-3\">Kitchen Design</h5>\n");
      out.write("                            <p class=\"m-0\">Diam amet eos at no eos sit lorem, amet rebum ipsum clita stet, diam sea est diam eos</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-flex flex-column text-center bg-light mx-3 p-4\">\n");
      out.write("                            <h3 class=\"flaticon-bathroom display-3 font-weight-normal text-primary mb-3\"></h3>\n");
      out.write("                            <h5 class=\"mb-3\">Bathroom Design</h5>\n");
      out.write("                            <p class=\"m-0\">Diam amet eos at no eos sit lorem, amet rebum ipsum clita stet, diam sea est diam eos</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Services End -->\n");
      out.write("\n");

   String pincode = (String)session.getAttribute("pincode");
   String name = (String)session.getAttribute("name");
           
           if(pincode==null)
           {
               response.sendRedirect("Search.jsp");
           }
           else
           {
            
            UserDAO udao = new UserDAO();
            List<UserDTO>listOfUsers= udao.getAllUserData(pincode);
            Iterator<UserDTO> itr =  listOfUsers.iterator();
            }

      out.write("\n");
      out.write("    <!-- Features Start -->\n");
      out.write("    <div class=\"container-fluid bg-light\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-7 mt-5 py-5 pr-lg-5\">\n");
      out.write("                   <table border=\"6px\" width=\"85\" align=\"center\"> \n");
      out.write("                       <p>Hello ");
      out.print(name);
      out.write("</p>\n");
      out.write("                <tr>\n");
      out.write("                    <td><strong>hostel name</strong></td>\n");
      out.write("                    <td><strong>name</strong></td>\n");
      out.write("                    <td><strong>Contact</strong></td>\n");
      out.write("                    <td><strong> Hostel Address</strong></td>\n");
      out.write("                    <td><strong>Email</strong></td>\n");
      out.write("                    <td><strong>Charges</strong></td>\n");
      out.write("                    <td><strong>Furnished</strong></td>\n");
      out.write("                    <td><strong> Convence Facility </strong></td>\n");
      out.write("                    <td><strong> Medical Facility</strong></td>\n");
      out.write("                   <td><strong>Banking facility</strong></td>\n");
      out.write("                   <td><strong>Mess Facility</strong></td>\n");
      out.write("                   <td> <strong>SELECT</strong></td>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                  \n");
      out.write("                ");

                    UserDAO udao = new UserDAO();
            List<UserDTO>listOfUsers= udao.getAllUserData(pincode);
            Iterator<UserDTO> itr =  listOfUsers.iterator();
                
      out.write("\n");
      out.write("                \n");
      out.write("                ");
                   
                   while(itr.hasNext()) 
                   {
                        UserDTO user = itr.next();
                
      out.write("\n");
      out.write("                <form action=\"\" method=\"post\" >    \n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getHostelname());
      out.write("\" name=\"hostelname\"><strong>");
      out.print(user.getHostelname());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getName());
      out.write("\"  name=\"name\"><strong>");
      out.print(user.getName());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getContact());
      out.write("\" name=\"contact\"><strong>");
      out.print(user.getContact());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getHosteladdress());
      out.write("\" name=\"hosteladdress\"><strong>");
      out.print(user.getHosteladdress());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getEmail());
      out.write("\" name=\"email\"><strong>");
      out.print(user.getEmail());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getCharges());
      out.write("\" name=\"charges\"><strong>");
      out.print(user.getCharges());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getFurnished());
      out.write("\" name=\"furnished\"><strong>");
      out.print(user.getFurnished());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getConvencefacility());
      out.write("\" name=\"convencefacility\"><strong>");
      out.print(user.getConvencefacility());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getMedicalfacility());
      out.write("\" name=\"medicalfacility\"><strong>");
      out.print(user.getMedicalfacility());
      out.write("</strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getBankingfacility());
      out.write("\" name=\"bankingfacility\"><strong> ");
      out.print(user.getBankingfacility());
      out.write(" </strong></td>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(user.getMessfacility());
      out.write("\" name=\"messfacility\"><strong>");
      out.print(user.getMessfacility());
      out.write("</strong></td>     \n");
      out.write("                    <td><button class=\"btn btn-lg btn-primary btn-block border-0\" type=\"submit\" >Select</button></td>\n");
      out.write("                </tr>\n");
      out.write("             </form>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5\">\n");
      out.write("                    <div class=\"d-flex flex-column align-items-center justify-content-center h-100 overflow-hidden\">\n");
      out.write("                        <img class=\"h-100\" src=\"img/feature.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Features End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Projects Start -->\n");
      out.write("    <!-- Projects End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Team Start -->\n");
      out.write("    <!-- Team End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Testimonial Start -->\n");
      out.write("    <!-- Testimonial End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Blog Start -->\n");
      out.write("   \n");
      out.write("    <!-- Blog End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Footer Start -->\n");
      out.write("    <div class=\"container-fluid bg-dark text-white py-5 px-sm-3 px-md-5\">\n");
      out.write("        <div class=\"row pt-5\">\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-5\">\n");
      out.write("                <h4 class=\"text-primary mb-4\">Get In Touch</h4>\n");
      out.write("                <p><i class=\"fa fa-map-marker-alt mr-2\"></i>123 Street, New York, USA</p>\n");
      out.write("                <p><i class=\"fa fa-phone-alt mr-2\"></i>+012 345 67890</p>\n");
      out.write("                <p><i class=\"fa fa-envelope mr-2\"></i>info@example.com</p>\n");
      out.write("                <div class=\"d-flex justify-content-start mt-4\">\n");
      out.write("                    <a class=\"btn btn-outline-light rounded-circle text-center mr-2 px-0\" style=\"width: 38px; height: 38px;\" href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-light rounded-circle text-center mr-2 px-0\" style=\"width: 38px; height: 38px;\" href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-light rounded-circle text-center mr-2 px-0\" style=\"width: 38px; height: 38px;\" href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-light rounded-circle text-center mr-2 px-0\" style=\"width: 38px; height: 38px;\" href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-5\">\n");
      out.write("                <h4 class=\"text-primary mb-4\">Quick Links</h4>\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                    <a class=\"text-white mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                    <a class=\"text-white mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>About Us</a>\n");
      out.write("                    <a class=\"text-white mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Services</a>\n");
      out.write("                    <a class=\"text-white mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Projects</a>\n");
      out.write("                    <a class=\"text-white\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-5\">\n");
      out.write("                <h4 class=\"text-primary mb-4\">Popular Links</h4>\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                    <a class=\"text-white mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                    <a class=\"text-white mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>About Us</a>\n");
      out.write("                    <a class=\"text-white mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Services</a>\n");
      out.write("                    <a class=\"text-white mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Projects</a>\n");
      out.write("                    <a class=\"text-white\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-5\">\n");
      out.write("                <h4 class=\"text-primary mb-4\">Newsletter</h4>\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control border-0\" placeholder=\"Your Name\" required=\"required\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"email\" class=\"form-control border-0\" placeholder=\"Your Email\" required=\"required\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <button class=\"btn btn-lg btn-primary btn-block border-0\" type=\"submit\">Submit Now</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container border-top border-secondary pt-5\">\n");
      out.write("            <p class=\"m-0 text-center text-white\">\n");
      out.write("                &copy; <a class=\"text-white font-weight-bold\" href=\"#\">Your Site Name</a>. All Rights Reserved. Designed by\n");
      out.write("                <a class=\"text-white font-weight-bold\" href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Back to Top -->\n");
      out.write("    <a href=\"#\" class=\"btn btn-lg btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- JavaScript Libraries -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"lib/isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("    <script src=\"lib/lightbox/js/lightbox.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Contact Javascript File -->\n");
      out.write("    <script src=\"mail/jqBootstrapValidation.min.js\"></script>\n");
      out.write("    <script src=\"mail/contact.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Template Javascript -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
