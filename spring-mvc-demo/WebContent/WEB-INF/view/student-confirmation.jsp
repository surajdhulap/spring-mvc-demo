
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
The student is Confirmed: ${student.firstName} ${student.lastName}
<br><br>
Country: ${student.country}
<br><br>
Favorite Language: ${student.favoritelanguage}
<br><br>
Operating System: 
<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
	    <li> ${temp} </li>
	</c:forEach>
</ul>
</body>
</html>