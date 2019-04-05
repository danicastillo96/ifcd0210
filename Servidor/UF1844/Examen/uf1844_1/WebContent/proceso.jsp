<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>HOLA FORMULARIOS</title>

<style type="text/css" media="screen">
      <%@ include file="estilo.css" %>
</style>
</head>
<body>
 <div id="pepa">
 <p>
<%
  
   String edad=(String)request.getParameter("edad");
   String prefieres=(String)request.getParameter("preferencia");
   out.print("Tu nombre es "+request.getParameter("nombre")+" "+request.getParameter("apellido"));
   out.print("<br/>");
   out.print("Tienes "+edad+" años");
   out.print("<br/>");
   out.print("Tu lenguaje favorito es "+request.getParameter("lenguaje"));
   out.print("<br/>");
   out.print("Prefieres el/la "+prefieres+" de un proyecto");
   out.print("<br/>");
   out.print("Bienvenido a jsp "+ request.getParameter("nombre").toString().toUpperCase());
 %>
 </p>
 </div>
</body>
</html>