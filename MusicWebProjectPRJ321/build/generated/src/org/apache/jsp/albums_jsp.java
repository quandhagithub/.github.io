package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class albums_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_a_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_a_action.release();
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_param_value_name_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>About us</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"description\" content=\"Mixtape template project\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap-4.1.2/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/albums.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/albums_responsive.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"super_container\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Header -->\r\n");
      out.write("            <header class=\"header\">\r\n");
      out.write("                <div class=\"header_content d-flex flex-row align-items-center justify-content-center\">\r\n");
      out.write("                    <div class=\"logo\"><a href=\"#\">ClownsMusik</a></div>\r\n");
      out.write("                    <div class=\"log_reg\">\r\n");
      out.write("                        <ul class=\"d-flex flex-row align-items-start justify-content-start\">\r\n");
      out.write("                            <li><a href=\"Login/login.jsp\" >Login</a></li>\r\n");
      out.write("                            <li><a href=\"Register/register.jsp\">Register</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <nav class=\"main_nav\">\r\n");
      out.write("                        <ul class=\"d-flex flex-row align-items-start justify-content-start\">\r\n");
      out.write("                            <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                            <li class=\"active\"><a href=\"albums.jsp\">Albums</a></li>\r\n");
      out.write("                            <li><a href=\"song.jsp\">Songs</a></li>\r\n");
      out.write("                            <li><a href=\"playlist.jsp\">PlayLists</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <nav class=\"search_menu\">\r\n");
      out.write("                                    <form method=\"get\" action=\"/search\" id=\"search\">\r\n");
      out.write("                                        <input name=\"q\" type=\"text\" size=\"40\" placeholder=\"Search...\" />\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <div class=\"hamburger ml-auto\">\r\n");
      out.write("                        <div class=\"d-flex flex-column align-items-end justify-content-between\">\r\n");
      out.write("                            <div></div>\r\n");
      out.write("                            <div></div>\r\n");
      out.write("                            <div></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Menu -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"menu\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"menu_overlay\"></div>\r\n");
      out.write("                    <div class=\"menu_container d-flex flex-column align-items-start justify-content-center\">\r\n");
      out.write("                        <div class=\"menu_log_reg\">\r\n");
      out.write("                            <ul class=\"d-flex flex-row align-items-start justify-content-start\">\r\n");
      out.write("                                <li><a href=\"#\">Login</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Register</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <nav class=\"menu_nav\">\r\n");
      out.write("                            <ul class=\"d-flex flex-column align-items-start justify-content-start\">\r\n");
      out.write("                                <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                                <li><a href=\"about.jsp\">About us</a></li>\r\n");
      out.write("                                <li><a href=\"music.jsp\">Music</a></li>\r\n");
      out.write("                                <li><a href=\"blog.jsp\">News</a></li>\r\n");
      out.write("                                <li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Home -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"home\">\r\n");
      out.write("                <div class=\"home_inner\">\r\n");
      out.write("                    <!-- Image artist: https://unsplash.com/@yoannboyer -->\r\n");
      out.write("                    <div class=\"parallax_background parallax-window\" data-parallax=\"scroll\" data-image-src=\"images/about.jpg\" data-speed=\"0.8\"></div>\r\n");
      out.write("                    <div class=\"home_container\">\r\n");
      out.write("                        <div class=\"home_content text-center\">\r\n");
      out.write("                            <div class=\"home_subtitle\">áº¢o hÃ³a thÃ nh áº£nh, Äáº£ kÃ­ch tÃ  gian</div>\r\n");
      out.write("                            <div class=\"home_title\">Ninpuu Sentai Hurricanger</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Discs -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"discs\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row discs_row\">\r\n");
      out.write("                        ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <div class=\"footer_container d-flex flex-xl-row flex-column align-items-start justify-content-start\">\r\n");
      out.write("                    <div class=\"newsletter_container\">\r\n");
      out.write("                        <div class=\"newsletter_title\"><h2>Subscribe to our newsletter</h2></div>\r\n");
      out.write("                        <form action=\"#\" id=\"newsletter_form\" class=\"newsletter_form\">\r\n");
      out.write("                            <input type=\"email\" class=\"newsletter_input\" placeholder=\"Your E-mail\" required=\"required\">\r\n");
      out.write("                            <button class=\"newsletter_button\">Subscribe</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"footer_lists d-flex flex-sm-row  flex-column align-items-start justify-content-start ml-xl-auto\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Useful Links -->\r\n");
      out.write("                        <div class=\"footer_list\">\r\n");
      out.write("                            <div class=\"footer_list_title\">Links</div>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <a href=\"index.jsp\">Home</a>\r\n");
      out.write("                                <a href=\"about.jsp\">Albums</a>\r\n");
      out.write("                                <a href=\"#\">Songs</a>\r\n");
      out.write("                                <a href=\"blog.jsp\">News</a>\r\n");
      out.write("                                <a href=\"#\">Return to top</a>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"copyright_bar\">\r\n");
      out.write("                    <span>\r\n");
      out.write("                        <script>document.write(new Date().getFullYear());</script> Sincere with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> from our team.\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
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
      out.write("        <script src=\"js/about.js\"></script>\r\n");
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

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("dsalbum");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                            <!-- Disc -->\r\n");
        out.write("                            <div class=\"col-xl-4 col-md-6\">\r\n");
        out.write("                                <div class=\"disc\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_s_a_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\t\t\t\t\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_a_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_action.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_a_0.setAction("songofalbum");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_s_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        <div class=\"disc_image\"><img src=\"");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_0, _jspx_page_context))
          return true;
        out.write("\" alt=\"google.com.vn\"></div>\r\n");
        out.write("                                        <div class=\"disc_container\">\r\n");
        out.write("                                            <div>\r\n");
        out.write("                                                <div class=\"disc_content_2 d-flex flex-column align-items-center justify-content-center\">\r\n");
        out.write("                                                    <div class=\"disc_title\">");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                                                    <div class=\"disc_subtitle\">");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                                                    <div class=\"disc_subtitle\">");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_action.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_action.reuse(_jspx_th_s_a_0);
    return false;
  }

  private boolean _jspx_meth_s_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_0 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_value_name_nobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_0.setPageContext(_jspx_page_context);
    _jspx_th_s_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_0);
    _jspx_th_s_param_0.setName("IDSongOfAlbum");
    _jspx_th_s_param_0.setValue("#ID");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_value_name_nobody.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_0);
    _jspx_th_s_property_0.setValue("path");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_0);
    _jspx_th_s_property_1.setValue("title");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_0);
    _jspx_th_s_property_2.setValue("author");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_0);
    _jspx_th_s_property_3.setValue("genre");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }
}
