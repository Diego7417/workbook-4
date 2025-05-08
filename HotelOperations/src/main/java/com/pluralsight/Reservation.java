package com.pluralsight;

public class Reservation {
 String roomType;
 double price;
 int numberOfNights;
 boolean isWeekend;
 double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal= reservationTotal;
    }


    public String getRoomType() {
        return roomType;
    }

    public double setRoomType(String roomType) {
        this.roomType = roomType;
        if (this.roomType.equals("king")){
            this.price = 139.00;
        }else if (this.roomType.equals("double")){
            this.price= 124.00;
        }else {
            return 0.0;
        }
        return 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getReservationTotal(){
        return reservationTotal;
    }
    public double setReservationTotal(){
        double total = getPrice();
        if (isWeekend){
            return (price * 0.30) * numberOfNights;
        }else {
            return total * numberOfNights;
        }
    }
}
