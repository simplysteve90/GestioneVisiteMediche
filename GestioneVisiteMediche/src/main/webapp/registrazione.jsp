<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
	<form action="registrazione" method="post" enctype="multipart/form-data">

		<input type="text" id="codFiscale" name="codFiscale" style="width: 250px; height: 50px; margin: auto"placeholder="Codice Fiscale"> 
		<input type="password" id="password" name="password" style="width: 250px; height: 50px; margin: auto" placeholder="Password"> 
		<input type="text" id="nome" name="nome" style="width: 250px; height: 50px; margin: auto" placeholder="nome"> 
		<input type="text" id="cognome" name="cognome" style="width: 250px; height: 50px; margin: auto"	placeholder="cognome"> 
		<input type="email" id="email" name="email" placeholder="you@example.com">
		<input type="file" name="image" id="image" placeholder="Inserisci l'immagine">

		<button type="submit" style="width: 150px; height: 50px; margin: auto">Registrati</button>
	</form>

	<form action="login.jsp">
		<input type="submit" style="width: 150px; height: 50px; margin: auto" value="Torna Indietro">
	</form>
</body>
</html>