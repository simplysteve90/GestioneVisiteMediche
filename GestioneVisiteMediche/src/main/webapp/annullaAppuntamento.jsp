<%@page import="it.dstech.model.Utente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Annulla Appuntamento</title>
</head>
<body>
<%Utente utente =(Utente)session.getAttribute("Utente");
if(utente.getRuolo().equals("paziente") ){
		%>
<%@include file="/paziente/tendinaPaziente.jsp"%>
<%}else{%>
<%@include file="/medico/tendinaMedico.jsp"%>
<%}%>
<br><br>
<table>
  <tr>
    <th>Paziente</th>
    <th>Data</th>
    <th>Ora Inizio</th>
    <th>Ora Fine</th>
    <th>Patologia</th>
  </tr>

  <c:forEach items="${listaAppuntamenti}" var="app">

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
    <td>
    <c:out value = "${app.getPatologia().getNome()}"/>
    </td> 
    <td>
    <form action="annullaAppuntamento" method="post">
    <input type="number" hidden="true" name="idApp" value=<c:out value = "${app.getIdAppuntamento()}"/> >
       <button type="submit" class="btn btn-danger" >Annulla</button>
    </form>
    </td>
  </tr>

  </c:forEach>

</table>
</body>
</html>