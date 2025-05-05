package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean Aviable;

    public Room(int numberOfBeds, double price, boolean aviable, boolean dirty, boolean occupied) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        Aviable = aviable;
        this.dirty = dirty;
        this.occupied = occupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAviable() {
        return Aviable;
    }

    public void setAviable(boolean aviable) {
        Aviable = aviable;
    }
}
