<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="by.usovich.service.Imp.NewsServiceImplement" %>
<%@ page import="by.usovich.dto.NewsDto.NewsDto" %><%--
  Created by IntelliJ IDEA.
  User: yanus
  Date: 8/7/2017
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<c:forEach var="num" items="${arraySimple}">
                                    <div class="videos__item">
                                        <div class="videos__preview"><img data-ref="https://www.youtube.com/embed/Q_5IZKJlPIk?ecver=2" src="https://i.kinja-img.com/gawker-media/image/upload/s--G76fDOkv--/c_scale,fl_progressive,q_80,w_800/nvr33pslf0ukv1mtn6w2.png" frameborder="0" allowfullscreen></div>
                                        <div class="videos__item-info-wrap"><span data-ref="https://www.youtube.com/embed/Q_5IZKJlPIk?ecver=2" class="videos__name">Выход Natus Vincere в плей-офф ELEAGUE Major</span><span class="videos__data">5 февраля, воскресенье</span></div>
                                    </div>
                                </c:forEach>--%>
<head>
    <title>World of tanks</title>

    <c:set var = "arraySimple" scope = "session" value = "${{0,1,2,3,4}}"/>

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


            <%--<c: forEach var="message" items="messages" >--%>
            <%--//ToDo--%>
            <c:forEach var="num" items="${arraySimple}">

                <div class="chat__user">
                    <div class="chat__avatar"><img src="https://support.rockstargames.com/system/photos/0001/4510/9157/profile_image_877736018_61840.png"></div><em class="chat__user-name">Marcus_loo</em><em class="chat__time">21:32</em>
                </div>
                <p class="chat__messenge-content">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda temporibus, consectetur non ea laboriosam officiis rem quas error architecto repellat!



                </p>
                </li>
            </c:forEach>


        </ul>
        <div class="chat-container__toBottom l-chat-container__toBottom">
            <div id="toBottom" class="toBottom"><img src="../resources/img/down-arrow.svg"></div>
        </div>
        <div class="chat__send-messenge">
            <textarea name="text" cols="40" rows="5" placeholder="Введите сообщение" id="chat__input-text" class="chat__input-text"></textarea>
            <button id="chat__button" class="chat__button">Отправить</button>
        </div>
    </div>
</div>

