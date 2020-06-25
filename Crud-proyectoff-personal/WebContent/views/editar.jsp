<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar entrga FF</title>
</head>
<body>
<h1>Editar entrada</h1>

<form  class="cuadro" action="ffdbcontrol" method="post">
<c:set var="juegos" value="${juegos}"> </c:set>
	<input type="hidden" name="opcion" value="editar">
	<input type="hidden" name="id" value="${juegos.id}">
		<table border="1">
	
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre" size="50" value="${juegos.nombre}"></td>
			</tr>
			<tr>
				<td>Año de lanzamiento:</td>
				<td><input type="text" name="fecha" size="50" value="${juegos.fecha}"></td>
			</tr>
			<tr>
				<td>Director:</td>
				<td><input type="text" name="director" size="50" value="${juegos.director}"></td>
			</tr>	
			<tr>
				<td>Artista principal:</td>
				<td><input type="text" name="artista" size="50" value="${juegos.artista}"></td>
			</tr>		
		</table>
		<input type="submit" value="Guardar">
	</form>
	
	<a href="index.jsp"> Volver al menú de opciones</a>
	
</body>
</html>