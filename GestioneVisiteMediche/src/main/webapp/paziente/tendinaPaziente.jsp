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
			<li class="nav-item active">
				 <form class="form-inline my-2 my-lg-0" action="<%=request.getContextPath()%>/paziente/menuPaziente.jsp">
				<button class="w3-button w3-white w3-padding-large w3-hover-black"
						style="width: 150px; height: 50px; margin: auto" type="submit"> Home </button> </form> </li>

				<li class="nav-item">
					<button class="w3-button w3-white w3-padding-large w3-hover-black"
						onclick="document.getElementById('id01').style.display='block'"
						style="width: 150px; height: 50px; margin: auto" name="azione" value="6">Aggiungi appuntamento
						</button>
				</li> 
	
				<li class="nav-item">
				 <form class="form-inline my-2 my-lg-0" action="controlloAzione">
				<button class="w3-button w3-white w3-padding-large w3-hover-black" 
						style="width: 150px; height: 50px; margin: auto" type="submit" name="azione" value="7" > Rimuovi Appuntamento
						</button> </form></li>

				<li class="nav-item"> 
				<form class="form-inline my-2 my-lg-0" action="controlloAzione">
				<button	class="w3-button w3-white w3-padding-large w3-hover-black"
						style="width: 150px; height: 50px; margin: auto" type="submit" name="azione" value="8">Storico Appuntamenti 
						</button> </form> </li>
						
			</ul>
			
			<form class="form-inline my-2 my-lg-0"
				action="<%=request.getContextPath()%>/login.jsp">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">LogOut</button>
			</form>
		</div>
	</nav>
</body>
</html>