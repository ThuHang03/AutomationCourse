package org.example.day5Abtract.human;

public class Student extends Persons {
    public String id;

    @Override
    public void goOut() {
        System.out.println("Student " + id + "-" + getName() + "-" + getPhoneNumber() + "go out");
    }

    public void goToSchool() {
        System.out.println("Student " + id + "-" + getName() + "-" + getPhoneNumber() + "go to school");
    }
}
