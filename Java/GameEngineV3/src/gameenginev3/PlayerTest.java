/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev3;

import java.io.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Method;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author 154015
 */
public class PlayerTest extends GameObject
{
    BufferedImage backBuffer;
    Insets inset;
    
    public void initialize()
    {
        GameEngineV3.addToPlayers(this);
        
        System.out.println("Pow");
        
        super.x = 20;
        super.y = 20;
        
        inset = getInsets();
        setSize(inset.left + windowWidth + inset.right, inset.top + windowHeight + inset.bottom);
        
        backBuffer = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_RGB);
    }
    
    public void update()
    {
        if (GameEngineV3.input.isKeyDown(KeyEvent.VK_UP))
        {
            super.y -= 1;
        }
        
        if (GameEngineV3.input.isKeyDown(KeyEvent.VK_LEFT))
        {
            super.x -= 1;
        }
        
        if (GameEngineV3.input.isKeyDown(KeyEvent.VK_DOWN))
        {
            super.y += 1;
        }
        
        if (GameEngineV3.input.isKeyDown(KeyEvent.VK_RIGHT))
        {
            super.x += 1;
        }
    }
    
    public void draw()
    {
        Graphics g = getGraphics();
        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(java.awt.Color.BLACK);
        
        bbg.drawOval(super.x, super.y, 20, 20);
        
        /** -- MUST BE AT END -- **/
        g.drawImage(backBuffer, inset.left, inset.top, this);
    }
    
    public int getx()
    {
        return super.x;
    }
    
    public int gety()
    {
        return super.y;
    }
}
