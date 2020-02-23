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
	
	<h3 class="centered">Nueva Reserva.</h3>
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
		
		
		<h6>Lista de servicios disponibles</h6>
		<div>
			<form:form modelAttribute="serviceBooking" action="/Amazin/bookings/add/services" method="POST">
			  <form:input path="idBooking" type="hidden" value="${idBooking}"/>
			  <form:input path="idClient" type="hidden" value="${idClient}"/>
			  <div class="form-group">
			  
			  	<c:forEach var="service" items="${services}">
			  	
			  		<c:if test="${service.selected}">
			  			<form:checkbox checked ="true" path="seleccionados" value="${service.idService}"/>${service.name} 
			  		</c:if>	
			  		<c:if test="${not service.selected}">
			  			<form:checkbox path="seleccionados" value="${service.idService}"/>${service.name} 
			  		</c:if>			  		
			  	
			  	</c:forEach>
			  				  
			  </div>
			  
			  <button type="submit" class="btn btn-primary">Enviar</button>
			</form:form>
		</div>
	</section>
</body>
