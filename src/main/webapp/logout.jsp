<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true"%>

User '<%=request.getRemoteUser()%>' has been logged out.

<% session.invalidate(); %>
<% request.getSession(false); %>

<br/><br/>
<div class="logoutButton">
<a href="index.jsp">Home</a>
</div>