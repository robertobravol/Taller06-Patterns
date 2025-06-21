package com.t06formativo.Decorator;

public abstract class ReportDecorator implements Report {
    protected Report report;

    public ReportDecorator(Report report){
        this.report = report;
    }

    @Override
    public void print() {
        report.print();
    }
}
