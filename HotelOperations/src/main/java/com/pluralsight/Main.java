package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(1,"Andrei","Spicy Girls", 6, 0);
        boolean run = true;
        emp.punchIn(9.0);
        emp.punchOut(17.0);
        System.out.println(emp.getHoursWorked());
       /* while (run){
            System.out.println("");
        }*/
    }
}
