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
<%@include file="tendinaMedico.jsp"%>
<br>
	<form action="aggiungiPatologia" method="post" >

    <h5>Inserisci Patologia</h5>
    <input type="text" id="nomePatologia" name="nomePatologia" style="width:250px; height:50px;margin:auto" placeholder="Patologia"> <br>
<br>
  <input type="submit" style="width:150px; height:45px;margin:auto" value="Aggiungi">


</form>
<form action="menuMedico.jsp">
		<input type="submit" style="width: 150px; height: 50px; margin: auto" value="Torna Indietro">
	</form>
</body>
</html>