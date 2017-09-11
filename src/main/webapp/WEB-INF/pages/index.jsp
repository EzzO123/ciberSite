<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="by.usovich.service.Imp.NewsServiceImplement" %>
<%@ page import="by.usovich.dto.NewsDto.NewsDto" %><%--
  Created by IntelliJ IDEA.
  User: yanus
  Date: 10.05.2017
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>

   <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />

    <script src="http://code.jquery.com/jquery-1.9.0.min.js" type="text/javascript"></script>

    <link href="<c:url value="/resources/css/all.css"/>" type="text/css" rel="stylesheet">

    <script src="${pageContext.request.contextPath}/resources/js/all.js?<?=filemtime( 'js/file.js' )?>" type="text/javascript"></script>


</head>

<body>
<div class="chat chat--aside">
    <div class="l-chat__toggle">
        <button onclick="toggle()" class="chat__toggle">Ч<br/>А<br/>Т</button>
    </div>
    <div class="chat__wrap">
        <div class="chat__team">Командный чат</div>
    </div>
    <div class="chat-container tab-content">
        <ul id="team-chat" class="chat__dialog tab-pane fade in active">
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
            <li class="chat__messenge"><a data-peer='143' class="chat_ban-actions"></a>
                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
            </li>
        </ul>
        <div class="chat-container__toBottom l-chat-container__toBottom">
            <button id="toBottom" class="toBottom"><img src="${pageContext.request.contextPath}/resources/img/down-arrow.svg"></button>
        </div>
        <div class="chat__send-messenge">
            <textarea name="text" cols="40" rows="5" placeholder="Введите сообщение" id="chat__input-text" class="chat__input-text"></textarea>
            <button id="chat__button" class="chat__button">Отправить</button>
        </div>
    </div>
</div>
<div class="ban-actions-menu">
    <form action="/context-path/ServletName" method="post"><a><span aria-hidden="true" class="ban-actions-menu__close">X</span></a>
        <ul class="ban-actions__list"><span>Бан на:</span>
            <li>
                <input type="radio" name="ban" id="ban-1" value="1"> 1 час
            </li>
            <li>
                <input type="radio" name="ban" id="ban-2" value="2"> 2 часа
            </li>
            <li>
                <input type="radio" name="ban" id="ban-3" value="4"> 4 часа
            </li>
            <li>
                <input type="radio" name="ban" id="ban-4" value="inf"> Вечность
            </li>
        </ul>
    </form>
    <input type="submit" value="Забанить" class="ban-actions__act">
</div>



<div class="page-container main-background">
    <div class="wrapper">
        <nav class="navbar header">
            <button type="button" data-toggle="collapse" data-target="#adaptiveMenu" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" class="navbar-toggle navbar-toggler-right"><span class="navbar-toggler-icon"></span></button><a href="index.html" class="navbar-brand"><img src="${pageContext.request.contextPath}/resources/img/besa-logo-light.svg"></a>
            <div id="adaptiveMenu" class="collapse navbar-collapse">
                <ul class="nav-gamess navbar-nav mr-auto">
                    <li class="nav-games__item nav-item active" ><a  class="nav-games__link nav-link" href="../main-page-cs"><span>CS GO</span></a></li>
                    <li class="nav-games__item nav-item active" ><a  class="nav-games__link nav-link" href="../main-page-wot/"><span>World of tanks</span></a></li>
                    <li class="nav-games__item nav-item active" ><a  class="nav-games__link nav-link" href="../main-page-paragon"><span>Paragon</span></a></li>
                    <li class="nav-games__item nav-item active" ><a  class="nav-games__link nav-link" href="../main-page-dota"><span>Dota 2</span></a></li>
                </ul>
                <div class="account-option"><span class="login login__icon"><a href="../login">Вход</a>
                <div class="account-option__actions-list">
                  <ul class="account-option__list">
                    <li class="account-option__item"><a class="account-option__link">Написать новость</a></li>
                    <li class="account-option__item"><a class="account-option__link">Добавить стрим</a></li>
                    <li class="account-option__item"><a class="account-option__link">Action</a></li>
                    <li class="account-option__item"><a class="account-option__link">Action</a></li>
                  </ul>
                </div></span><span>/</span><span class="registration"><a href="../reg">Регистрация</a></span></div>
            </div>
        </nav>




        <div class="container-fluid flex-center">
            <div class="menu-game">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        <form action="main-page-cs" class="menu-game__item menu-game__item--hover-cs"><img src="${pageContext.request.contextPath}/resources/img/cs-go_item.jpg" alt="CSGO">
                            <div class="menu-game__wrap">
                                <div class="menu-game__game-logo"><img src="${pageContext.request.contextPath}/resources/img/cs-go_logo.svg"></div>
                            </div>
                            <div class="menu-game__button-wrap"><button type="submit" class="menu-game__link">Узнать больше</button></div>
                        </form>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        <form action="main-page-wot" method="get" class="menu-game__item menu-game__item--hover-wot"><img src="${pageContext.request.contextPath}/resources/img/wot_item.jpg" alt="wot">
                            <div class="menu-game__wrap">
                                <div class="menu-game__game-logo"><img src="${pageContext.request.contextPath}/resources/img/wot_logo.svg"></div>
                            </div>
                            <div class="menu-game__button-wrap"><button type="submit" class="menu-game__link">Узнать больше</button></div>
                        </form>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        <form action="main-page-paragon" type="get" class="menu-game__item menu-game__item--hover-paragon"><img src="${pageContext.request.contextPath}/resources/img/paragon_item.jpg" alt="paragon">
                            <div class="menu-game__wrap">
                                <div class="menu-game__game-logo"><img src="${pageContext.request.contextPath}/resources/img/paragon_logo.svg"></div>
                            </div>
                            <div class="menu-game__button-wrap"><button type="submit" class="menu-game__link">Узнать больше</button></div>
                        </form>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        <form action="main-page-dota" method="get" class="menu-game__item menu-game__item--hover-dota"><img src="${pageContext.request.contextPath}/resources/img/dota_item.jpg" alt="dota">
                            <div class="menu-game__wrap">
                                <div class="menu-game__game-logo"><img src="${pageContext.request.contextPath}/resources/img/dota_logo.svg"></div>
                            </div>
                            <div class="menu-game__button-wrap"><button type="submit" class="menu-game__link">Узнать больше</button></div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer">
            <ul class="tech-support">
                <li class="tech-support__item"><a class="link-item">Faq</a></li>
                <li class="tech-support__item"><a class="link-item">Тех. поддержка</a></li>
            </ul><span class="copyright">© 2016—2017</span>
            <ul class="social">
                <li class="social__item"><a class="link--social google"></a></li>
                <li class="social__item"><a class="link--social youtube"></a></li>
                <li class="social__item"><a class="link--social tumblr"></a></li>
                <li class="social__item"><a class="link--social facebook"></a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
