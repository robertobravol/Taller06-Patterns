package com.t06formativo.Singleton;

public class ReportGenerator {
 
    private static ReportGenerator instance;


    private ReportGenerator() {}


    public static ReportGenerator getInstance() {
 
        return instance;
    }

    public void generateReport() {

    }

 
    public void showReport() {

    }
}