<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

<title>List Customers</title>


<!-- reference my styling sheets -->

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/myresources/css/style.css"/>

</head>


<body>

<div id="wrapper">
<div id="header">
<h2>CREME - Customer Relationship Manager</h2>
</div>
</div>

<div id= "container">

<div id="content">

<!-- put new button - Add Customer -->

<input type="button" value="Add Customer"
onclick = "window.location.href='showFormForAdd'; return false;"
class="add-button"
/>



<!-- add html table -->

<table>
<tr>

<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Action</th>

<!-- loop over and print customers -->

<c:forEach var="tempCustomer" items="${customers}">

<!-- construct an update link with customer id -->

<c:url var="updateLink" value="/customer/showFormForUpdate">

<c:param name="customerId" value="${tempCustomer.id}"/>

</c:url>
<!-- use a jsp expression language to retrieve all the data from the model and loop it into the html table -->
<tr>



<td>${tempCustomer.firstName} </td>
<td>${tempCustomer.lastName} </td>
<td> ${tempCustomer.email}</td>
<td>
<!-- display the update link -->
<a href="${updateLink}">Update</a>


</tr>

</c:forEach>


</table>


</div>

</div>


</body>
</html>