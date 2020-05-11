<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Medico</title>
</head>
<body>
<%@include file="tendinaMedico.jsp"%>
<br><br>
<%
String messaggio = (String) request.getAttribute("messaggio");

	if (messaggio != null ){
		%>
	<main role="main" class="inner cover">
    <h1 class="cover-heading">Risultato</h1>
    <p class="lead"><c:out value = "${messaggio}"/></p>
    
  </main>
		<%}else{%>
		
		<h1>
		 <c:out value = "${sessionScope.Utente.getNome()}"/> 
		 <c:out value = "${sessionScope.Utente.getCognome()}"/>	
		</h1>
		<img width="120" height="150" src="data:image/png;base64,<c:out value="${sessionScope.Utente.getImage()}" />" />
		<%}%>
</body>
</html>