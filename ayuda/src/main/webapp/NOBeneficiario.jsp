<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="icon" href="RecursoImagen/virus.ico">
<link rel="stylesheet" href="Estilo/Estilo-nobeneficiario.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@600&display=swap"
	rel="stylesheet">
</head>
<body class="body2">
	<%
	HttpSession sesion = (HttpSession) request.getSession();
	String usuSession = String.valueOf(sesion.getAttribute("nobeneficiario"));
	System.out.println("Beneficiario: " + usuSession);

	if (usuSession.equals(null) || usuSession.equals("null")) {
		response.sendRedirect("index.jsp");
	}
	%>
	<div class="Arriba">
		<img src="RecursoImagen/imagen-gobierno-bukele.png" alt="GOBElSalvador" class="Logo">
	</div>
	<br>
	<p class="intro">
		<strong>Este DUI no se ha encontrado en nuestro registro. <br>Intentar m�s tarde,
			con otro DUI o el de otro familiar.
		</strong>
	</p>
	<br>
	<form action="ControllerBeneficiario" method="post">
		<input type="submit" name="NObeneficiario" value="Volver a consultar" class="regresar">
	</form>

</body>
</html>