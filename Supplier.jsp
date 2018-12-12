<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="problem1.Supplier,problem1.SupplierDAO" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s" class="problem1.Supplier"></jsp:useBean>
<jsp:setProperty property="*" name="s"/>
<%
int i=0;
i=SupplierDAO.addRecord(s);
if(i>0)
	out.print("Record inserted");
%>

</body>
</html>