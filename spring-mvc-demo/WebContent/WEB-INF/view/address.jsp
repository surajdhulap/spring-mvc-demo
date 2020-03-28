<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Address Registration Form</title>
</head>
<body>
<form:form action="processform" modelAttribute="address">
Address: <form:input path="address"/>
<input type="submit" value="submit" />
</form:form>
</body>
</html>