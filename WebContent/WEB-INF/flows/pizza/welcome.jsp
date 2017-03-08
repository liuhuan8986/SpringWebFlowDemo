<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  xmlns:form="http://www.springframework.org/tags/form">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Pizza</h2>
	<form:form>
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		<input type="text" name="phoneNumber" /><br />
		<input type="submit" name="_eventId_phineEntered" value="Lookup Customer" />
	</form:form>
</body>
</html>