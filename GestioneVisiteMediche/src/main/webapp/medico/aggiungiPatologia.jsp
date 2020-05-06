<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi Patologia</title>
</head>
<body>
<%
		String mess = (String) request.getAttribute("mess");
		if (mess != null) {
	%>
	<h4>
		<p class="text-md-center text-white"><%=mess%></p>
	</h4>


	<%
		}
	%>
	<br>
<!-- 	<hr> -->
<!-- 	<ul> -->
<%-- 		<c:forEach items="${listaPatologia}" var="singolaPatologia"> --%>
<%-- 			<li> <h5><c:out value="${singolaPatolgia.getNome()}" /></h5></li> --%>
<%-- 		</c:forEach> --%>
<!-- 	</ul> -->
<!-- 	<hr> -->
	<form action="aggiungiPatologia" method="post" >

    <h5><p class="text-xl-center text-warning">Inserisci Patologia</p></h5>
    <input type="text" id="nomePatologia" name="nomePatologia" style="width:250px; height:50px;margin:auto" placeholder="Patologia"> <br>
<br>
  <input type="submit" style="width:150px; height:45px;margin:auto" name= action value="Aggiungi">


</form>
<form action="menuMedico.jsp">
		<input type="submit" style="width: 150px; height: 50px; margin: auto" value="Torna Indietro">
	</form>
</body>
</html>