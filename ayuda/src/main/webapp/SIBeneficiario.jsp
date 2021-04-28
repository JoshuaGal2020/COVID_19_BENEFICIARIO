<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="Estilo/Estilo-sibeneficiario.css">
<link rel="icon" href="RecursoImagen/virus.ico">
<link rel="preconnect" href="https://fonts.gstatic.com">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@600&display=swap"
	rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body class="body2">
<%
	HttpSession sesion = (HttpSession) request.getSession();
	String usuSession = String.valueOf(sesion.getAttribute("beneficiario"));
	String fullname = String.valueOf(sesion.getAttribute("fullname"));
	System.out.println("El Beneficiario: " + usuSession);

	if (usuSession.equals(null) || usuSession.equals("null")) {
		response.sendRedirect("index.jsp");
	}
	%>
	<div class="Arriba">
		<img src="RecursoImagen/imagen-gobierno-bukele.png" alt="GOBElSalvador" class="Logo">
	</div>
	
	<br>
	<p class="intro">
		<strong> <%=fullname%>, Eres beneficiario del apoyo
			económico por parte del gobierno<br> de $300.00 de ayuda a familias.
		</strong>
	</p>
	<br>
	
	<form action="ControllerBeneficiario" method="post">
		<input type="submit" name="sibeneficiario" value="Volver a consultar" class="regresar">
	</form>

</body>
</html>