package com.sahen.designpattern.singleton;

public class Application {

    public static void main(String[] args) {

        Employee sahan = new Employee("Sahen", 111, "pic.jpeg");
        Employee akila = new Employee("Akila", 112, "id.txt");
        Employee shawn = new Employee("Shawn", 113, "note.txt");

        sahan.documentPrint();
        akila.documentPrint();
        shawn.documentPrint();

    }
}
