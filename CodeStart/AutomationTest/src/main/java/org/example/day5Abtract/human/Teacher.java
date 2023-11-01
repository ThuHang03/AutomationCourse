package org.example.day5Abtract.human;

public class Teacher extends Persons {
    public String id;

    @Override
    public void goOut() {
        System.out.println("Teacher " + id + "-" + getName() + "-" + getPhoneNumber() + " go out");
    }

    public void goTeach() {
        System.out.println("Teacher " + id + "-" + getName() + "-" + getPhoneNumber() + " go teach");

    }
}
