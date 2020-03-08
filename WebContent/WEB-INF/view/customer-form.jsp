<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>

<html>

<head>
<title>Save Customer</title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/myresources/css/style.css">

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/myresources/css/add-customer-style.css">

</head>


<body> 

<div id="wrapper"> </div>
<div id="header"></div>
<h2>CREME - Customer Relationship Manager</h2>

<div id="wrapper"> </div>
<div id="container">

<h3>Save - Customer</h3>
<form:form action ="saveCustomer" modelAttribute="customer" method="POST">
</form:form>

</div>
</body>
</html>