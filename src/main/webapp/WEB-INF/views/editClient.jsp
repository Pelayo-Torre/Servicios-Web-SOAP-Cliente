<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<head>
<title>Hotels</title>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/bootstrap.min.css"> 
<link href="<c:url value="/resources/css/addClient.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	
	<h3 class="centered">Actualizar cliente.</h3>
	<br>
	<section>
		<c:if test="${ error ne '' }">
			<div class="alert alert-danger alert-dismissible fade show" role="alert">
			  <strong>${error}</strong>
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
			    <span aria-hidden="true">&times;</span>
			  </button>
			</div>
		</c:if>
		
		
		<h6>Rellene el siguiente formulario</h6>
		<div>
			<form:form modelAttribute="clientEdit" action="/Amazin/clients/edit" method="POST">
			  <form:input type="hidden" path="idClient" class="form-control" id="exampleInputEmail1" />
			  <div class="form-group">
			    <label for="exampleInputEmail1">Nombre:</label>
			    <form:input type="text" path="name" class="form-control" id="exampleInputEmail1" aria-describedby="nameHelp" placeholder="Ej: Pablo Torre Corte" />
			    <small id="nameHelp" class="form-text text-muted">Nombre y apellidos.</small>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Correo:</label>
			    <form:input type="email" path="email" class="form-control" id="exampleInputEmail" placeholder="Ej: pabloTorre@gmail.com"/>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">DNI:</label>
			    <form:input type="text" path="dni" class="form-control" id="exampleInputPassword1" placeholder="Ej: 94651163E"/>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Telefono:</label>
			    <form:input type="text" path="telephone" class="form-control" id="exampleInputPassword1" placeholder="Ej: 659874328"/>
			  </div>
			  <div class="form-group">
			  	<form:radiobutton path="active" value="1"/>Activo 
				<form:radiobutton path="active" value="0"/>Inactivo 
			  </div>
			  
			 
			  
			  <button type="submit" class="btn btn-primary">Enviar</button>
			</form:form>
		</div>
	</section>
</body>
