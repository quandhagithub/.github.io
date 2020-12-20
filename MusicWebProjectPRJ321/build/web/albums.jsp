<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Albums</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Mixtape template project">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/bootstrap-4.1.2/bootstrap.min.css">
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
        <link rel="stylesheet" type="text/css" href="styles/albums.css">
        <link rel="stylesheet" type="text/css" href="styles/albums_responsive.css">
    </head>
    <body>

        <div class="super_container">

            <!-- Header -->
           <s:set name="rolevl">${sessionScope.get("role")}</s:set>
            <s:if test='%{!#session.USERNAME.isEmpty()}'>
                <s:if test="%{#rolevl==1}">
                    <jsp:include page="headerAdmin.jsp"/>
                </s:if>
                <s:else>
                    <jsp:include page="headerUser.jsp"/>
                </s:else>
            </s:if>
            <s:else>
                <jsp:include page="headerGuest.jsp"/>
            </s:else>

            <!-- Home -->

            <div class="home">
                <div class="home_inner">
                    <!-- Image artist: https://unsplash.com/@yoannboyer -->
                    <div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/about.jpg" data-speed="0.8"></div>
                    <div class="home_container">
                        <div class="home_content text-center">
                            <div class="home_subtitle">Clowns</div>
                            <div class="home_title">The Albums</div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Discs -->

            <div class="discs">
                <div class="container">
                    <div class="row discs_row">
                        <s:iterator value="dsalbum">
                            <!-- Disc -->
                            <div class="col-xl-4 col-md-6">
                                <div class="disc">
                                    <s:a action="songofalbum">
                                        <s:param name="username">${sessionScope.get("USERNAME")}</s:param>
                                        <s:param name="AlbumID"><s:property value="ID"/></s:param>                                       
                                        <div class="disc_image"><img src="<s:property value="path"/>" alt="google.com.vn"></div>
                                        <div class="disc_container">
                                            <div>
                                                <div class="disc_content_2 d-flex flex-column align-items-center justify-content-center">
                                                    <div class="disc_title"><s:property value="title"/></div>
                                                    <div class="disc_subtitle"><s:property value="author"/></div>
                                                    <div class="disc_subtitle"><s:property value="genre"/></div>
                                                </div>
                                            </div>
                                        </div>
                                    </s:a>
                                </div>
                            </div>				
                        </s:iterator>
                    </div>
                </div>
            </div>


            <!-- Footer -->

           <jsp:include page="footer.jsp"/>
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
        <script src="js/about.js"></script>
    </body>
</html>