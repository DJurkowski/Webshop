<%--
  Created by IntelliJ IDEA.
  User: Dominik
  Date: 5/9/2018
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--HEAD content--%>
    <jsp:include page=".head.jsp"/>
</head>
<body>
<%--CUSTOMER MENU content--%>
<jsp:include page=".menuCustomer.jsp"/>

<div class="container" id="homeDiv">
    <div class="jumbotron text-center">
        <h1>Welcome to WebShopApp</h1>
        <h1>${nickname.nick}</h1>
    </div>
</div>

<%--JS content--%>
<jsp:include page=".script.jsp"/>
</body>
</html>
