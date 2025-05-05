package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        double defaultprice = 0;
        if (roomType.equalsIgnoreCase("king")){
            defaultprice = 139.00;
        }
        else if(roomType.equalsIgnoreCase("double")){
            defaultprice = 124.00;
        }
        if (isWeekend()){
            defaultprice *= 1.10; //Charge 10% to prise
        }
        return defaultprice;
    }

    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }


}
