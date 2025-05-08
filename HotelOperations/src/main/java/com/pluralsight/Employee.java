package com.pluralsight;

public class Employee {
   int employeeId;
   String name;
   String department;
   double payRate;
   double hoursWorked;

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

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOverTimeHours() * payRate * 1.5);
    }
    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }
    public double getOverTimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public void punchIn(double time){
        double punchInTime = 0;
        System.out.println(name + " already punched in at " + punchInTime);
    }
    public void punchOut(double time){
        double punchOutTime = 0;
        System.out.println("Error: " + name + " has not punched in.");
    }
}
