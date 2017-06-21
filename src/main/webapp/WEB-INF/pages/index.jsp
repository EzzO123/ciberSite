<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="by.usovich.service.Imp.PostServise" %>
<%@ page import="by.usovich.dto.PostJsonDto" %><%--
  Created by IntelliJ IDEA.
  User: yanus
  Date: 10.05.2017
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />

</head>
<body>
<c:forEach var="post" items="${posts}">

    Result :  -->[ ${post.value._titel} -- ${post.value._content} -- ${post.value._date}]<--<br>

</c:forEach>


<div>
    <form action="/getNews" method="post">
        <input type="text" name="number"><<br>
        <input type="checkbox" name="titel" value="dota"><span>Dota</span><br>
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
