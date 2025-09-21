package com.malla.oop.design.pattern.builder;

public class Student {
    private final String name;
    private final Integer age;
    private final String batch;
    private final String universityName;
    private final String email;
    private final long id;
    private final String gradYear;

    private Student(Builder builder) {
        this.age = builder.getAge();
        this.name = builder.getName();
        this.batch = builder.getBatch();
        this.universityName = builder.getUniversityName();
        this.email = builder.getEmail();
        this.id = builder.getId();
        this.gradYear = builder.getGradYear();
    }

    public static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private Integer age;
        private String batch;
        private String universityName;
        private String email;
        private long id;
        private String gradYear;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder batch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder gradYear(String gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getName() {
            return name;
        }

        // remove setters as we would set values using builder methods, using builder class and also
        // Note that builder class is immutable i.e attributes are final, if at client want change a
        // particular attribute it can create new object without changing old one.

        public Integer getAge() {
            return age;
        }

        public String getBatch() {
            return batch;
        }

        public String getUniversityName() {
            return universityName;
        }

        public String getEmail() {
            return email;
        }

        public long getId() {
            return id;
        }

        public String getGradYear() {
            return gradYear;
        }

        public Student build() {
            // validations would be here not at age
            return new Student(this);
        }
    }
}
