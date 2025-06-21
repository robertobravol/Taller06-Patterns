package com.t06formativo.Decorator;

public class ColorDecorator extends ReportDecorator {

    public ColorDecorator(Report report) {
        super(report);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Applying custom colors to the report.");
    }
}
