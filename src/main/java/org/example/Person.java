package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int schoolNumber;
    String gender;
    double height;

    public Person (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int schoolNumber, String gender, double height){
        this(firstName, lastName, age);
        this.schoolNumber = schoolNumber;
        this.gender = gender;
        this.height = height;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
