package com.malla.oop.design.pattern.builder;

public class Client {
    public static void main(String[] args) {
//        Student.Builder studentBuilder = new Student.Builder();
//        studentBuilder.setName("malla");
//        studentBuilder.setAge(29);
//        studentBuilder.setEmail("malla.reddy@enjoy.com");
//        Student student = studentBuilder.build();
// the above code works but client needs to deal with two classes Student and Student.Builder,
// but Student.Builder essentially serves Student (for object creation), hence we can make client use
// just one class. for that have a static variable inside Student Class of Type Builder, so that
// client can use it, and also we can have chain of method calls, if setters in builder class all return
// builder object.

        // final version

        Student.Builder studentBuilder = new Student.Builder();
        Student student = Student.builder()
                .name("malla")
                .age(29)
                .email("abc@gmail.com")
                .id(8989899)
                .gradYear("2025")
                .universityName("noUniversityIsEnough")
                .build();
    }
}
