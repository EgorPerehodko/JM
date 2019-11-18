<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
<form name="employee" action="/updateEmployee" method="post">
    <p>ID</p>
    <input title="ID" type="number" name="employeeId" value="${employee.employeeId}" readonly>
    <p>Name</p>
    <input title="Name" type="text" name="firstName" value="${employee.firstName}">
    <p>Surname</p>
    <input title="Surname" type="text" name="lastName" value="${employee.lastName}">
    <p>Department</p>
    <input title="Department" type="number" name="departmentId" min="1" value="${employee.departmentId}">
    <p>Job</p>
    <input title="Job" type="text" name="jobTitle" value="${employee.jobTitle}">
    <p>Gender</p>
    <input title="Gender" type="text" name="gender" value="${employee.gender}">
    <p>Birthday</p>
    <input class='input-date' title="Date of birth" type="date" name="dateOfBirth" value="${employee.dateOfBirth?string('yyyy.MM.dd')}">
    <input type="submit" value="Save">
</form>
</body>
</html>