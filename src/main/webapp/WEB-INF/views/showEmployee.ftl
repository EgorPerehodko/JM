<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee info</title>
</head>
<body>
<h1>Employee info</h1>
<table>
    <tr>
        <td>ID</td>
        <td>${employee.employeeId}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${employee.firstName}</td>
    </tr>
    <tr>
        <td>Surname</td>
        <td>${employee.lastName}</td>
    </tr>
    <tr>
        <td>Department ID</td>
        <td>${employee.departmentId}</td>
    </tr>
    <tr>
        <td>Job Title</td>
        <td>${employee.jobTitle}</td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>${employee.gender}</td>
    </tr>
    <tr>
        <td>Date of birthday</td>
        <td>${employee.dateOfBirth?string('dd.MM.yyyy')}</td>
    </tr>
</table>
<a href="/employees">Return to list</a>
</body>
</html>