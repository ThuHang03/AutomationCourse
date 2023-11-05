package org.example.day5Abtract.HomeWork5.Ex3;

import java.util.List;

public abstract class Staff {
    private String name;
    private int age;

    private JOB jobTitle;

    public JOB getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JOB jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", jobTitle=" + jobTitle;
    }

    public static void getAllStaff(List<Staff> list) {
        for (Staff staff : list
        ) {
            System.out.println(staff.toString());
        }
    }

    public abstract Staff newStaff();

}



