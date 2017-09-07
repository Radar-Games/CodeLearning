/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev2;

import java.awt.Component; 
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.awt.event.KeyListener;



/**
 *
 * @author 154015
 */
public class Editor extends JFrame
{
    int windowWidth = 500;
    int windowHeight = 500;
    int x = 20;
    int y  = 20;
    static boolean j = false;
    
    InputHandler input;
    BufferedImage backBuffer;
    Insets inset;
    
    public void start(Component e)
    {
        inset = getInsets();
        setSize(inset.left + windowWidth + inset.right, inset.top + windowHeight + inset.bottom); 

        backBuffer = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_RGB);

        input = new InputHandler(e);
    }

    void update(boolean editing)
    {
        if (editing)
        {
            if (input.isKeyDown(KeyEvent.VK_RIGHT) && x+20 < windowWidth+1)
            {
                x += 10;
            }

            if (input.isKeyDown(KeyEvent.VK_LEFT) && x-20 > -1)
            {
                x -= 10;
            }

            if (input.isKeyDown(KeyEvent.VK_UP) && y-20 > -1)
            {
                y -= 10;
            }

            if (input.isKeyDown(KeyEvent.VK_DOWN) && y+20 < windowHeight+1)
            {
                y += 10;
            }
            
            if (input.getSpace())
            {
                Solid i = new Solid();
                GameEngineV2.addToSolids(i);
                i.run(x, y);
                j = false;
            }
        }
    }
    
    int getx()
    {
        return x;
    }
    
    int gety()
    {
        return y;
    }
    
    public static void setSpace(boolean i)
    {
        j = i;
    }
}
