package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room5 = new Room(2, 158, true, true);
        System.out.println(room5.isAvailable);

        Room room52 = new Room(1, 165, false, false);
        System.out.println(room52.isAvailable);

        Room room16 = new Room(1, 165, true, false);
        System.out.println(room16.isAvailable);

        Reservation reservation = new Reservation("double", 124, 4, true, 185);
        System.out.println("Room type" + reservation.setReservationTotal());
        System.out.println();

        Employee emp1 = new Employee(101, "Jacob Jackson", "Front Desk", 20.0, 45);
        System.out.println("Total Pay: $" + emp1.getTotalPay());
        System.out.println("Regular Hours: " + emp1.getRegularHours());
        System.out.println("Overtime Hours: " + emp1.getOverTimeHours());
    }


}
