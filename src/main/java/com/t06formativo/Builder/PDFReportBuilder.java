package com.t06formativo.Builder;

public class PDFReportBuilder  implements ReportBuilder {
    private PDFReport reportResult;

    @Override
    public void reset() {
        reportResult = new PDFReport();
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

    public PDFReport getReportResult() {
        return reportResult;
    }

    

}
