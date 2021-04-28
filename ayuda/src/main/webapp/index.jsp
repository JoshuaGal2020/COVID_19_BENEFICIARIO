<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONSULTA DE AYUDA</title>
<link rel="icon" href="RecursoImagen/virus.ico">
<link rel="stylesheet" href="Estilo/Estilo-index.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body class="body2">

	<div class="Arriba">
		<img src="RecursoImagen/imagen-gobierno-bukele.png" alt="GOBDeElSalvador" class="Logo">
	</div>
	<br>
	<br>
	<p class="intro">
		<strong> Aqui puedes Consultar quién de tú familia es beneficiario de la ayuda
		<br>economica para alimentación en la emergencia.
		</strong>
	</p>
	<form action="ControllerBeneficiario" method="post">
		<input type="text" name="dui"
			placeholder="Ingresar tu DUI 00000000-0" class="field"
			required> <input type="submit" value="CONSULTAR"
			class="consultar">
	</form>
	<br>

</body>
</html>