<div class="page-container wot-background">
    <div class="wrapper">
        <!--include ../templates/_nav-games-->
        <nav class="navbar header">
            <button type="button" data-toggle="collapse" data-target="#adaptiveMenu" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" class="navbar-toggle navbar-toggler-right"><span class="navbar-toggler-icon"></span></button><a href="index.html" class="navbar-brand"><img src="../resources/img/besa-logo-light.svg"></a>
            <div id="adaptiveMenu" class="collapse navbar-collapse">
                <ul class="nav-gamess navbar-nav mr-auto">
                    <li class="nav-games__item nav-item active"><a href="main-page-csgo.html" class="nav-games__link nav-link"><span>CS GO</span></a></li>
                    <li class="nav-games__item nav-item active"><a href="main-page-wot.html" class="nav-games__link nav-link"><span>World of tanks</span></a></li>
                    <li class="nav-games__item nav-item active"><a href="main-page-paragon.html" class="nav-games__link nav-link"><span>Paragon</span></a></li>
                    <li class="nav-games__item nav-item active"><a href="main-page-dota.html" class="nav-games__link nav-link"><span>Dota 2</span></a></li>
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
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-8 col-md-8 hidden-sm hidden-xs" style="display: block;">
                    <div class="streams">
                        <div class="streams__wrap">
                            <h2 class="block-title">Стримы</h2>
                            <div class="streams__container">
                                <div class="row">
                                    <div class="col-lg-12 col-md-12" style="">
                                        <div class="streams__list mCustomScrollbar _mCS_1"><div id="mCSB_1" class="mCustomScrollBox mCS-light mCSB_vertical mCSB_inside" style="max-height: none;" tabindex="0"><div id="mCSB_1_container" class="mCSB_container" style="position: relative; top: 0px; left: 0px;" dir="ltr">
                                            <c:forEach items="${Stream}" var="stream">
                                                <div class="streams__item">
                                                    <div class="streams__preview"><img data-ref="${stream.value.get("RefVideo")}" src="${stream.value.get("RefImage")}" frameborder="0" allowfullscreen="" class="mCS_img_loaded"></div>
                                                    <div class="streams__item-info-wrap"><span data-ref="${stream.value.get("RefVideo")}" class="videos__name">${stream.value.get("Name")}</span><span class="videos__data">${stream.value.get("Date")}</span></div>
                                                </div>
                                            </c:forEach>

                                        </div><div id="mCSB_1_scrollbar_vertical" class="mCSB_scrollTools mCSB_1_scrollbar mCS-light mCSB_scrollTools_vertical" style="display: block;"><div class="mCSB_draggerContainer"><div id="mCSB_1_dragger_vertical" class="mCSB_dragger" style="position: absolute; min-height: 30px; display: block; height: 311px; max-height: 325px; top: 0px;"><div class="mCSB_dragger_bar" style="line-height: 30px;"></div></div><div class="mCSB_draggerRail"></div></div></div></div></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 hidden-xs">
                    <div class="videos">
                        <div class="videos__wrap">
                            <h2 class="block-title">Видео</h2>
                            <div class="videos__list">
                                <c:forEach items="${Video}" var="video">
                                    <div class="videos__item">
                                        <div class="videos__preview"><img ref="${video.value.get("RefVideo")}" src="${video.value.get("RefImage")}" frameborder="0" allowfullscreen=""></div>
                                        <div class="videos__item-info-wrap"><a ref="${video.value.get("RefVideo")}" class="videos__name">${video.value.get("Name")}</a><span class="videos__data">${video.value.get("Date")}"</span></div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <div class="news">
                        <div class="news__wrap">
                            <h2 class="block-title">Новости</h2>
                            <div class="news__container">
                                <div class="news__item">
                                    <div class="news__img"><img alt="imf cyber" src="http://mulehorngaming.com/wp-content/uploads/2015/12/gamer-wallpaperswallpaper-gamer-controllers-artwork-gamer-wallpaper-gamingholic-g1unpxck.jpg"></div>
                                    <div class="news_tag">Новости</div>
                                    <h4 class="news__header">TaZ:»Я пришел из той эпохи, когда буквально не было никаких турниров»</h4>
                                    <p class="news__preview-text">
                                        Завершился европейские отборочные
                                        по CS:GO на The Inztel Challenge
                                        Katowice 2017. Слот выиграла наша
                                        команда EYESPORTS female.
                                    </p>
                                    <div class="news__more-l"><a href="#" class="news__more">Подробнее...</a></div><span class="news__data">04.02.2017</span>
                                </div>
                                <div class="news__item">
                                    <div class="news__img"><img alt="imf cyber" src="http://mulehorngaming.com/wp-content/uploads/2015/12/gamer-wallpaperswallpaper-gamer-controllers-artwork-gamer-wallpaper-gamingholic-g1unpxck.jpg"></div>
                                    <div class="news_tag">Новости</div>
                                    <h4 class="news__header">TaZ:»Я пришел из той эпохи, когда буквально не было никаких турниров»</h4>
                                    <p class="news__preview-text">
                                        Киберспортивный портал slingshot
                                        авершился европейские отборочные по CS:GO на The Inztel Challenge
                                        Katowice 2017. Слот выиграла наша команда EYESPORTS female.
                                    </p>
                                    <div class="news__more-l"><a href="#" class="news__more">Подробнее...</a></div><span class="news__data">04.02.2017</span>
                                </div>
                                <div class="news__item">
                                    <div class="news__img"><img alt="imf cyber" src="http://mulehorngaming.com/wp-content/uploads/2015/12/gamer-wallpaperswallpaper-gamer-controllers-artwork-gamer-wallpaper-gamingholic-g1unpxck.jpg"></div>
                                    <div class="news_tag">Новости</div>
                                    <h4 class="news__header">Happy создает новую команду</h4>
                                    <p class="news__preview-text">
                                        Винсент «Happy» Шопенгауэр
                                        создает новую команду в рамках
                                        грядущего французского решафла.
                                        Happy строит новую боевую
                                        команду.
                                    </p>
                                    <div class="news__more-l"><a href="#" class="news__more">Подробнее...</a></div><span class="news__data">04.02.2017</span>
                                </div>
                            </div>
                        </div>
                        <div class="news__arrow-l"><img src="../resources/img/arrow-with-left-direction.png"></div>
                        <div class="news__arrow-r"><img src="../resources/img/arrow-with-right-direction.png"></div>
                    </div>
                    <div class="news__more-news center-block">
                        <button>Загрузить еще</button>
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
<script src="https://npmcdn.com/tether@1.2.4/dist/js/tether.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>