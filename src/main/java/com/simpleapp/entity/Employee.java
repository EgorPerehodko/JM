package com.simpleapp.entity;


import javax.persistence.*;
import java.text.ParseException;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "department_id")
    private Long departmentId;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;



    public Employee(){

    }

    public Employee(Long employeeId, String firstName, String lastName, Long departmentId, String jobTitle, Gender gender, Date dateOfBirth) throws ParseException {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }


    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getGender() {
        String gen = "";
        if(gender == Gender.MALE)
            gen = "MALE";
        if(gender == Gender.FEMALE)
            gen = "FEMALE";
        return gen;
    }

    public void setGender(String gender) {
        if(gender.toUpperCase().equals("MALE"))
            this.gender = Gender.MALE;
        if(gender.toUpperCase().equals("FEMALE"))
            this.gender = Gender.FEMALE;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(departmentId, employee.departmentId) &&
                Objects.equals(jobTitle, employee.jobTitle) &&
                gender == employee.gender &&
                Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {

        return Objects.hash(employeeId, firstName, lastName, departmentId, jobTitle, gender, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentId=" + departmentId +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


}


