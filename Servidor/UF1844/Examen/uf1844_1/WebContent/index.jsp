<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOLA FORMULARIOS</title>
<style type="text/css" media="screen">
     <%@ include file="estilo.css" %>
</style>
</head>
<body>
 <div id="pepe">
<form action="servelt1" method="post">
    Nombre:
    <input type="text" name="nombre">
    <br/>
    Apellido:
    <input type="text" name="apellido">
    <br/>
    Edad:
    <input type="text" name="edad">
 
    <br/>
    Lenguaje preferido:
    <select name="lenguaje">
      <option value="java">java
      <option value="jsp" selected>jsp
      <option value="php">php
      <option value="C/C++">C/C++
      <option value="C#">C#
      <option value="Asp">Asp
      <option value="AS3">AS3
    </select>
    <br/>
    Me gusta el:
    <br/>
    <input type="Radio" name="preferencia"value="administracion"checked>administracion
    <br/>
    <input type="Radio" name="preferencia"value="Programacion">Programacion
    <br/>
    <input type="Radio" name="preferencia"value="Modelado">Modelado
    <br/>
    <input type="Radio" name="preferencia"value="Gerencia">Gerencia de proyectos
    <br/>
 
    <p><input type="submit" value="Enviar"></p>
</form>
 </div>
</body>
</html>