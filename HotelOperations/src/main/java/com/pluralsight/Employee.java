package com.pluralsight;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private LocalTime punchInTime;
    private boolean hasPunchIn = false;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overTime = getOvertimeHours() * payRate * 1.5;
        return regularPay + overTime;
    }

    public void punchIn(double time) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        if (!hasPunchIn) {
            int hours = (int) time;  //14.75  14
            int minutes = (int) ((time - hours) * 60);
            //time = hours + minutes;
            punchInTime = LocalTime.of(hours, minutes);
            hasPunchIn = true;
            String punchedFormattedTime = punchInTime.format(timeFormatter);
            System.out.println(name + " punched in at: " + punchedFormattedTime);
        }
    }
    public void punchIn(){
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String formattedTime = localTime.format(timeFormatter);
        System.out.println(name + " punched in at: " + formattedTime);
    }



        public void punchOut(double time){
            if (hasPunchIn) {

                if (worked > 0) {
                    hoursWorked += worked;
                    System.out.println("Employee name: " + name + ", punched out at: " + time);
                }
                hasPunchIn = false;
            }
        }

        public String timeFotmatChanger(double time){
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
            int hours = (int) time;
            int minutes = (int) ((time - hours) * 60);
            punchInTime = LocalTime.of(hours, minutes);
            String punchedFormattedTime = punchInTime.format(timeFormatter);
            return punchedFormattedTime;
        }

}

