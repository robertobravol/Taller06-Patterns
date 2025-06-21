package com.t06formativo.Decorator;

public class ConcreteReport implements Report {
    @Override
    public void print() {
        System.out.println("Printing report...");
    }

}
