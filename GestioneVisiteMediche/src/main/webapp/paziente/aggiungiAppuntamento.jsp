<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi Appuntamento</title>
</head>
<body>
<%@include file="tendinaPaziente.jsp"%>
<br> <br>
<form action="aggiungiAppuntamento" method="post">
  <label for="disponibilita">Inserisci la data:</label>
  <input type="datetime-local" id="disponibilita" name="disponibilita">
  <br>
  <br>  
<label for="patologia">Inserisci la patologia:</label>
  <select name="patologia" id="patologia">
<c:forEach items="${stampaPatologia}" var="patologia">
<option><c:out value="${patologia.getNome()}" /></option>
</c:forEach>
</select>
<br>

<input type="text" hidden="true" name="patologia" value=<c:out value = "${patologia.getNome()}"/> >
  <input style="padding: 8px;margin-left:15%;margin-top:0.5%;" type="submit" value="Conferma" >
</form>

<form action="menuPaziente.jsp">
<input style="padding: 8px;margin-left:15%;margin-top:0.5%;" type="submit" value="Indietro">
</form>
</body>
</body>
</html>
