package com.t06formativo.Builder;

public class ExcelReportBuilder  implements ReportBuilder {
    private ExcelReport reportResult;

    @Override
    public void reset() {
        reportResult = new ExcelReport();
    }

    @Override
    public void buildStepA() {
    }

    @Override
    public void buildStepB() {
    }

    @Override
    public void buildStepC() {
    }

    public ExcelReport getReportResult() {
        return reportResult;
    }

    

}
