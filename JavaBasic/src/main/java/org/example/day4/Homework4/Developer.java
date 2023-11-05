package org.example.day4.Homework4;

public class Developer {
    public static void main(String[] args) {
        Employee developer1 = new Employee();
        developer1.setId(1);
        developer1.setName("Developer1");
        developer1.getSalary();

        System.out.println(developer1.toString());
        developer1.CommentSalary();
    }
}
