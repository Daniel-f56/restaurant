package com.mycompany.restaurantapp;

import java.util.ArrayList;
import values.DishType;

public class Menu {
    
    private ArrayList<Dish> dishList;
    
    public Menu(){
        this.dishList = new ArrayList<>();
    }
    
    public void addDish(Dish dish){
        this.dishList.add(dish);
    }
    
    public void showMenu(){
        for(DishType dishType: DishType.values()){
            
         System.out.println("*** ---"+ dishType +"--- ***");
        }
    }
}

