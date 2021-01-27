package com.sahen.designpattern.singleton;

public class Printer {

    private static volatile Printer printer;

    private Printer() {
        if (printer != null) {
            throw new RuntimeException("Please use getPrinter method");
        }

    }

    public static Printer getPrinter() {

        if (printer == null) {

            synchronized (Printer.class) {
                if (printer == null) {

                    printer = new Printer();
                }
            }
        }
        return printer;
    }

    public void print(String name, int id, String document) {
        System.out.println(name + "(" + id + ") is printing " + document);
    }
}
