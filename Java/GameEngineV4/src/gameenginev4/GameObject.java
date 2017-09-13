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
    int x, y;
    
    public void initialize(int xx, int yy)
    {
        x = xx;
        y = yy;
    }
    
    public void movex(int i)
    {
        x += i;
    }
    
    public void movey(int i)
    {
        y += i;
    }
    
    public int getx()
    {
        return x;
    }
    
    public int gety()
    {
        return y;
    }
    
    public void addToPlayers(PlayerTest i)
    {
        GameEngineV4.addToPlayers(i);
    }
}
