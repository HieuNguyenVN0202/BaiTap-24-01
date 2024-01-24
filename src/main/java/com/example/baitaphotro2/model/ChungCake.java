package com.example.baitaphotro2.model;

public class ChungCake {
    private int id;
    private String name;
    private String type;
    private int price;
    private boolean status;

    public ChungCake() {
    }

    public ChungCake(int id, String name, String type, int price, boolean status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
