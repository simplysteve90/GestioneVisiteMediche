<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tendina Medico</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Sezione Medico</a>
  
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="<%=request.getContextPath()%>/medico/menuMedico.jsp">Home <span
						class="sr-only">(current)</span></a></li>
						
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/medico/controlloAzione?azione=1">Controllo Appuntamenti
					<span class="sr-only">(current)</span></a></li>
				
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/medico/controlloAzione?azione=2">Aggiungi
						Patologia<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/medico/controlloAzione?azione=3">Rimuovi
						Patologia<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/medico/controlloAzione?azione=4">Aggiungi Disponibilità
					<span class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/medico/controlloAzione?azione=5">Rimuovi Disponibilità
					<span class="sr-only">(current)</span></a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0"
				action="<%=request.getContextPath()%>/login.jsp">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">LogOut</button>
			</form>
		</div>
	</nav>
</body>
</html>