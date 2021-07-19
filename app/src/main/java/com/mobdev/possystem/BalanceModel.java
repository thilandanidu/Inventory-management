package com.mobdev.possystem;

public class BalanceModel {
    String invoiceNo;
    String invoiceValue;

    public BalanceModel(String invoiceNo, String invoiceValue){
        this.invoiceNo = invoiceNo;
        this.invoiceValue = invoiceValue;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public String getInvoiceValue() {
        return invoiceValue;
    }

}
