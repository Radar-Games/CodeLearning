//
// This script is the "Player" object
//
// This extension is for objects that are controlled by the player
// It has a rectangular bounding box
//

package gameenginev5;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.*;
 
public class PlayerObjectRect extends Rectangle
{
    // Set Up //
    
    public void initialize(int xx, int yy, int _width, int _height, Player p)
    {
        x = xx;
        y = yy;
        
        width = _width;
        height = _height;
        
        Rectangle r = new Rectangle(x, x, width, height);
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
        height += i;
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
    
    public int getwidth()
    {
        return width;
    }
    
    public int getheight()
    {
        return height;
    }
    
    // Input //
    
    public boolean isUp()
    {
        return GameEngineV5.input.isKeyDown(KeyEvent.VK_UP);
    }
    
    public boolean isDown()
    {
        return GameEngineV5.input.isKeyDown(KeyEvent.VK_DOWN);
    }
    
    public boolean isLeft()
    {
        return GameEngineV5.input.isKeyDown(KeyEvent.VK_LEFT);
    }
    
    public boolean isRight()
    {
        return GameEngineV5.input.isKeyDown(KeyEvent.VK_RIGHT);
    }
    
    // Add to Players List //
    
    public void addToPlayers(Player i)
    {
        GameEngineV5.addToPlayers(i);
    }
}
