<%-- 
    Document   : action1
    Created on : 24-may-2019, 17:55:53
    Author     : aula1tarde6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
    <%-- start web service invocation --%><hr/>
    <%
          int var1 = Integer.parseInt(request.getParameter("valor3"));
        int var2 = Integer.parseInt(request.getParameter("valor4"));
    try {
	com.example.Calculatorwebserver_Service service = new com.example.Calculatorwebserver_Service();
	com.example.Calculatorwebserver port = service.getCalculatorwebserverPort();
	 // TODO initialize WS operation arguments here
	float i = (float)var1;
	float j = (float)var2;
	// TODO process result here
	java.lang.String result = port.subtraction(i, j);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
