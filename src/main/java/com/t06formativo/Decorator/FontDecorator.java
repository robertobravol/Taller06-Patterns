package com.t06formativo.Decorator;

public class FontDecorator extends ReportDecorator {
    
    public FontDecorator(Report report){
        super(report);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Applying custom font to the report.");
    }
}
