<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar entrga FF</title>
<link rel="stylesheet" href="Stylesheet.css">
</head>
<body>
	<header> <img class="img-cabecera" src="images/LOGO3.png"
		alt="Logo de Final Fantasy Data Base"> </header>

	<div class="navVolver">
		<div class="cuadro izq">
			<div class="claseTitulo">
				<img src="images/moogle.png" alt="Característico cursor de la saga Final Fantasy">
				<h1>Menú de edición</h1>
			</div>
		</div>
		<div class="cuadro der">
				<a class="boton"href="index.jsp"> Volver al menú de opciones</a>
		</div>
	</div>

<div class="cuadro">
	<form class="tabla" id="idEditar" action="ffdbcontrol" method="post">
		<c:set var="juegos" value="${juegos}">
		</c:set>
		<input type="hidden" name="opcion" value="editar"> <input
			type="hidden" name="id" value="${juegos.id}">
		<table id="idEditar" border="1">

			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre" size="30"
					value="${juegos.nombre}"></td>
			</tr>
			<tr>
				<td>Año de lanzamiento:</td>
				<td><input type="text" name="fecha" size="30"
					value="${juegos.fecha}"></td>
			</tr>
			<tr>
				<td>Director:</td>
				<td><input type="text" name="director" size="30"
					value="${juegos.director}"></td>
			</tr>
			<tr>
				<td>Artista principal:</td>
				<td><input type="text" name="artista" size="30"
					value="${juegos.artista}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Guardar"></td>
				
			</tr>	
		</table>
	</form>
	
	</div>
</body>
</html>