package org.example.day5Abtract.human;

public abstract class Persons {
    private String name;
    private String phoneNumber;

    public abstract void goOut();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
