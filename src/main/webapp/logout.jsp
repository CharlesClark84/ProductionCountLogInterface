<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true"%>
<div class="well center">
User '<%=request.getRemoteUser()%>' has been logged out.

<% session.invalidate(); %>
<% request.getSession(false); %>

<br/><br/>

<a href="index.jsp" class="btn btn-success btn-send">Home</a>
</div>
