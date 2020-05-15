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
		<a class="navbar-brand" >Sezione Medico</a>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					 <form class="form-inline my-2 my-lg-0" action="<%=request.getContextPath()%>/medico/menuMedico.jsp">
				<button class="w3-button w3-white w3-padding-large w3-hover-black"
						style="width: 150px; height: 50px; margin: auto" type="submit"> Home </button> </form> </li>

				<li class="nav-item">
					<button class="w3-button w3-white w3-padding-large w3-hover-black"
						onclick="document.getElementById('id01').style.display='block'"
						style="width: 150px; height: 50px; margin: auto" name="azione" value="1">Controllo
						Appuntamenti</button>
				</li>
	
				<li class="nav-item">
				 <form class="form-inline my-2 my-lg-0" action="controlloAzione">
				<button class="w3-button w3-white w3-padding-large w3-hover-black" 
						style="width: 150px; height: 50px; margin: auto" type="submit" name="azione" value="2" > Aggiungi
						Patologia</button> </form></li>

				<li class="nav-item"> 
				<form class="form-inline my-2 my-lg-0" action="controlloAzione">
				<button	class="w3-button w3-white w3-padding-large w3-hover-black"
						style="width: 150px; height: 50px; margin: auto" type="submit" name="azione" value="3">Rimuovi
						Patologia</button> </form> </li>

				<li class="nav-item"><button class="w3-button w3-white w3-padding-large w3-hover-black"
						style="width: 150px; height: 50px; margin: auto" name="azione" value="4">
						onclick="document.getElementById('id01').style.display='block'">
						Aggiungi Disponibilità</button></li>


				<li class="nav-item"><button
						class="w3-button w3-white w3-padding-large w3-hover-black"
						onclick="document.getElementById('id01').style.display='block'"
						style="width: 150px; height: 50px; margin: auto" name="azione" value="5">Rimuovi
						Disponibilità</button></li>
			</ul>
			<form class="form-inline my-2 my-lg-0"
				action="<%=request.getContextPath()%>/login.jsp">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">LogOut</button>
			</form>
		</div>
	</nav>
	<script>
		// Get the modal
		var modal = document.getElementById('id01');

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
	</script>

	<div id="id01" class="modal">
		<form class="modal-content animate" action="controlloAzione">
			<div class="imgcontainer">
				<span onclick="document.getElementById('id01').style.display='none'"
					class="close" title="Close Modal">&times;</span>
			</div>
			<div class="container1"> 
		<input type="hidden"  value="opener"> 
				<input type="date" id="data" name="data"
					value=<%=request.getAttribute("data")%>
					onchange="this.form.submit();">
				<button class="btn btn-danger" type="button"
					onclick="document.getElementById('id01').style.display='none'">Annulla</button>
			</div>
		</form>
	</div>
</body>

</html>