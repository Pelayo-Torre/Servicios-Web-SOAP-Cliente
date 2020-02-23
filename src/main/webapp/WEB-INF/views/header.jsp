<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<header>
	<h1 class="header">Hoteles Amazin</h1>
	<spring:url value="/clients/add" var="newClient"></spring:url>
	<spring:url value="/clients/list" var="listClients"></spring:url>
	<spring:url value="/services/add" var="newService"></spring:url>
	<spring:url value="/services/list" var="listServices"></spring:url>
	<spring:url value="/rooms/add" var="newRoom"></spring:url>
	<spring:url value="/rooms/list" var="listRooms"></spring:url>
	
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  <!-- Links -->
	  <ul class="navbar-nav">
	    <li class="nav-item">
	      <a class="nav-link" href="#">Hoteles</a>
	    </li>
	    <!-- Dropdown -->
	    <li class="nav-item dropdown">
	      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
	        Clientes
	      </a>
	      <div class="dropdown-menu">
	        <a class="dropdown-item" href="${newClient}">Nuevo Cliente</a>
	        <a class="dropdown-item" href="${listClients}">Listado de Clientes</a>
	      </div>
	    </li>
	
	    <!-- Dropdown -->
	    <li class="nav-item dropdown">
	      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
	        Servicios
	      </a>
	      <div class="dropdown-menu">
	        <a class="dropdown-item" href="${ newService }">Nuevo Servicio</a>
	        <a class="dropdown-item" href="${ listServices }">Listado de Servicios</a>
	      </div>
	    </li>
	    
	    <li class="nav-item dropdown">
	      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
	        Habitación
	      </a>
	      <div class="dropdown-menu">
	        <a class="dropdown-item" href="${ newRoom }">Nueva Habitacion</a>
	        <a class="dropdown-item" href="${ listRooms }">Lista de Habitaciones</a>
	      </div>
	    </li>
	    
	  </ul>
	</nav>
</header>
<br>
