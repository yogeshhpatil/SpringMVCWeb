<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
	<title>Add new Employee</title>
</head>

<body>
	<center>
		<h1>Add New Employee</h1>
		<form action="save" method="POST">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="text" name="salary"></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Add Employee"></td>
				</tr>
			</table>
		</form>

	</center>

</body>

</html>