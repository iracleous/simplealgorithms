/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.algorithmic.model;

/**
 *
 * @author iracl
 */
public class Product {
    private String name;
    private double price;
    private String productCode;
    private String anotherField;
    
    public Product(String newName, double newPrice, String code){
        name = newName;
        price = newPrice;
        productCode = code;
    }
    
    public void print(){
        System.out.println("Code= "+ productCode + " Name= "+ name + " Price= "+ price);
    }
    
    /**
     * Increases the price of the product by a given rate
     * @param rate given a percentage i.e 0 &lt; rate &lt; 1
     */
    public void increasePrice(double rate){
        price *= (1 + rate);
    }
}
