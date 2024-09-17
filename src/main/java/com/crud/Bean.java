package com.crud;

public class Bean {

    private int id;
    private String name;
    int std;
    
    public Bean() {

    }

    public Bean(int id, String name, int std) {
        this.id = id;
        this.name = name;
        this.std = std;
    }

    public static void main(String[] args) {
        System.out.println("This StudentBean Class");
    }
}
