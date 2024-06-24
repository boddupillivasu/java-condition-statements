package com.conditionstatements.java;

public class Converters {
    public static void main(String[] args) {


        // implicit conversion

        byte data;
        data = 124;

        short value;
        value = (short) data;
        System.out.println("the implicit conversion is:" + value);

        // explicit conversion

        float num;
        num = 10.0f;
        byte num1;
        num1 = (byte) num;
        System.out.println("the explicit conversion:" + num1);

    }
}

