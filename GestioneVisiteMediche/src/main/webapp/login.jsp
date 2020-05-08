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
	<nav class="navbar navbar-expand-lg navbar-lg bg-light fixed-top">
		


			<div class="col-sm" >
				<img alt="" class="logo" src="media/nome.png">
			</div>
			<div class="col-sm" >
				
			</div>
			<div class="col-sm" align="right" >
			<form action="login" method="post">
				<input type="text" id="codFiscale" name="codFiscale" placeholder="Codice Fiscale" required="required"> 
				<input type="password" id="password" name="password" placeholder="Password" required="required">
				<button type="submit" value="1" name="action" class="pulsante"> <b> Accedi </b> </button>
				<button type="submit" value="2" name="action" class="pulsante" formnovalidate="formnovalidate"> <b>Registrazione</b></button>
				</form>
				</div>
				
			





		
	</nav>
	</header>
	
<div class="messaggi" align="center">

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
</div>
<div class="container contenitore"align="center">
<h1 class="h">I NOSTRI SPECIALISTI</h1>
  <div class="row">
    <div class="col-sm">
     <img alt="" class="dr" src="media/nowzaradan.jpg">
     <h3 class="h">Dott. Nowzaradan</h3>
    </div>
    <div class="col-sm">
     <img alt="" class="dr" src="media/sins.jpg">
      <h3 class="h">Dott. Sins</h3>
    </div>
    <div class="col-sm">
      <img alt="" class="dr" src="media/strange.jpg">
       <h3 class="h">Dott. Strange</h3>
    </div>
    <div class="col-sm">
      <img alt="" class="dr" src="media/strange.jpg">
       <h3 class="h">Dott. Strange</h3>
    </div>
  </div>
</div>



</body>
</html>