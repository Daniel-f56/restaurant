package com.mycompany.restaurantapp;

import values.DishType;

public class Dish {
    DishType type;
    String name;
    String ingredients;
    int price;
    int qty;

    public Dish(DishType type, String name, String ingredients, int price, int qty) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.qty = qty;
    }
    
    
}
