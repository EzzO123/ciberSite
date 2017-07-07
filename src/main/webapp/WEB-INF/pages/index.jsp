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

    <script src="http://code.jquery.com/jquery-1.9.0.min.js"
            type="text/javascript"></script>

    <script type="text/javascript">
        function doAjax() {

            var inputTitel = $("#titel").val();
            var inputNumber = $("#number").val();

            $.ajax({

                url : 'http://localhost:8080/getNews',
                type : 'GET',
                dataType : 'JSON',
                data : ({
                    titel : inputTitel,
                    number : inputNumber

                }),

                success: function (data) {

                    alert('Get Json Post : \n' +
                    data[1].titel + '\n' + data[1].content + '\n' + data[1].data + '\n'+ data[1].image + '\n');


                }


            });

        }
    </script>
</head>
<body>
<c:forEach var="post" items="${posts}">

    Result :  -->[ ${post.value._titel} -- ${post.value._content} -- ${post.value._date}]<--<br>

</c:forEach>


<div style="float: left">
    <form action="/index" method="post">
        <input type="text" name="number"><<br>
        <input type="checkbox" name="titel" value="dota"><span>Dota</span><br>
        <button type="submit">Submit</button>
    </form>
</div>








<div style="float: left">

        <input id="number" type="text"><<br>
        <input id="titel" type="checkbox"  value="dota"><span>Dota</span><br>
        <input type="button" value="Ajax" onclick="doAjax()">

</div>


</body>
</html>
