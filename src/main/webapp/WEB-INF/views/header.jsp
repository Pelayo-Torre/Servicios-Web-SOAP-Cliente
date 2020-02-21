<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<header>
	<h1 class="header">Hotel Manager</h1>
	<spring:url value="/clients/add" var="newClient"></spring:url>
	<spring:url value="/clients/list" var="listClients"></spring:url>
	
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
	        <a class="dropdown-item" href="#">Nuevo Servicio</a>
	        <a class="dropdown-item" href="#">Listado de Servicios</a>
	      </div>
	    </li>
	    
	    <!-- Dropdown -->
	    <li class="nav-item dropdown">
	      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
	        Reserva
	      </a>
	      <div class="dropdown-menu">
	        <a class="dropdown-item" href="#">Nueva Reserva</a>
	        <a class="dropdown-item" href="#">Lista de Reservas</a>
	      </div>
	    </li>
	    
	  </ul>
	</nav>
</header>
<br>
