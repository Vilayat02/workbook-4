package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAviable() {
        return !occupied && !dirty;
    }

    public void checkIn(){
        if (isOccupied()){
            occupied = true;
            dirty = true;
        }
        else {
            System.out.println("Room is not aviable for check-in");
        }
    }
    public void checkOut(){
        if (occupied){
            occupied = false;
            dirty = true;
        }
        else {
            System.out.println("Room is not currently occupied");
        }
    }
    public void cleanRoom(){
        if(dirty){
            dirty = false;
        }
    }
}
