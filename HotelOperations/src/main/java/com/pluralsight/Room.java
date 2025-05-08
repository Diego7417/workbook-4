package com.pluralsight;

public class Room {
    int numberOfBeds;
    double price;
   boolean isOccupied;
   boolean isDirty;
   boolean isAvailable;


    public Room(int numberOfBeds, int price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
    public void checkIn(){
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Guest has been checked in.");
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }
    public void checkOut(){
        if (isOccupied) {
            isOccupied = false;
            System.out.println("Guest checked out. Room is now dirty and must be cleaned.");
        } else {
            System.out.println("No guest to check out.");
        }

    }
    public boolean cleanRoom(){
        return !isOccupied && !isDirty;
    }

}
