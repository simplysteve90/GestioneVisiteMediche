<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi Disponibilità</title>
</head>
<body>
<%@include file="tendinaMedico.jsp"%>


<br>
	<form action="aggiungiDisponibilita" method="post" >

	<h5>Inserisci Ora Inizio</h5>
    <input type="number" id="oraInizio" name="oraInizio" style="width:250px; height:50px;margin:auto" placeholder="Ora Inizio"> <br>
<br>
<h5>Inserisci Ora Fine</h5>
    <input type="number" id="oraFine" name="oraFine" style="width:250px; height:50px;margin:auto" placeholder="Ora Fine"> <br>
<br>
<input type="date" hidden="true" name="data" value= <%=request.getAttribute("data") %>>
  <input type="submit" style="width:150px; height:45px;margin:auto" value="Aggiungi">


</form>
<form action="menuMedico.jsp">
		<input type="submit" style="width: 150px; height: 50px; margin: auto" value="Torna Indietro">
	</form>
</body>
</html>