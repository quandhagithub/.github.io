package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class song_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_param_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_param_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_s_a_action.release();
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_param_name.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_else.release();
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
      out.write("        <title>Songs</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"description\" content=\"Mixtape template project\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap-4.1.2/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/song1.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/song_responsive.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"super_container\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Header -->\r\n");
      out.write("            ");
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_s_else_0(_jspx_page_context))
        return;
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
      out.write("                    <div class=\"parallax_background parallax-window\" data-parallax=\"scroll\" data-image-src=\"images/single.jpg\" data-speed=\"0.8\"></div>\r\n");
      out.write("                    <div class=\"home_container\">\r\n");
      out.write("                        <div class=\"home_content text-center\">\r\n");
      out.write("                            <div class=\"home_subtitle\">Clowns</div>\r\n");
      out.write("                            <div class=\"home_title\">The Single</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Single -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"single\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Single Info -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <!-- Single Content -->\r\n");
      out.write("                        <div class=\"col-lg-7 single_content_col\">\r\n");
      out.write("                            <div class=\"single_content\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"single_players\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
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
      out.write("        <!--        <script src=\"js/single.js\"></script>-->\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function ()\r\n");
      out.write("            {\r\n");
      out.write("                \"use strict\";\r\n");
      out.write("\r\n");
      out.write("                /* \r\n");
      out.write("                 \r\n");
      out.write("                 1. Vars and Inits\r\n");
      out.write("                 \r\n");
      out.write("                 */\r\n");
      out.write("\r\n");
      out.write("                var header = $('.header');\r\n");
      out.write("                var ctrl = new ScrollMagic.Controller();\r\n");
      out.write("\r\n");
      out.write("                initMenu();\r\n");
      out.write("                initSinglePlayer();\r\n");
      out.write("                initFitVids();\r\n");
      out.write("\r\n");
      out.write("                setHeader();\r\n");
      out.write("\r\n");
      out.write("                $(window).on('resize', function ()\r\n");
      out.write("                {\r\n");
      out.write("                    setHeader();\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $(document).on('scroll', function ()\r\n");
      out.write("                {\r\n");
      out.write("                    setHeader();\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                /* \r\n");
      out.write("                 \r\n");
      out.write("                 2. Set Header\r\n");
      out.write("                 \r\n");
      out.write("                 */\r\n");
      out.write("\r\n");
      out.write("                function setHeader()\r\n");
      out.write("                {\r\n");
      out.write("                    if ($(window).scrollTop() > 91)\r\n");
      out.write("                    {\r\n");
      out.write("                        header.addClass('scrolled');\r\n");
      out.write("                    } else\r\n");
      out.write("                    {\r\n");
      out.write("                        header.removeClass('scrolled');\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                /* \r\n");
      out.write("                 \r\n");
      out.write("                 3. Init Menu\r\n");
      out.write("                 \r\n");
      out.write("                 */\r\n");
      out.write("\r\n");
      out.write("                function initMenu()\r\n");
      out.write("                {\r\n");
      out.write("                    if ($('.menu').length)\r\n");
      out.write("                    {\r\n");
      out.write("                        var hamb = $('.hamburger');\r\n");
      out.write("                        var menu = $('.menu');\r\n");
      out.write("                        var menuOverlay = $('.menu_overlay');\r\n");
      out.write("\r\n");
      out.write("                        hamb.on('click', function ()\r\n");
      out.write("                        {\r\n");
      out.write("                            menu.addClass('active');\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                        menuOverlay.on('click', function ()\r\n");
      out.write("                        {\r\n");
      out.write("                            menu.removeClass('active');\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                /* \r\n");
      out.write("                 \r\n");
      out.write("                 4. Init Single Player\r\n");
      out.write("                 \r\n");
      out.write("                 */\r\n");
      out.write("\r\n");
      out.write("                function initSinglePlayer()\r\n");
      out.write("                {\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                /* \r\n");
      out.write("                 \r\n");
      out.write("                 5. Init Fitvids\r\n");
      out.write("                 \r\n");
      out.write("                 */\r\n");
      out.write("\r\n");
      out.write("                function initFitVids()\r\n");
      out.write("                {\r\n");
      out.write("                    if ($('.video_container').length)\r\n");
      out.write("                    {\r\n");
      out.write("                        $('.video_container').fitVids();\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
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

  private boolean _jspx_meth_s_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent(null);
    _jspx_th_s_if_0.setTest("%{!#session.USERNAME.isEmpty()}");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerUser.jsp", out, false);
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
    return false;
  }

  private boolean _jspx_meth_s_else_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_0 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_0.setPageContext(_jspx_page_context);
    _jspx_th_s_else_0.setParent(null);
    int _jspx_eval_s_else_0 = _jspx_th_s_else_0.doStartTag();
    if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerGuest.jsp", out, false);
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_else_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("dss");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        <!-- Single Player -->\r\n");
        out.write("                                        <div class=\"single_player_container d-flex flex-column align-items-start justify-content-center\">\r\n");
        out.write("                                            <div class=\"single_player\">\r\n");
        out.write("                                                <div id=\"");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" class=\"jp-jplayer\"></div>\r\n");
        out.write("                                                <div id=\"");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" class=\"jp-audio\" role=\"application\" aria-label=\"media player\">\r\n");
        out.write("                                                    <div class=\"jp-type-single\">\r\n");
        out.write("                                                        <div class=\"player_details d-flex flex-row align-items-center justify-content-start\">\r\n");
        out.write("                                                            <div class=\"jp-details\">\r\n");
        out.write("                                                                <div>playing</div>\r\n");
        out.write("                                                                <div class=\"jp-title\" aria-label=\"title\">&nbsp;</div>\r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                            <div class=\"jp-controls-holder ml-auto\">\r\n");
        out.write("                                                                <button class=\"jp-play\" tabindex=\"0\"></button>\r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                        </div>\r\n");
        out.write("                                                        <div class=\"player_controls\">\r\n");
        out.write("                                                            <div class=\"jp-gui jp-interface d-flex flex-row align-items-center justify-content-start\">\r\n");
        out.write("                                                                <div class=\"jp-controls-holder time_controls d-flex flex-row align-items-center justify-content-start\">\r\n");
        out.write("                                                                    <div><div class=\"jp-current-time\" role=\"timer\" aria-label=\"time\">&nbsp;</div></div>\r\n");
        out.write("                                                                    <div class=\"jp-progress\">\r\n");
        out.write("                                                                        <div class=\"jp-seek-bar\">\r\n");
        out.write("                                                                            <div class=\"jp-play-bar\"></div>\r\n");
        out.write("                                                                        </div>\r\n");
        out.write("                                                                    </div>\r\n");
        out.write("                                                                    <div><div class=\"jp-duration ml-auto\" role=\"timer\" aria-label=\"duration\">&nbsp;</div></div>\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                                <div class=\"jp-volume-controls d-flex flex-row align-items-center justify-content-start ml-auto\">\r\n");
        out.write("                                                                    <button class=\"jp-mute\" tabindex=\"0\"></button>\r\n");
        out.write("                                                                    <div class=\"jp-volume-bar\">\r\n");
        out.write("                                                                        <div class=\"jp-volume-bar-value\"></div>\r\n");
        out.write("                                                                    </div>\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                                <div>\r\n");
        out.write("                                                                    ");
        if (_jspx_meth_s_a_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                            </div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                        </div>\r\n");
        out.write("                                                        <div class=\"jp-no-solution\">\r\n");
        out.write("                                                            <span>Update Required</span>\r\n");
        out.write("                                                            To play the media you will need to either update your browser to a recent version or update your <a href=\"http://get.adobe.com/flashplayer/\" target=\"_blank\">Flash plugin</a>\r\n");
        out.write("                                                        </div>\r\n");
        out.write("                                                    </div>\r\n");
        out.write("                                                </div>\r\n");
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_0.setValue("ID");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_1.setValue("ID2");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
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
    _jspx_th_s_a_0.setAction("favorite");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("                                                         \r\n");
        out.write("                                                                        ");
        if (_jspx_meth_s_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                        ");
        if (_jspx_meth_s_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_a_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                                        <button style=\"margin-left: 30px\" class=\"favorite_button\" type=\"submit\" tabindex=\"0\"></button>\r\n");
        out.write("                                                                    ");
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
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_0 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_0.setPageContext(_jspx_page_context);
    _jspx_th_s_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_0);
    _jspx_th_s_param_0.setName("songId");
    int _jspx_eval_s_param_0 = _jspx_th_s_param_0.doStartTag();
    if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_0.doInitBody();
      }
      do {
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_param_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_param_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_0);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_0);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_param_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_param_0);
    _jspx_th_s_property_2.setValue("ID");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_param_1 = (org.apache.struts2.views.jsp.ParamTag) _jspx_tagPool_s_param_name.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_param_1.setPageContext(_jspx_page_context);
    _jspx_th_s_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_a_0);
    _jspx_th_s_param_1.setName("username");
    int _jspx_eval_s_param_1 = _jspx_th_s_param_1.doStartTag();
    if (_jspx_eval_s_param_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_param_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_param_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_param_1.doInitBody();
      }
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.get(\"USERNAME\")}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        int evalDoAfterBody = _jspx_th_s_param_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_param_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_1);
      return true;
    }
    _jspx_tagPool_s_param_name.reuse(_jspx_th_s_param_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("s");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dss}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    if ($(\"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\").length)\r\n");
          out.write("                    {\r\n");
          out.write("                        $(\"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\").jPlayer({\r\n");
          out.write("                            ready: function () {\r\n");
          out.write("                                $(this).jPlayer(\"setMedia\", {\r\n");
          out.write("                                    title: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" + \" - \" + \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\",\r\n");
          out.write("                                    artist: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\",\r\n");
          out.write("                                    mp3: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.resource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                                });\r\n");
          out.write("                            },\r\n");
          out.write("                            play: function () { // To avoid multiple jPlayers playing together.\r\n");
          out.write("                                $(this).jPlayer(\"pauseOthers\");\r\n");
          out.write("                            },\r\n");
          out.write("                            swfPath: \"plugins/jPlayer\",\r\n");
          out.write("                            supplied: \"mp3\",\r\n");
          out.write("                            cssSelectorAncestor: \"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.ID2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\",\r\n");
          out.write("                            wmode: \"window\",\r\n");
          out.write("                            globalVolume: true,\r\n");
          out.write("                            useStateClassSkin: true,\r\n");
          out.write("                            autoBlur: false,\r\n");
          out.write("                            smoothPlayBar: true,\r\n");
          out.write("                            keyEnabled: true,\r\n");
          out.write("                            solution: 'html',\r\n");
          out.write("                            preload: 'metadata',\r\n");
          out.write("                            volume: 0.2,\r\n");
          out.write("                            muted: false,\r\n");
          out.write("                            backgroundColor: '#000000',\r\n");
          out.write("                            errorAlerts: false,\r\n");
          out.write("                            warningAlerts: false\r\n");
          out.write("                        });\r\n");
          out.write("                    }\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
