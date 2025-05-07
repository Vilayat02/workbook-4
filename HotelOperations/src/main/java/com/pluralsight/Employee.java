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
    private double punchInValue;
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
            punchInValue = time;
            String punchedFormattedTime = timeFotmatChanger(time);
            hasPunchIn = true;
            System.out.println(name + " punched in at: " + punchedFormattedTime);
        }
    }

    public void punchIn() {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String formattedTime = localTime.format(timeFormatter);
        System.out.println(name + " punched in at: " + formattedTime);
    }

    public void punchOut(double time) {
        if (hasPunchIn) {
            double worked = time - punchInValue;
            if (worked > 0) {
                hoursWorked += worked;
                String formatted = timeFotmatChanger(time);
                System.out.printf("Employee : %s, punched out at: %s, worked hours: %.2f\n", name, formatted, worked);
            }
            else {
                System.out.println("Punch out earlier than punch in!");
            }
            punchInValue = 0;
            hasPunchIn = false;
        }
        else {
            System.out.println("Cannot punch out without punhing in first!");
        }
    }
    public void punchOut(){
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String formattedTime = localTime.format(timeFormatter);
        System.out.println(name + " punched out at: " + formattedTime);
    }

    public String timeFotmatChanger(double time) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        int hours = (int) time;
        int minutes = (int) ((time - hours) * 60);
        punchInTime = LocalTime.of(hours, minutes);
        String punchedFormattedTime = punchInTime.format(timeFormatter);
        return punchedFormattedTime;
    }

}

