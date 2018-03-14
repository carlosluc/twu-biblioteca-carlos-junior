package com.twu.biblioteca;

public abstract class Item {

    protected String name;
    protected int year;
    protected boolean isAvailable;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
