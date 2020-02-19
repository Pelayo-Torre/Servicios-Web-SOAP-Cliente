<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<head>
<title>Amazin</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<header>
		<h1 class="header">Amazin.com</h1>
		<h2 class="centered">
			Lista de clientes del hotel:
		</h2>
	</header>
	<section>
	
		<article>
			<label class="mytitle">Listado de clientes:</label><br />
			
			<table class="table table-striped">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">Nombre</th>
			      <th scope="col">Email</th>
			      <th scope="col">DNI</th>
			      <th scope="col">Teléfono</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="client" items="${clients}">
				    <tr>
				      <th scope="row">${client.name }</th>
				      <td>${client.email }</td>
				      <td>${client.dni }</td>
				      <td>${client.telephone }</td>
				    </tr>
			    </c:forEach>
			  </tbody>
			</table>
			
			
		</article>
	</section>
	
</body>