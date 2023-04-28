<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultados de la busqueda</title>
<jsp:useBean id="info" type="modelo.Cliente" scope="request"></jsp:useBean> <!-- Vinculando con el servlet -->>
</head>
<body>
<h3>Busqueda exitosa</h3>
Codigo: <jsp:getProperty property="codigo" name="info"/><br>
Nombre: <jsp:getProperty property="nombre" name="info"/><br>
Sueldo: <jsp:getProperty property="sueldo" name="info"/><br>
Numero de Hijos: <jsp:getProperty property="numhijos" name="info"/><br>
<a href="busqueda,jsp">Nueva Busqueda</a>
</body>
</html>