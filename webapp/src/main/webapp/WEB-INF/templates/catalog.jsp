<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 09.10.2019
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Catalog</title>
    <%@ include file="styles.jsp"%>
</head>

<body>
<%@include file="nav.jsp"%>
<jsp:useBean id="productList" scope="application" class="ru.geekbrains.entities.ProductRepository"/>
<h1>Catalog page</h1>
<ul class="list-group">
<c:forEach var="product" items="${productList.findAll()}">
    <li class="list-group-item">${product.name}, price ${product.price}</li>
</c:forEach>
</ul>
</body>
</html>
