/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocweek4interfaces;

/**
 *
 * @author Administrator
 */
public class Sphere extends Shape{
    private double radius;
    
    public Sphere() {
        super();
        this.radius = 10;
    }
    
    @Override
    public double calculateArea() {
        return 4 * 3.14 * radius * radius;
    }
    
    public double calculateVolume() {
        return 4.0/3.0 * 3.14 * radius * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}
