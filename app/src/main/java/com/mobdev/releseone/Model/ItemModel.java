package com.mobdev.releseone.Model;

public class ItemModel {
    String Code;
    String Item_Name;
    String Initial_Price;
    String Sale_Price;
    String Added_Date;
    String Quantity;

    //Constructor


    public ItemModel(String code, String item_Name, String initial_Price, String sale_Price, String added_Date, String quantity) {
        Code = code;
        Item_Name = item_Name;
        Initial_Price = initial_Price;
        Sale_Price = sale_Price;
        Added_Date = added_Date;
        Quantity = quantity;
    }

    public String getCode() {
        return Code;
    }

    public String getItem_Name() {
        return Item_Name;
    }

    public String getInitial_Price() {
        return Initial_Price;
    }

    public String getSale_Price() {
        return Sale_Price;
    }

    public String getAdded_Date() {
        return Added_Date;
    }

    public String getQuantity() {
        return Quantity;
    }
}
