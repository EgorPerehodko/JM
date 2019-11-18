create user 'springuser@localhost' identified by 'password';
grant all on employeedb.* to 'springuser@localhost';
set password for springuser = 'password';

SET GLOBAL time_zone = '+3:00';

GRANT ALL PRIVILEGES ON *.* TO 'springuser'@'%' WITH GRANT OPTION;