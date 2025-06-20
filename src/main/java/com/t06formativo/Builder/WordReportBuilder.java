package com.t06formativo.Builder;

public class WordReportBuilder  implements ReportBuilder {
    private WordReport reportResult;

    @Override
    public void reset() {
        reportResult = new WordReport();
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

    public WordReport getReportResult() {
        return reportResult;
    }

    

}
