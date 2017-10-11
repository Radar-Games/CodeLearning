/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev4;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author 154015
 */
public class PlayerTest extends GameObject
{
<<<<<<< HEAD
    public void initialize(int xx, int yy, int _width, int _length)
=======
    Inputs inputs;
    
    public void initialize(int xx, int yy)
>>>>>>> origin/master
    {
        super.initialize(xx, yy, _width, _length);
        super.addToPlayers(this);
        
        inputs = new Inputs();
    }
    
    public void update()
    {
        if(inputs.isUp())
        {
            super.movey(-1);
        }
        
        if(inputs.isDown())
        {
            super.movey(1);
        }
        
        if(inputs.isLeft())
        {
            super.movex(-1);
        }
        
        if(inputs.isRight())
        {
            super.movex(1);
        }
    }
    
    public int getx()
    {
        return super.getx();
    }
    
    public int gety()
    {
        return super.gety();
    }
}
