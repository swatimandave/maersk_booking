package com.java.bean;

public class Customer {

    String ContrinerType="";
    int ContainerSize =0;
      String origin ="";
    String destination ="";
           int quantity =0;
    String timestamp ="";

    public String getContrinerType() {
        return ContrinerType;
    }

    public void setContrinerType(String contrinerType) {
        ContrinerType = contrinerType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
