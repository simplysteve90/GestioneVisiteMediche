<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Storico Appuntamento</title>
</head>
<body>
<%@include file="tendinaPaziente.jsp"%>
<table>
  <tr>
    <th>Paziente</th>
    <th>Data</th>
    <th>Ora Inizio</th>
    <th>Ora Fine</th>
    <th>Patologia</th>
  </tr>

  <c:forEach items="${storicoApp}" var="app">

  <tr>
    <td>
    <c:out value = "${app.getUtente().getCodiceFiscale()}"/>
    </td> 
    <td>
    <c:out value = "${app.getDisponibilita().getData()}"/>
    </td>
    <td>
    <c:out value = "${app.getDisponibilita().getOraInizio()}"/>
    </td>
     <td>
    <c:out value = "${app.getDisponibilita().getOraFine()}"/>
    </td>
    <td>
    <c:out value = "${app.getPatologia().getNome()}"/>
    </td> 
    <td> 
      <c:if test = "${app.isEffettuato()==true}">
         <c:out value = "Effettuato"/>
      </c:if>
    </td> 
  </tr>

  </c:forEach>

</table>
</body>
</html>