package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class songAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Songs Management</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"description\" content=\"Mixtape template project\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap-4.1.2/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/song.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/song_responsive.css\">\r\n");
      out.write("        <link href=\"css/droplist.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"super_container\">\r\n");
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerAdmin.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- Home -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"home\">\r\n");
      out.write("                <div class=\"home_inner\">\r\n");
      out.write("                    <div class=\"parallax_background parallax-window\" data-parallax=\"scroll\" data-image-src=\"images/single.jpg\" data-speed=\"0.8\"></div>\r\n");
      out.write("                    <div class=\"home_container\">\r\n");
      out.write("                        <div class=\"home_content text-center\">\r\n");
      out.write("                            <div class=\"home_subtitle\">Clowns</div>\r\n");
      out.write("                            <div class=\"home_title\">Songs Managing Page</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button onclick=\"topFunction()\" id=\"myBtn\" title=\"Go to top\">Top</button>\r\n");
      out.write("            <!-- Single -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"single\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h2>List Users</h2>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"list-group\">\r\n");
      out.write("\r\n");
      out.write("                        <table id=\"someTable\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <a href=\"addSong.jsp\">\r\n");
      out.write("                                        <button id=\"someButton\">Add</button>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tfoot>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td valign=\"bottom\" align=\"right\">\r\n");
      out.write("                            <li class=\"list-group-item\">First item<button id=\"someButton\">Edit</button> <button id=\"someButton\">Delete</button></li>\r\n");
      out.write("                            <li class=\"list-group-item\">Second item<button id=\"someButton\">Edit</button> <button id=\"someButton\">Delete</button></li>\r\n");
      out.write("                            <li class=\"list-group-item\">Third item<button id=\"someButton\">Edit</button> <button id=\"someButton\">Delete</button></li>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            </tfoot>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                //Get the button\r\n");
      out.write("                var mybutton = document.getElementById(\"myBtn\");\r\n");
      out.write("\r\n");
      out.write("                // When the user scrolls down 20px from the top of the document, show the button\r\n");
      out.write("                window.onscroll = function () {\r\n");
      out.write("                    scrollFunction()\r\n");
      out.write("                };\r\n");
      out.write("\r\n");
      out.write("                function scrollFunction() {\r\n");
      out.write("                    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {\r\n");
      out.write("                        mybutton.style.display = \"block\";\r\n");
      out.write("                    } else {\r\n");
      out.write("                        mybutton.style.display = \"none\";\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // When the user clicks on the button, scroll to the top of the document\r\n");
      out.write("                function topFunction() {\r\n");
      out.write("                    document.body.scrollTop = 0;\r\n");
      out.write("                    document.documentElement.scrollTop = 0;\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <script src=\"styles/bootstrap-4.1.2/popper.js\"></script>\r\n");
      out.write("        <script src=\"styles/bootstrap-4.1.2/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/greensock/TweenMax.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/greensock/TimelineMax.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/scrollmagic/ScrollMagic.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/greensock/animation.gsap.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/greensock/ScrollToPlugin.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\r\n");
      out.write("        <script src=\"plugins/easing/easing.js\"></script>\r\n");
      out.write("        <script src=\"plugins/progressbar/progressbar.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/parallax-js-master/parallax.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/jPlayer/jquery.jplayer.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/jPlayer/jplayer.playlist.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/fit-vids/jquery.fitvids.js\"></script>\r\n");
      out.write("        <script src=\"js/single.js\"></script>\r\n");
      out.write("    </body>\r\n");
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
