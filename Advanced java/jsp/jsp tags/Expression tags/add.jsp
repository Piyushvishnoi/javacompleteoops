<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<%! int q=2; %>
<%
int i=Integer.parseInt(request.getParameter("num1"));
int j=Integer.parseInt(request.getParameter("num2"));
int k=i+j;
out.println("result is: "+k);
  %>
    
    <!-- 
to print something outside service method or to replace out.println we use Expression tags(<%=  %>)
-->
    
  REsult is: <%= q %>
</body>
</html>
