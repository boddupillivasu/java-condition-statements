package com.conditionstatements.java;

public class ConditionStatements {
    public static void main(String[] args) {

        String device;
        device = "tv";
        int price;
        price = 35000;
        int discount;
        int discountPercentage;

        if (device == "laptop") {

            System.out.println("the normal prize is:" + price);
            discountPercentage = 15;

        } else if (device == "mobile") {

            System.out.println("the normal prize is:" + price);
            discountPercentage = 10;

        } else if (device == "charger") {

            System.out.println("the normal prize is:" + price);
            discountPercentage = 20;

        } else {
            System.out.println("the normal prize is:" + price);
            discountPercentage = 5;


        }

        discount = (price * discountPercentage) / 100;
        System.out.println("the discount is:" + discount);

        int finalPrize;
        finalPrize = price - discount;
        System.out.println("the final prize is:" + finalPrize);


    }

}

