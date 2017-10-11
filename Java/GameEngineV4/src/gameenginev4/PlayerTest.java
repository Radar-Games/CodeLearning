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
public class PlayerTest extends GameObject
{
    public void initialize(int xx, int yy, int _width, int _length)
    {
        super.initialize(xx, yy, _width, _length);
        super.addToPlayers(this);
    }
    
    public void update()
    {
        if(super.isUp())
        {
            super.movey(-1);
        }
        
        if(super.isDown())
        {
            super.movey(1);
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
