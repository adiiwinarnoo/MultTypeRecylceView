package com.example.multitypeview.models;

public class Item {
    private int type;
    private Object Object;

    public Item(int type, java.lang.Object object) {
        this.type = type;
        Object = object;
    }

    public int getType() {
        return type;
    }

    public java.lang.Object getObject() {
        return Object;
    }
}
