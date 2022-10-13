/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocweek4interfaces;

/**
 *
 * @author Sam
 */
public class Box extends Shape {
    double length;
    double width;
    double height;
    
    public Box() {
        super();
        this.length = 2;
        this.width = 3;
        this.height = 5;
    }
    
    @Override
    public double calculateArea() {
        return 2*length*width + 2*length*height + 2*width*height;
    }
    
    public double calculateVolume() {
        return length*width*height;
    }
}
