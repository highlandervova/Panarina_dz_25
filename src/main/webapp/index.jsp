<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="data.City" %>
<%@ page import="dao.CityDAO" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello City</title>
</head>
<body>
<h1><%= "Hello People!" %>
</h1>
<br/>
<a href="hello-servlet">Hello</a>

<br/>
<br/>
<form action="/Prj_cityName_war_exploded/addCityServlet" method="GET">
    <input type="submit" value="AddCity">
</form>

<p> "Name of City" </p>

<table border="1">

    <tr><th>NAME</th><th>LANGUAGE</th></tr>


<tr>
    <jsp:useBean id="CityService" class="service.CityService" />
    <c:forEach var="d" items="${CityService.allCity}">

        <td>${d.name}</td>
    <td>


       <c:choose>
            <c:when test="${d.language==1}">
                <p>  EN </p>
            </c:when>
            <c:when test="${d.language==2}">
                <p>  RU </p>
            </c:when>
            <c:when test="${d.language==3}">
                <p> UKR </p>
            </c:when>
            <c:otherwise>
                <p>  "no identify"</p>
            </c:otherwise>


        </c:choose>

            </td>
</tr>
    <tr>
        </c:forEach>
</tr>

</table>


</body>
</html>