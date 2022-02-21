package com;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final String fullName;
    private final int salary;

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public  String getName() {
        return name;
    }

    public  String getSurname() {
        return surname;
    }

    Person(String name, String surname, String fullName, int salary){
        this.name = name;
        this.surname = surname;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, fullName);
    }
}
