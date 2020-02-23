<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<head>
<title>Amazin</title>
<link href="<c:url value="/resources/css/listClients.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<h3 class="centered">Reservas del Cliente</h3>
	<br>
	<section>
		<article>
			<label class="mytitle">Listado de reservas:</label><br>
			<table class="table table-striped">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">Fecha de Inicio</th>
			      <th scope="col">Fecha de Finalización</th>
			      <th scope="col">Precio</th>
			      <th scope="col">Cancelada</th>
			      <th scope="col"></th>
				  <th scope="col"></th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="booking" items="${bookings}">
			  	
		  			<spring:url value="/clients/edit/{id}" var="edit">
				   		<spring:param name="id" value="${ booking.idBooking }" />
				 	</spring:url>
				 
					 <spring:url value="/clients/desactivate/{id}" var="desactivate">
					   <spring:param name="id" value="${ booking.idBooking }" />
					 </spring:url>
			  	
				    <tr>
				      <th scope="row">${booking.startDate }</th>
				      <td>${booking.endDate }</td>
				      <td>${booking.price }</td>
				      				      
				      <c:if test="${ booking.cancelled == '1' }">
				      	<td>CANCELADA</td>
				      	<td><a href="${ edit }" title="Editar"><span class="fas fa-edit"></span></a></td>
				      </c:if>
				      <c:if test="${ booking.cancelled == '0' }">
				      	<td>NO CANCELADA</td>
				      	<td><a href="${ edit }" title="Editar"><span class="fas fa-edit"></span></a>  |  
				      	<a href="${ desactivate }" title="Desactivar"><span class="fas fa-trash"></span></a></td>
				      </c:if>
				      
				      <td><a class="btn btn-primary" href="#" role="button">S y H</a></td>
				      
				    </tr>
			  	
			  		
			    </c:forEach>
			  </tbody>
			</table>
			
			
		</article>
	</section>
	
</body>