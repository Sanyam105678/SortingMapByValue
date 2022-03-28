package com.company;

public class Employee {
    private String EmpId;
    private  String empName;
    private Double salary;

    public Employee()  {
    }

    public Employee(String empId, String empName, Double salary) {
        EmpId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId='" + EmpId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
