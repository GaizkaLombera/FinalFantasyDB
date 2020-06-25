<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Final Fantasy DB</title>
<link rel="stylesheet" href="Stylesheet.css">
</head>
<body>

	<header>
		<img class="img-cabecera" src="LOGO3.png" alt="Logo de Final Fantasy Data Base">
	</header>
	
	<main>
		<div class="cuadro">
			<div id="idTitulo">
				<img src="cursorff-peq.png" alt="Característico cursor de la saga Final Fantasy">
				<h1>Menú principal</h1>
			</div>
			<div>
				<h2>-Selecciona una opción:</h2>
			</div>
		</div>
		
		<div class="cuadro">
			<ul class="menuPrin">
				<li><a class="boton" href="ffdbcontrol?opcion=insertar"> Introducir una entrada nueva</a></li>
			</ul>
				<hr>
			<ul class="menuPrin">
				<li><a class="boton" href="ffdbcontrol?opcion=listar"> Lista de juegos Final Fantasy</a></li>
			</ul>
		</div>

	</main>
	

</body>
</html>