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
<title>Registrazione</title>
</head>
<body>
<div align="center" class="contenitore2">

	<form action="registrazione" method="post" enctype="multipart/form-data">

		<input type="text" class="reg" id="codFiscale" name="codFiscale" placeholder="Codice Fiscale" required="required"> <br>
		<input type="password" class="reg" id="password" name="password"  placeholder="Password" required="required"> <br>
		<input type="text" class="reg" id="nome" name="nome"  placeholder="nome" required="required"> <br>
		<input type="text" class="reg"id="cognome" name="cognome" 	placeholder="cognome" required="required"> <br>
		<input type="email" class="reg" id="email" name="email" placeholder="you@example.com" required="required"><br>
		<input type="file" class="reg" name="image" id="image" placeholder="Inserisci l'immagine" required="required"><br>

		<button type="submit" class="pulsante2"  >Registrati</button>
		
	</form>
	</div>
<div align="center">
	<form action="login.jsp">
		<input type="submit" class="pulsante2"   value="Torna Indietro">
	</form>
	</div>
</body>
</html>