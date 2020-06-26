<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Introducir FF</title>
<link rel="stylesheet" href="Stylesheet.css">
</head>
<body>
	<header> <img class="img-cabecera" src="images/LOGO3.png"
		alt="Logo de Final Fantasy Data Base"> </header>
		
		<div class="navVolver">
		<div class="cuadro izq">
			<div class="claseTitulo">
				<img src="images/moogle.png" alt="Característico cursor de la saga Final Fantasy">
				<h1>Introducir entrega Final Fantasy a la Base de Datos</h1>
			</div>
		</div>
		<div class="cuadro der">
				<a class="boton"href="index.jsp"> Volver al menú de opciones</a>
		</div>
	</div>
	
<div class="cuadro">
	<form class="tabla"  action="ffdbcontrol" method="post">
		<input type="hidden" name="opcion" value="guardar">
		<table id="idGuardar" border="1">

			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre" size="50"></td>
			</tr>

			<tr>
				<td>Año de lanzamiento:</td>
				<td><input type="text" name="fecha" size="50"></td>
			</tr>
			<tr>
				<td>Director:</td>
				<td><input type="text" name="director" size="50"></td>
			</tr>
			<tr>
				<td>Artista principal:</td>
				<td><input type="text" name="artista" size="50"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Guardar"></td>

			</tr>

		</table>

	</form>
</div>
	
</body>
</html>