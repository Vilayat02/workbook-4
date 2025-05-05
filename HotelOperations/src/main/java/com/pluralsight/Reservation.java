package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;
    private int reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean weekend, int reservationTotal) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
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

    public int getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(int reservationTotal) {
        this.reservationTotal = reservationTotal;
    }
}
