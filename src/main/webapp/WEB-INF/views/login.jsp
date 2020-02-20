<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<head>
<title>Amazin</title>
<link rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css"> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
 <link href="<c:url value="/resources/css/addClient.css" />" rel="stylesheet">

</head>
<body>
	<header>
		<h1 class="header">Trip Advisor</h1>
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="#">Navbar</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Link</a>
		      </li>
		      <li class="nav-item dropdown">
		        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		          Dropdown
		        </a>
		        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
		          <a class="dropdown-item" href="#">Action</a>
		          <a class="dropdown-item" href="#">Another action</a>
		          <div class="dropdown-divider"></div>
		          <a class="dropdown-item" href="#">Something else here</a>
		        </div>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link disabled" href="#">Disabled</a>
		      </li>
		    </ul>
		    
		  </div>
		</nav>
		
		
		<h3 class="centered">
			Creación de nuevo cliente.
		</h3>
	</header>
	<br>
	<section>
		<h6>Rellene el siguiente formulario</h6>
		<div>
			<form:form modelAttribute="client" action="clients/add" method="POST">
			  <form:input path="hotelId" value="1" type="hidden"/>
			  <div class="form-group">
			    <label for="exampleInputEmail1">Nombre:</label>
			    <form:input type="text" path="name" class="form-control" id="exampleInputEmail1" aria-describedby="nameHelp" placeholder="Introduzca su nombre" />
			    <small id="nameHelp" class="form-text text-muted">Nombre y apellidos.</small>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Correo:</label>
			    <form:input type="email" path="email" class="form-control" id="exampleInputEmail" placeholder="Introduzca su correo electrónico"/>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">DNI:</label>
			    <form:input type="text" path="dni" class="form-control" id="exampleInputPassword1" placeholder="Introduzca su DNI"/>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Teléfono:</label>
			    <form:input type="text" path="telephone" class="form-control" id="exampleInputPassword1" placeholder="Introduzca su número de teléfono"/>
			  </div>
			  <button type="submit" class="btn btn-primary">Enviar</button>
			</form:form>
		</div>
	</section>
</body>
