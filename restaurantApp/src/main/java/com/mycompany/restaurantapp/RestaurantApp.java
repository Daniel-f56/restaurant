package com.mycompany.restaurantapp;

import people.Customer;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "Fulanito de Tal");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "aaa", "Maria");
        administrative.sellFood();
    }
}
