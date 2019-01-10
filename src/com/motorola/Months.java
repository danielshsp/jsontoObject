package com.motorola;

import org.codehaus.jackson.annotate.JsonProperty;

public class Months {
    @JsonProperty("month_0")
    private String Jan;
    @JsonProperty("month_1")
    private String Feb;
    @JsonProperty("month_2")
    private String  Mar;
    @JsonProperty("month_3")
    private String  Apr;
    @JsonProperty("month_4")
    private String  May;
    @JsonProperty("month_5")
    private String  Jun;
    @JsonProperty("month_6")
    private String  Jul;
    @JsonProperty("month_7")
    private String  Aug;
    @JsonProperty("month_8")
    private String  Sept;
    @JsonProperty("month_9")
    private String  Oct;
    @JsonProperty("month_10")
    private String  Nov;
    @JsonProperty("month_11")
    private String  Dec;

    public Months(){

    }

    public String getJan() {
        return Jan;
    }

    public void setJan(String jan) {
        Jan = jan;
    }

    public String getFeb() {
        return Feb;
    }

    public void setFeb(String feb) {
        Feb = feb;
    }

    public String getMar() {
        return Mar;
    }

    public void setMar(String mar) {
        Mar = mar;
    }

    public String getApr() {
        return Apr;
    }

    public void setApr(String apr) {
        Apr = apr;
    }

    public String getMay() {
        return May;
    }

    public void setMay(String may) {
        May = may;
    }

    public String getJun() {
        return Jun;
    }

    public void setJun(String jun) {
        Jun = jun;
    }

    public String getJul() {
        return Jul;
    }

    public void setJul(String jul) {
        Jul = jul;
    }

    public String getAug() {
        return Aug;
    }

    public void setAug(String aug) {
        Aug = aug;
    }

    public String getSept() {
        return Sept;
    }

    public void setSept(String sept) {
        Sept = sept;
    }

    public String getOct() {
        return Oct;
    }

    public void setOct(String oct) {
        Oct = oct;
    }

    public String getNov() {
        return Nov;
    }

    public void setNov(String nov) {
        Nov = nov;
    }

    public String getDec() {
        return Dec;
    }

    public void setDec(String dec) {
        Dec = dec;
    }
}
