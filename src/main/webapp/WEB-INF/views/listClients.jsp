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
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link href="<c:url value="/resources/css/listClients.css" />" rel="stylesheet">
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
			      <th scope="col">Telefono</th>
			      <th scope="col"></th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="client" items="${clients}">
			  	
			  		<spring:url value="/url/path/{variableName}">
					   <spring:param name="variableName" value="more than JSTL c:url" />
					 </spring:url>
			  	
				    <tr>
				      <th scope="row">${client.name }</th>
				      <td>${client.email }</td>
				      <td>${client.dni }</td>
				      <td>${client.telephone }</td>
				      <td><a href="" >Editar</a> ||   <a href="">Eliminar</a></td>
				    </tr>
			    </c:forEach>
			  </tbody>
			</table>
			
			
		</article>
	</section>
	
</body>