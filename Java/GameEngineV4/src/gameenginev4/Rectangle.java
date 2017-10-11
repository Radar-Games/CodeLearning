/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev4;

/**
 *
 * @author 154015
 */
public class Rectangle extends Shape
{
    private final double width, length;
    
    public Rectangle()
    {
        this(1, 1);
    }
    
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double area()
    {
        return width * length;
    }
    
    @Override
    public double perimeter()
    {
        return 2 * (width + length);
    }
}
