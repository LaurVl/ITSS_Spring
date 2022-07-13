package com.example.springboot;

public class Person {
    private String firstName;
    private int age;
    private String sex;

    public Person() {
        System.out.println("Created a null person.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void personDescription(){
        System.out.println("Hello!My name is Gabriel");
        System.out.println("something about my city");
    }
}
