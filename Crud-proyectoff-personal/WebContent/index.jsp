<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Final Fantasy DB</title>
   
	<!--Scrip de JS y Jquery-->
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
    <script src="javascript/script.js"></script>
    
    <!--CSS-->
	<link rel="stylesheet" href="css/Stylesheet.css">
</head>
<body>

	<header>
		<img class="img-cabecera" src="images/LOGO3.png" alt="Logo de Final Fantasy Data Base">
	</header>
	
	<main>
		<div class="cuadro">
			<div class="claseTitulo izq">
				<img src="images/moogle.png" alt="Caracter�stico cursor de la saga Final Fantasy">
				<h1>Men� principal</h1>
			</div>
			<div class="claseTitulo izq">
				<h2>-Selecciona una opci�n:</h2>
			</div>
		</div>
		
		<div class="cuadro">
			<ul class="menuPrin">
				<li>
					<a class="boton" id="op1" href="ffdbcontrol?opcion=insertar">
						<img class="oculto" id="curOp1" src="images/cursorff-peq.png">
						Introducir una entrada nueva
					</a>
				</li>
			</ul>
				<hr>
			<ul class="menuPrin">
				<li>
					<a class="boton" id="op2" href="ffdbcontrol?opcion=listar"> 
						<img class="oculto" id="curOp2" src="images/cursorff-peq.png"> 
						Lista de juegos Final Fantasy
					</a>
				</li>
			</ul>
		</div>

	</main>
	

</body>
</html>