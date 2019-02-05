package com.narayantutorial.creational.factorymethod;

public abstract class Plan {

	protected double rate;  
    abstract double getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}
