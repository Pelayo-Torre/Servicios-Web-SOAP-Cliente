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
	
	<h3 class="centered">Actualizar habitación.</h3>
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
			<form:form modelAttribute="roomEdit" action="/Amazin/rooms/edit" method="POST">
			  <form:input type="hidden" path="id" class="form-control" id="exampleInputEmail1" />
			  <div class="form-group">
			    <label for="exampleInputEmail1">Código:</label>
			    <form:input type="text" path="code" class="form-control" id="exampleInputEmail1" aria-describedby="nameHelp" placeholder="Ej: 1A" />
			    <small id="nameHelp" class="form-text text-muted">Código de la habitación.</small>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Precio:</label>
			    <form:input type="number" step="0.01" path="price" class="form-control" id="exampleInputEmail" placeholder="Ej: 50.25"/>
			  </div>
			  <div class="form-group">
			  	<label for="exampleInputPassword1">Tipo de Habitación:</label>
			    <form:radiobutton path="type" value="0"/>Individual 
				<form:radiobutton path="type" value="1"/>Doble 
				<form:radiobutton path="type" value="2"/>Matrimonial 
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
