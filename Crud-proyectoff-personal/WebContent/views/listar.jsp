<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado FF</title>
</head>
<body>
	<h1>Lista de todas las entradas de Final Fantasy DB</h1>

	<table border="1">
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
				<td> <a href="ffdbcontrol?opcion=editar&id=<c:out value="${ ffdbcontrol.id}"></c:out>"> <c:out value="${ ffdbcontrol.id}"></c:out>  </a> </td>
				<td> <c:out value="${ ffdbcontrol.nombre}"></c:out> </td>
				<td> <c:out value="${ ffdbcontrol.fecha}"></c:out></td>
				<td> <c:out value="${ ffdbcontrol.director}"></c:out> </td>
				<td><c:out value="${ ffdbcontrol.artista}"></c:out> </td>
				<td> <a href="ffdbcontrol?opcion=eliminar&id=<c:out value="${ ffdbcontrol.id}"></c:out>"> Eliminar  </a> </td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="index.jsp"> Volver al menú de opciones</a>
</body>
</html>