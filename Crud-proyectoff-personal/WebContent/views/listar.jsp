<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado FF</title>
<link rel="stylesheet" href="Stylesheet.css">
</head>
<body>
	<header>
		<img class="img-cabecera" src="images/LOGO3.png" alt="Logo de Final Fantasy Data Base">
	</header>
	<div class="navVolver">
		<div class="cuadro izq">
			<div class="claseTitulo">
				<img src="images/moogle.png" alt="Característico cursor de la saga Final Fantasy">
				<h1>Lista de todas las entradas de Final Fantasy DB</h1>
			</div>
		</div>
		<div class="cuadro der">
				<a class="boton"href="index.jsp"> Volver al menú de opciones</a>
		</div>
	</div>
	<div class="cuadro">
		<table class="tabla " id="idLista" border="1">
			<tr>
				<td>Id</td>
				<td>Nombre</td>
				<td>Año de lanzamiento</td>
				<td>Director</td>
				<td>Artista principal</td>
				<td>Accion</td>
			</tr>
			<c:forEach var="ffdbcontrol" items="${lista}">
				<tr>
					<td> <c:out value="${ ffdbcontrol.id}"></c:out> </td>
					<td> <c:out value="${ ffdbcontrol.nombre}"></c:out> </td>
					<td> <c:out value="${ ffdbcontrol.fecha}"></c:out></td>
					<td> <c:out value="${ ffdbcontrol.director}"></c:out> </td>
					<td><c:out value="${ ffdbcontrol.artista}"></c:out> </td>
					<td> <a class="eliminar" href="ffdbcontrol?opcion=eliminar&id=<c:out value="${ ffdbcontrol.id}"></c:out>"> Eliminar  </a><br/><a class="editar" href="ffdbcontrol?opcion=editar&id=<c:out value="${ ffdbcontrol.id}"></c:out>"> Editar  </a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	
</body>
</html>