package org.example.day4;

public class Student {
    public static void main(String[] args) {
        Person student1 = new Person();
        student1.setName("Hang");
        student1.setAge(21);
        System.out.printf("Name : " + student1.getName() + "\nAge : " + student1.getAge());
    }
}
