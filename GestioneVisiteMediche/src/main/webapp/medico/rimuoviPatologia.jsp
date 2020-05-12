<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rimuovi Patologia</title>
</head>
<body>
<%@include file="tendinaMedico.jsp"%>
<br><br>
<label for="patologia">Patologia</label>
<select name="patologia" id="patologia" >
<c:forEach items="${listaPatologie}" var="patologia">           
<option value=<c:out value = "${patologia.getNome()}"/>></option>
</c:forEach>
</select>
    <form action="rimuoviPatologia" method="post">
    <input type="text" hidden="true" name="patologia" value=<c:out value = "${patologia.getNome()}"/> >
       <button type="submit" class="btn btn-danger" >Annulla</button>
    </form>
    
</body>
</html>