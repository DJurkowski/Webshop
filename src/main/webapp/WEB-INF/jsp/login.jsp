<%--
  Created by IntelliJ IDEA.
  User: Dominik
  Date: 5/7/2018
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%--HEAD content--%>
    <jsp:include page=".head.jsp"/>
</head>
<body>
<%--MENU content--%>
<jsp:include page=".menu.jsp"/>
<div class="container text-center">
    <h3>Create Account</h3>

    <div class="form-horizontal">
        <form:form modelAttribute="user" action="login" method="post">
            <div class="form-group">
                <label class="control-label col-md-3">Nickname:</label>
                <div class="col-md-7"><form:input class="form-control" path="nick"/>
                    <span class="Errors"><form:errors path="nick" cssClass="error"/></span>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-md-3">Password:</label>
                <div class="col-md-7"><form:password class="form-control" path="password"/>
                    <span class="Errors"><form:errors path="password" cssClass="error"/></span>
                </div>
            </div>
        </form:form>
    </div>
</div>

<%--JS content--%>
<jsp:include page=".script.jsp"/>
</body>
</html>
