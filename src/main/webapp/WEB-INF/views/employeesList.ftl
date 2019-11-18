<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Employees list</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Department_ID</th>
        <th>Job_Title</th>
        <th>Gender</th>
        <th>Date_of_birth</th>
    </tr>
    <#list employees as employee>
        <tr>
            <td><a href="/employee/${employee.employeeId}">${employee.employeeId}</a></td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
            <td>${employee.departmentId}</td>
            <td>${employee.jobTitle}</td>
            <td>${employee.gender}</td>
            <td>${employee.dateOfBirth}</td>
            <td><a href="/delete/${employee.employeeId}">Delete</a></td>
            <td><a href="/update/${employee.employeeId}">Update</a></td>
        </tr>
    </#list>
</table>
<a href="/addEmployee">Add employees</a>
</body>
</html>