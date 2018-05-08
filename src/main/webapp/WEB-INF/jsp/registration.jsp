<%--
  Created by IntelliJ IDEA.
  User: Dominik
  Date: 5/7/2018
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <form:form modelAttribute="user" action="registration" method="post">
        <div class="form-group">
            <label class="control-label col-md-3">Nickname:</label>
            <div class="col-md-7"><form:input class="form-control" path="nick"/>
                <span class="Errors"><form:errors path="nick" cssClass="error"/></span>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">FirstName:</label>
            <div class="col-md-7"><form:input class="form-control" path="firstName"/>
            <span class="Errors"><form:errors path="firstName" cssClass="error"/></span>
        </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">SecondName:</label>
            <div class="col-md-7"><form:input class="form-control" path="secondName"/>
            <span class="Errors"><form:errors path="secondName" cssClass="error"/></span>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Age:</label>
            <div class="col-md-7"><form:input class="form-control" path="age"/>
            <span class="Errors"><form:errors path="age" cssClass="error"/></span>
        </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Email:</label>
            <div class="col-md-7"><form:input class="form-control" path="email"/>
            <span class="Errors"><form:errors path="email" cssClass="error"/></span>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Phone:</label>
            <div class="col-md-7"><form:input class="form-control" path="phone"/>
            <span class="Errors"><form:errors path="phone" cssClass="error"/></span>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">State:</label>
            <div class="col-md-7"><form:select class="form-control" path="state">
                <form:option value="Dolnośląskie">Dolnośląskie</form:option>
                <form:option value="Kujawsko-Pomorskie">Kujawsko-Pomorskie</form:option>
                <form:option value="Lubelskie">Lubelskie</form:option>
                <form:option value="Lubuskie">Lubuskie</form:option>
                <form:option value="Łódzkie">Łódzkie</form:option>
                <form:option value="Małopolskie">Małopolskie</form:option>
                <form:option value="Mazowieckie"> Mazowieckie</form:option>
                <form:option value="Opolskie">Opolskie</form:option>
                <form:option value="Podkarpackie">Podkarpackie</form:option>
                <form:option value="Podlaskie">Podlaskie</form:option>
                <form:option value="Pomorskie">Pomorskie</form:option>
                <form:option value="Śląskie">Śląskie</form:option>
                <form:option value="Świętokrzyskie">Świętokrzyskie</form:option>
                <form:option value="Warmińsko-Mazurskie">Warmińsko-Mazurskie</form:option>
                <form:option value="Wielkopolskie">Wielkopolskie</form:option>
                <form:option value="Zachodnio-Pomorskie">Zachodnio-Pomorskie</form:option>
            </form:select>
            <span class="Errors"><form:errors path="state" cssClass="error"/></span>
        </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">City:</label>
            <div class="col-md-7"><form:input class="form-control" path="city"/>
            <span class="Errors"><form:errors path="city" cssClass="error"/></span>
        </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Postal Code:</label>
            <div class="col-md-7"><form:input class="form-control" path="postalCode"/>
            <span class="Errors"><form:errors path="postalCode" cssClass="error"/></span>
            </div>
        </div>
        <div class="form-group">
                <button type="submit" class="btn btn-primary" value="Save">Submit</button>
        </div>
    </form:form>
    </div>
</div>
<%--/CONTENT--%>

<%--LOAD js scripts--%>
<jsp:include page=".script.jsp"></jsp:include>
</body>
</html>
