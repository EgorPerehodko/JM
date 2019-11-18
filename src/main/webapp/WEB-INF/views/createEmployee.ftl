<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
<form name="employee" action="/addEmployee" method="post">
    <p>Name</p>
    <input title="Name" type="text" name="firstName">
    <p>Surname</p>
    <input title="Surname" type="text" name="lastName">
    <p>Department</p>
    <input title="Department" type="number" min="1" name="departmentId">
    <p>Job</p>
    <input title="Job" type="text" name="jobTitle">
    <p>Gender</p>
    <input title="Gender" type="text" name="gender">
    <p>Birthday</p>
    <input title="Date of birth" type="date" name="dateOfBirth">
    <input type="submit" value="Add">
</form>
</body>
</html>