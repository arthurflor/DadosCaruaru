<%-- 
    Document   : resultado
    Created on : 08/03/2016, 13:24:08
    Author     : iago
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Dados Abertos Caruaru</title>
        <link rel="shortcut icon" href="assets/favicon.png" type="image/x-icon">
	<script src="js/jquery.js"></script>
	<!--<script src="js/bootstrap.js"></script>-->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">

        <script type="text/JavaScript" src="js/consulta.js"></script>
        <script data-main="js/app/main.dataset.js" src="js/lib/require.js"></script>
        <script type="text/javascript" src="js/googleCharts.js"></script>
</head>
<body>
<div id="lista_dataset" class="dataset-selector-container" style="display:none;"></div>
<a href="index.html"> <img class="banner" src="assets/banner.jpg"> </a>
<br>
<br/>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="index.html">Home</a></li>
	        <li><a href="dadosabertos.html">O que são dados abertos?</a></li>
                <li><a href="consultas.html">Consultas</a></li>
<!--	        <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Consultas <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Saúde</a></li>
          </ul>-->
        </li>
	        <li><a href="caruaru.html">Caruaru</a></li>
	        <li><a href="aboutus.html">Sobre</a></li>
	        <li><a href="contato.html">Contato</a></li>
      </ul>
<!--      <ul class="nav navbar-nav navbar-right">
        <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-danger">Ok</button>
      </form>
      </ul>-->
    </div>
  </div>
</nav>

<div class="col-md-12 content" style="margin-left:10px">
	<div class="news">
		<hr>
		<h2 style="margin-left:5px">Saúde</h2>
		<hr>
	</div>

<!--	<h4>Saúde</h4>-->
	<p>
            <% 
                String codigoDoGrafico;
                codigoDoGrafico = (String)request.getAttribute("dados");
                out.println(codigoDoGrafico);
            %>
        </p>
	<hr>
	
</div>



</body>
</html>
