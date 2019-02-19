<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
	<title>Edit Employee</title>
</head>

<body>
	<center>
		<h1>Edit Employee</h1>

		<form action="editsave" method="POST">
			<table>
				<tr>
					<td>Id</td>
					<td><input type="number" name="id" value="${employee.id}" readonly></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value="${employee.name}"></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="text" name="salary" value="${employee.salary}"></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation" value="${employee.designation}"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update Emp"></td>
				</tr>
			</table>

		</form>
	</center>

</body>

</html>