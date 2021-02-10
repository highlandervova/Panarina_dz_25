<%@ page import="data.City" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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


<h1>Name of City</h1>
<table>
    <tr><th>NAME</th><th>LANGUAGE</th></tr>
</table>

<br/>
<br/>


<jsp:useBean id="CityDAO" class="dao.CityDAO" />
<select>
    <c:forEach var="options" items="${CityDAO.allCityJsp}">
    <option>${options}</option>

        </c:forEach>
</select>
</body>
</html>