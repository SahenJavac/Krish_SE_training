package com.sahen.designpattern.singleton;

public class Employee {

    private String empName;
    private int empId;
    private String empDocument;

    public Employee(String empName, int empId, String empDocument) {
        this.empName = empName;
        this.empId = empId;
        this.empDocument = empDocument;
    }

    public void documentPrint() {
        Printer printer = Printer.getPrinter();
        printer.print(empName, empId, empDocument);

    }
}
