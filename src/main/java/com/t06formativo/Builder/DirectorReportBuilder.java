package com.t06formativo.Builder;

public class DirectorReportBuilder {
    private ReportBuilder reportBuilder;

    public void armarReporteSimple(){
        reportBuilder.reset();
        reportBuilder.buildStepA();
        reportBuilder.buildStepB();
        reportBuilder.buildStepC();
    }
}
