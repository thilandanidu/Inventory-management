package com.mobdev.possystem;

public class PaymentModel
{
    String code;
    String name;
    String quantity;
    String totalV;

   //constructor with parameters
    public PaymentModel(String code, String name, String quantity, String totalV) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.totalV = totalV;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getTotalV() {
        return totalV;
    }
}
