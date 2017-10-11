/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev4;

import java.awt.event.KeyEvent;

/**
 *
 * @author 154015
 */
public class GameObject 
{
    int x, y, width, length;
    
    public void initialize(int xx, int yy, int _width, int _length)
    {
        x = xx;
        y = yy;
        
        width = _width;
        length = _length;
    }
    
    // Variable Manipulation //
    
    public void movex(int i)
    {
        x += i;
    }
    
    public void movey(int i)
    {
        y += i;
    }
    
    public void changeWidth(int i)
    {
        width += i;
    }
    
    public void changeLength(int i)
    {
        length += i;
    }
    
    // Getting Variables // 
    
    public int getx()
    {
        return x;
    }
    
    public int gety()
    {
        return y;
    }
    
<<<<<<< HEAD
    public int getWidth()
    {
        return width;
    }
    
    public int getLength()
    {
        return length;
    }
    
    // Key Presses //
    
    public boolean isUp()
    {
        return GameEngineV4.input.isKeyDown(KeyEvent.VK_UP);
    }
    
    public boolean isDown()
    {
        return GameEngineV4.input.isKeyDown(KeyEvent.VK_DOWN);
    }
    
    // Adding to players //
    
=======
>>>>>>> origin/master
    public void addToPlayers(PlayerTest i)
    {
        GameEngineV4.addToPlayers(i);
    }
}
