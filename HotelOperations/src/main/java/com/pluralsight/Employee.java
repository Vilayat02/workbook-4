package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double regularHours;
    private double overtimeHours;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, double totalPay, double regularHours, double overtimeHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getRegularHours() {
        return regularHours;
    }

    public void setRegularHours(double regularHours) {
        this.regularHours = regularHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
