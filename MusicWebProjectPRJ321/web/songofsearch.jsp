<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Songs</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Mixtape template project">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/bootstrap-4.1.2/bootstrap.min.css">
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
        <link rel="stylesheet" type="text/css" href="styles/song.css">
        <link rel="stylesheet" type="text/css" href="styles/song_responsive.css">
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
            <!-- Menu -->

            <div class="menu">
                <div>
                    <div class="menu_overlay"></div>
                    <div class="menu_container d-flex flex-column align-items-start justify-content-center">
                        <div class="menu_log_reg">
                            <ul class="d-flex flex-row align-items-start justify-content-start">
                                <li><a href="#">Login</a></li>
                                <li><a href="#">Register</a></li>
                            </ul>
                        </div>
                        <nav class="menu_nav">
                            <ul class="d-flex flex-column align-items-start justify-content-start">
                                <li><a href="index.jsp">Home</a></li>
                                <li><a href="about.jsp">About us</a></li>
                                <li><a href="music.jsp">Music</a></li>
                                <li><a href="blog.jsp">News</a></li>
                                <li><a href="contact.jsp">Contact</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>

            <!-- Home -->

            <div class="home">
                <div class="home_inner">
                    <div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/single.jpg" data-speed="0.8"></div>
                    <div class="home_container">
                        <div class="home_content text-center">
                            <div class="home_subtitle">Clowns</div>
                            <div class="home_title">The Songs</div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Single -->

            <div class="single">
                <div class="container">
                    <div class="row">

                        <!-- Single Info -->


                        <!-- Single Content -->
                        <div class="col-lg-7 single_content_col">
                            <div class="single_content">

                                <div class="single_players">
                                    <s:iterator value="dss">
                                        <!-- Single Player -->
                                        <div class="single_player_container d-flex flex-column align-items-start justify-content-center">
                                            <div class="single_player">
                                                <div id="<s:property value="ID"/>" class="jp-jplayer"></div>
                                                <div id="<s:property value="ID2"/>" class="jp-audio" role="application" aria-label="media player">
                                                    <div class="jp-type-single">
                                                        <div class="player_details d-flex flex-row align-items-center justify-content-start">
                                                            <div class="jp-details">
                                                                <div>playing</div>
                                                                <div class="jp-title" aria-label="title">&nbsp;</div>
                                                            </div>
                                                            <div class="jp-controls-holder ml-auto">
                                                                <button class="jp-play" tabindex="0"></button>
                                                            </div>
                                                        </div>
                                                        <div class="player_controls">
                                                            <div class="jp-gui jp-interface d-flex flex-row align-items-center justify-content-start">
                                                                <div class="jp-controls-holder time_controls d-flex flex-row align-items-center justify-content-start">
                                                                    <div><div class="jp-current-time" role="timer" aria-label="time">&nbsp;</div></div>
                                                                    <div class="jp-progress">
                                                                        <div class="jp-seek-bar">
                                                                            <div class="jp-play-bar"></div>
                                                                        </div>
                                                                    </div>
                                                                    <div><div class="jp-duration ml-auto" role="timer" aria-label="duration">&nbsp;</div></div>
                                                                </div>
                                                                <div class="jp-volume-controls d-flex flex-row align-items-center justify-content-start ml-auto">
                                                                    <button class="jp-mute" tabindex="0"></button>
                                                                    <div class="jp-volume-bar">
                                                                        <div class="jp-volume-bar-value"></div>
                                                                    </div>
                                                                </div>
                                                                <div>
                                                                    <s:if test='%{!#session.USERNAME.isEmpty()}'>
                                                                        <s:set name="kiemtra" value="0"/>
                                                                        <c:forEach var="s" items="${dssf}">


                                                                            <s:set name="songID"><s:property value="ID"/></s:set>
                                                                            <s:set name="favoriteID">${s.ID}</s:set>
                                                                            <s:if test="%{#favoriteID==#songID}">
                                                                                <s:set name="kiemtra" value="1"/>
                                                                            </s:if>

                                                                        </c:forEach>
                                                                        <s:if test="%{#kiemtra==1}">
                                                                            <s:a action="removefavorite3">
                                                                                <s:param name="songTitle"><s:property value="songTitle"/></s:param>
                                                                                <s:param name="songId"><s:property value="ID"/></s:param>
                                                                                <s:param name="username">${sessionScope.get("USERNAME")}</s:param>
                                                                                    <button style="margin-left: 30px;" class="favorite_button" type="button" tabindex="0"></button>
                                                                            </s:a>
                                                                        </s:if>
                                                                        <s:else>
                                                                            <s:a action="addfavorite3">
                                                                                <s:param name="songTitle"><s:property value="songTitle"/></s:param>
                                                                                <s:param name="songId"><s:property value="ID"/></s:param>
                                                                                <s:param name="username">${sessionScope.get("USERNAME")}</s:param>
                                                                                    <button style="margin-left: 30px;" class="nonfavorite_button"  type="button" tabindex="0"></button>
                                                                            </s:a>
                                                                        </s:else>
                                                                    </s:if>    
                                                                </div>
                                                            </div>


                                                        </div>
                                                        <div class="jp-no-solution">
                                                            <span>Update Required</span>
                                                            To play the media you will need to either update your browser to a recent version or update your <a href="http://get.adobe.com/flashplayer/" target="_blank">Flash plugin</a>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </s:iterator>
                                </div>
                            </div>
                        </div>

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
        <script src="plugins/fit-vids/jquery.fitvids.js"></script>
        <!--        <script src="js/single.js"></script>-->

        <script>
            $(document).ready(function ()
            {
                "use strict";

                /* 
                 
                 1. Vars and Inits
                 
                 */

                var header = $('.header');
                var ctrl = new ScrollMagic.Controller();

                initMenu();
                initSinglePlayer();
                initFitVids();

                setHeader();

                $(window).on('resize', function ()
                {
                    setHeader();
                });

                $(document).on('scroll', function ()
                {
                    setHeader();
                });

                /* 
                 
                 2. Set Header
                 
                 */

                function setHeader()
                {
                    if ($(window).scrollTop() > 91)
                    {
                        header.addClass('scrolled');
                    } else
                    {
                        header.removeClass('scrolled');
                    }
                }

                /* 
                 
                 3. Init Menu
                 
                 */

                function initMenu()
                {
                    if ($('.menu').length)
                    {
                        var hamb = $('.hamburger');
                        var menu = $('.menu');
                        var menuOverlay = $('.menu_overlay');

                        hamb.on('click', function ()
                        {
                            menu.addClass('active');
                        });

                        menuOverlay.on('click', function ()
                        {
                            menu.removeClass('active');
                        });
                    }
                }

                /* 
                 
                 4. Init Single Player
                 
                 */

                function initSinglePlayer()
                {
            <c:forEach var="s" items="${dss}">
                    if ($("#${s.ID}").length)
                    {
                        $("#${s.ID}").jPlayer({
                            ready: function () {
                                $(this).jPlayer("setMedia", {
                                    title: "${s.title}" + " - " + "${s.author}",
                                    artist: "${s.author}",
                                    mp3: "${s.resource}"
                                });
                            },
                            play: function () { // To avoid multiple jPlayers playing together.
                                $(this).jPlayer("pauseOthers");
                            },
                            swfPath: "plugins/jPlayer",
                            supplied: "mp3",
                            cssSelectorAncestor: "#${s.ID2}",
                            wmode: "window",
                            globalVolume: true,
                            useStateClassSkin: true,
                            autoBlur: false,
                            smoothPlayBar: true,
                            keyEnabled: true,
                            solution: 'html',
                            preload: 'metadata',
                            volume: 0.2,
                            muted: false,
                            backgroundColor: '#000000',
                            errorAlerts: false,
                            warningAlerts: false
                        });
                    }
            </c:forEach>
                }

                /* 
                 
                 5. Init Fitvids
                 
                 */

                function initFitVids()
                {
                    if ($('.video_container').length)
                    {
                        $('.video_container').fitVids();
                    }
                }

            });
        </script>
    </body>
</html>