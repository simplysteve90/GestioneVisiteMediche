<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%@include file="tendinaMedico.jsp"%>
<br>
<br>
<table>
  <tr>
    <th>Nome</th>
    <th>Hero Power</th>    
    <th>Descrizione</th>
  </tr>
  
  <c:forEach items="${lista}" var="eroe">
         
  <tr>             
	<td>
            <c:out value = "${eroe.getNome()}"/>  
	</td> 
	<td>
            <c:out value = "${eroe.getPower()}"/>  
	</td>  
	<td>
            <c:out value = "${eroe.getDescrizione()}"/>  
	</td>  
	<td>
	<form action="rimuoviEroe" method="post">
	<input type="number" hidden="true" name="idEroe" value=<c:out value = "${eroe.getIdEroe()}"/> >
       <button type="submit" class="btn btn-danger" >Rimuovi</button>
	</form>
	</td>
  </tr>
	
  </c:forEach>
	
</table>

</body>
</html>