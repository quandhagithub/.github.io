<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <!-- Header -->
    <header class="header">
        <div class="header_content d-flex flex-row align-items-center justify-content-center">
            <div class="logo"><a href="#">ClownsMusik</a></div>
            <div class="log_reg">
                <ul class="d-flex flex-row align-items-start justify-content-start">
                    <li>${sessionScope.get("USERNAME")}</li>
                    <li><s:a action="logout">Logout</s:a></li>
                    </ul>
                </div>
                <nav class="main_nav">
                    <ul class="d-flex flex-row align-items-start justify-content-start">
                        <li class=""><a href="home.jsp">Home</a></li>
                        <li class=""><s:a action="album">Albums</s:a></li>
                    <li class=""><s:a action="song"><s:param name="username">${sessionScope.get("USERNAME")}</s:param>Songs</s:a></li>
                    <li class=""><s:a action="favorite"><s:param name="username">${sessionScope.get("USERNAME")}</s:param>Favorite</s:a></li>
                            <li><nav class="search_menu">

                                    <form method="get" action="searchsong" id="search">
                                <s:param name="username">${sessionScope.get("USERNAME")}</s:param>
                                <input name="username" type="text" size="40" value="${sessionScope.get("USERNAME")}" hidden="true" />
                                <input name="songTitle" type="text" size="40" placeholder="Search..." />
                                <button type="submit" hidden="true"></button>
                            </form>
                        </nav>
                    </li>
                </ul>
            </nav>
            <div class="hamburger ml-auto">
                <div class="d-flex flex-column align-items-end justify-content-between">
                    <div></div>
                    <div></div>
                    <div></div>
                </div>
            </div>

        </div>
    </header>

    <!-- Menu -->

    <div class="menu">
        <div>
            <div class="menu_overlay"></div>
            <div class="menu_container d-flex flex-column align-items-start justify-content-center">
                <div class="menu_log_reg">
                    <ul class="d-flex flex-row align-items-start justify-content-start">
                        <li><a a href="#">Login</a></li>
                        <li><a href="#">Register</a></li>
                    </ul>
                </div>
                <nav class="menu_nav">
                    <ul class="d-flex flex-column align-items-start justify-content-start">
                        <li class=""><a href="home.jsp">Home</a></li>
                        <li class=""><s:a action="album">Albums</s:a></li>
                    <li class=""><s:a action="song"><s:param name="username">${sessionScope.get("USERNAME")}</s:param>Songs</s:a></li>
                    <li class=""><s:a action="favorite"><s:param name="username">${sessionScope.get("USERNAME")}</s:param>Favorite</s:a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>

</html>