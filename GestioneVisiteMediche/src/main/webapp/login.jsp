<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
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
	<br>
	<form action="login" method="post">

		<h4>Inserisci Codice Fiscale</h4>
		<input type="text" id="codFiscale" name="codFiscale"
			style="width: 250px; height: 50px; margin: auto"
			placeholder="Codice Fiscale"> <br>
		<h4>Inserisci Password</h4>
		<input type="password" class="form-control " id="password"
			name="password" style="width: 250px; height: 50px; margin: auto"
			placeholder="Password"> <br>
		<button type="submit" style="width: 150px; height: 50px; margin: auto">Accedi</button>

	</form>
	<form action="registrazione.jsp">
		<button type="submit" style="width: 150px; height: 50px; margin: auto">Registrazione</button>

	</form>

</body>
</html>