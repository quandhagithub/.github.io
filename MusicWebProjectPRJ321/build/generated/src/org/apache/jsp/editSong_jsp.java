package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editSong_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Songs</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"description\" content=\"Colorlib Templates\">\r\n");
      out.write("<meta name=\"author\" content=\"Colorlib\">\r\n");
      out.write("<meta name=\"keywords\" content=\"Colorlib Templates\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"description\" content=\"Mixtape template project\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap-4.1.2/bootstrap.min.css\">\r\n");
      out.write("<link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/song.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/song_responsive.css\">\r\n");
      out.write("<link href=\"css/droplist.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- Icons font CSS-->\r\n");
      out.write("    <link href=\"Register/vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"Register/vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <!-- Font special for pages-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor CSS-->\r\n");
      out.write("    <link href=\"Register/vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"Register/vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main CSS-->\r\n");
      out.write("    <link href=\"Register/css/Editsong.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"super_container\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Home -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"home\">\r\n");
      out.write("\t\t<div class=\"home_inner\">\r\n");
      out.write("\t\t\t<div class=\"parallax_background parallax-window\" data-parallax=\"scroll\" data-image-src=\"images/single.jpg\" data-speed=\"0.8\"></div>\r\n");
      out.write("\t\t\t<div class=\"home_container\">\r\n");
      out.write("\t\t\t\t<div class=\"home_content text-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"home_subtitle\">Clowns</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"home_title\">Edit Songs Page</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t <div class=\"page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins\">\r\n");
      out.write("        <div class=\"wrapper wrapper--w780\">\r\n");
      out.write("            <div class=\"card card-3\">\r\n");
      out.write("                <div class=\"card-heading\"></div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h2 class=\"title\">Song Info</h2>\r\n");
      out.write("                    <form method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("                            <input class=\"input--style-3\" type=\"text\" placeholder=\"ID\" name=\"id\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input class=\"input--style-3\" type=\"text\" placeholder=\"Name\" name=\"name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("                            <input class=\"input--style-3\" type=\"text\" placeholder=\"Source\" name=\"source\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"p-t-10\">\r\n");
      out.write("                            <button class=\"btn btn--pill btn--green\" type=\"submit\">Submit</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"styles/bootstrap-4.1.2/popper.js\"></script>\r\n");
      out.write("<script src=\"styles/bootstrap-4.1.2/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/greensock/TweenMax.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/greensock/TimelineMax.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/scrollmagic/ScrollMagic.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/greensock/animation.gsap.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/greensock/ScrollToPlugin.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\r\n");
      out.write("<script src=\"plugins/easing/easing.js\"></script>\r\n");
      out.write("<script src=\"plugins/progressbar/progressbar.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/parallax-js-master/parallax.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/jPlayer/jquery.jplayer.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/jPlayer/jplayer.playlist.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/fit-vids/jquery.fitvids.js\"></script>\r\n");
      out.write("<script src=\"js/single.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Jquery JS-->\r\n");
      out.write("<script src=\"Register/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- Vendor JS-->\r\n");
      out.write("<script src=\"Register/vendor/select2/select2.min.js\"></script>\r\n");
      out.write("<script src=\"Register/vendor/datepicker/moment.min.js\"></script>\r\n");
      out.write("<script src=\"Register/vendor/datepicker/daterangepicker.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Main JS-->\r\n");
      out.write("<script src=\"js/global.js\"></script>\r\n");
      out.write("</body>\r\n");
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
