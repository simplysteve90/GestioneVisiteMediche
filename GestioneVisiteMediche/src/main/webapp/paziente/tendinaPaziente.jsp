<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tendina Paziente</title>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
		<a class="navbar-brand" href="#">Sezione Paziente</a>
		
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
			
				<li class="nav-item active"><a class="nav-link"
					href="<%=request.getContextPath()%>/paziente/menuPaziente.jsp">Home <span
						class="sr-only">(current)</span></a></li>
						
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/paziente/controlloAzione?azione=6">Aggiungi Appuntamento
					<span class="sr-only">(current)</span></a></li>
				
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/paziente/controlloAzione?azione=7">Annulla Appuntamento
					<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/paziente/controlloAzione?azione=8">Storico Appuntamenti
					<span class="sr-only">(current)</span>
				</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0"
				action="<%=request.getContextPath()%>/login.jsp">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">LogOut</button>
			</form>
		</div>
	</nav>
</body>
</html>