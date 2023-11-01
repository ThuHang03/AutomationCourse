package org.example.day5Abtract.human;

public class HumanApplication {
    public static void main(String[] args) {
        Student st = new Student();
        st.id = "123";
        st.goOut();

        Teacher teacher = new Teacher();
        teacher.id = "456";
        teacher.goTeach();
    }
}
