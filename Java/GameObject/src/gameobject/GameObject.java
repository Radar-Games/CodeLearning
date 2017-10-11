/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

/**
 *
 * @author 154015
 */
public class GameObject 
{
    int x = 0, y = 0;
    String type;
    
    void setType(String t)
    {
//        Solid
        
        type = t;
    }
    
    String getType()
    {
        return type;
    }
    
    int getx()
    {
        return x;
    }
    
    int gety()
    {
        return y;
    }
    
    void draw()
    {
        
    }
}
