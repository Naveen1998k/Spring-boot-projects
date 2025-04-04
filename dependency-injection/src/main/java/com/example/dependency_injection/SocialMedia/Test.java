package com.example.dependency_injection.SocialMedia;

public class Test
{

    public static void main(String[] args) {
      //  College college = new College(new Student(new College(null)));

        // This will create a circular dependency
        // College college = new College(new Student(college));

        // This will create a circular dependency
        // Student student = new Student(new College(student));

        // This will create a circular dependency
        // College college = new College(new Student(college));

        // This will create a circular dependency
        // Student student = new Student(new College(student));

        // This will create a circular dependency
        // College college = new College(new Student(college));

        // This will create a circular dependency
        // Student student = new Student(new College(student));


        //Setter Injection

        College college = new College();
        Student student = new Student();
        college.setStudent(student);
        student.setCollege(college);
    }
}
