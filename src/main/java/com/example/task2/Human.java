package com.example.task2;

public record Human(String name, int age) {

    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
