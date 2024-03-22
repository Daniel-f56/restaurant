package com.mycompany.restaurantapp;

import people.Customer;
import values.CustomerRole;
import values.DishType;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "Fulanito de Tal");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "aaa", "Maria");
        administrative.sellFood();
        
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Caldo", "Vegetales Especias Papa", 2400, 25);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Arepa con huevo", "Arepa Mantequilla Huevo", 2400, 25);
        Dish lunch1 = new Dish(DishType.LUNCH, "Sobrebarriga", "Carne Arroz", 2400, 25);
        Dish lunch2 = new Dish(DishType.LUNCH, "Cercdo en salsa de cebolla", "Cercdo Vegetales", 2400, 25);
        Dish diner1 = new Dish(DishType.DINER, "Cercdo en salsa de cebolla", "Cercdo Vegetales", 2400, 25);
        Dish diner2 = new Dish(DishType.DINER, "Cercdo en salsa de cebolla", "Cercdo Vegetales", 2400, 25);
        
        menu.addDish(breakfast1);

        
    }
}
