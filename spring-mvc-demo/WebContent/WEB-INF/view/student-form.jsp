<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

  <form:form action="processform" modelAttribute="student">
  First Name: <form:input path="firstName"/>
  <br><br>
  Last Name: <form:input path="lastName"/>
  <br><br>
  Country: 
  <form:select path="country">
    <form:option value="India" label="India" />
    <form:option value="Brazil" label="Brazil" />
    <form:option value="France" label="France" />
    <form:option value="Germany" label="Germany" />
  </form:select>
  
   <br><br>
  Favorite Language: 
  Java <form:radiobutton path="favoritelanguage" value="Java" />
  C# <form:radiobutton path="favoritelanguage" value="C#" />
  Angular <form:radiobutton path="favoritelanguage" value="Angular" />
  Node <form:radiobutton path="favoritelanguage" value="Node" />
  
  <br><br>
  Operating System: 
  Linux <form:checkbox path="operatingSystem" value="linux" />
  IOS <form:checkbox path="operatingSystem" value="IOS" />
  MS Windows <form:checkbox path="operatingSystem" value="MS Windows" />
  
  <input type="submit" value="submit" />
  </form:form>
</body>
</html>