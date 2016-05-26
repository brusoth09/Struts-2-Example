<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Customer</title>
</head>
<body>
<h2>Add Customer</h2>
<s:form  action="customerAction" >
    <s:textfield name="name" label="Name" />
    <s:textfield name="age" label="Age" value=""/>
    <s:submit />
</s:form>
</body>
</html>
