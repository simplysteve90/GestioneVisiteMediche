<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="static/style.css">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<body>
<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		


			<div class="col-sm" >
				<p>Ciao</p>
			</div>
			<div class="col-sm" >
				<p>Ciao</p>
			</div>
			<div class="col-sm"  >
			<form action="login" method="post">
				<input type="text" id="codFiscale" name="codFiscale" placeholder="Codice Fiscale" required="required"> 
				<input type="password" id="password" name="password" placeholder="Password" required="required">
				<button type="submit" value="1" name="action" class="pulsante">  Accedi  </button>
				<button type="submit" value="2" name="action" class="pulsante" formnovalidate="formnovalidate">Registrazione</button>
				</form>
				</div>
				
			





		
	</nav>
	</header>
	<%
		session.getAttribute("username");
	%>


	<%
		String mess = (String) request.getAttribute("messaggio");
	if (mess != null) {
	%>
	<h4>
		<%=mess%>
	</h4>
	<%
		}
	%><br>




</body>
</html>