<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Users Management</title>
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
        <link rel="stylesheet" type="text/css" href="styles/1.css">
        <link rel="stylesheet" type="text/css" href="styles/song_responsive.css">
        <link href="css/droplist.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

        <div class="super_container">
            <jsp:include page="headerAdmin.jsp"/>

            <!-- Home -->

            <div class="home">
                <div class="home_inner">
                    <div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/single.jpg" data-speed="0.8"></div>
                    <div class="home_container">
                        <div class="home_content text-center">
                            <div class="home_title">Users Management</div>
                        </div>
                    </div>
                </div>
            </div>
            <button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>
            <!-- Single -->

            <div class="single">
                <div class="container">
                    <div class="container">
                        <h2>List Users</h2>
                        <ul class="list-group">
                            <table id="someTable">
                                <tfoot>
                                    <tr>
                                        <td valign="bottom" align="right">
                                            <s:iterator value="dsuser">
                                    <li class="list-group-item">
                                        <p style="color: black" align="left"><s:property value="username"/>---<s:property value="email"/>---<s:property value="country"/>---<s:property value="gender"/>---<s:property value="role"/></p>                                       
                                        <s:set name="rolee"><s:property value="role"/></s:set>
                                        <div class="multi-button">
                                        <s:if test="%{#rolee==0}">
                                            <s:a action="opuser">
                                                <s:param name="username">${sessionScope.get("USERNAME")}</s:param>
                                                <s:param name="usernameOp"><s:property value="username"/></s:param>
                                                <button id="someButton">Op</button>
                                            </s:a>                                          
                                        </s:if>
                                        <s:else>
                                            <s:a action="deopuser">
                                                <s:param name="username">${sessionScope.get("USERNAME")}</s:param>
                                                <s:param name="usernameDeop"><s:property value="username"/></s:param>
                                                <button id="someButton">Deop</button>
                                            </s:a>  
                                        </s:else>
                                        <s:a action="userdelete">
                                            <s:param name="username">${sessionScope.get("USERNAME")}</s:param>
                                            <s:param name="usernameDel"><s:property value="username"/></s:param>
                                                <button id="someButton" type="submit">Delete</button>
                                        </s:a>
                                    </div></li>
                                    </s:iterator>
                                </td>
                                </tr>
                                </tfoot>
                            </table>
                        </ul>
                    </div>
                </div>
            </div>

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
        <script src="js/single.js"></script>
        <script>
                //Get the button
                var mybutton = document.getElementById("myBtn");

                // When the user scrolls down 20px from the top of the document, show the button
                window.onscroll = function () {
                    scrollFunction()
                };

                function scrollFunction() {
                    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
                        mybutton.style.display = "block";
                    } else {
                        mybutton.style.display = "none";
                    }
                }

                // When the user clicks on the button, scroll to the top of the document
                function topFunction() {
                    document.body.scrollTop = 0;
                    document.documentElement.scrollTop = 0;
                }
            </script>     
    </body>
</html>