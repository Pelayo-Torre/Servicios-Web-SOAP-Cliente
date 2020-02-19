<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<head>
<title>Amazin</title>
<link rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<header>
		<h1 class="header">Amazin.com</h1>
		<h2 class="centered">
			Welcome to the <em>smallest</em> online shop in the world!!
		</h2>
	</header>
	<nav>
		<ul>
			<li><a href="#">Start</a></li>
			<li><a href="http://miw.uniovi.es">About</a></li>
			<li><a href="mailto:dd@email.com">Contact</a></li>
		</ul>
	</nav>
	<section>
		
		
		<form:form modelAttribute="client" action="clients/add" method="POST">	
		<form:input path="hotelId" value="1"/>
		<table>
			<tr>
				<td>Nombre:</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" style="color: red;"/></td>
			</tr>
			<tr>
				<td>DNI:</td>
				<td><form:input path="dni" /></td>
				<td><form:errors path="dni" style="color: red;"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" style="color: red;"/></td>
			</tr>
			<tr>
				<td>Teléfono:</td>
				<td><form:input path="telephone" /></td>
				<td><form:errors path="telephone" style="color: red;"/></td>
			</tr>
			<tr>
				<td><button type="submit" >Enviar</button></td>
				<td></td>
			</tr>
			
		</table>
	</form:form>
		
		
	</section>
	<footer>
		<strong> Master in Web Engineering (miw.uniovi.es).</strong><br /> <em>University
			of Oviedo </em>
	</footer>
</body>
