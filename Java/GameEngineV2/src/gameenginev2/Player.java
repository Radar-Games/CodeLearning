/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev2;
    
import static gameenginev2.GameEngineV2.solids;
import java.awt.Component; 
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author 154015
 */
public class Player extends JFrame
{
    int moveMultiplier = 1;
    
    int windowWidth = 500;
    int windowHeight = 500;
    int x = 20;
    int y  = 20;
    
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
        if (!editing)
        {
            if (x != windowWidth)
            {
                if (input.isKeyDown(KeyEvent.VK_SHIFT))
                {
                    moveMultiplier = 2;
                }
                else
                {
                    moveMultiplier = 1;
                }

                if (input.isKeyDown(KeyEvent.VK_RIGHT))
                {
                    if (x+10+(1*moveMultiplier) < windowWidth)
                    {
                        boolean cancel = false;

                        for (int i = 0; i <= 1 * moveMultiplier; i++)
                        {
                            for (int j = -10; j <= 10; j++)
                            {
                                if (GameEngineV2.collisons[x+10][y+j])
                                {
                                    cancel = true;
                                    break;
                                }
                            }
                        }
                    
                        if (!cancel)
                        {
                            x += 1 * moveMultiplier;
                        }
                    }
                }

                if (input.isKeyDown(KeyEvent.VK_LEFT))
                {
                    if (x-10-(1*moveMultiplier) > 0)
                    {
                        boolean cancel = false;

                        for (int i = 0; i <= 1 * moveMultiplier; i++)
                        {
                                for (int j = -10; j <= 10; j++)
                                {
                                    if (GameEngineV2.collisons[x-11][y+j])
                                    {
                                        cancel = true;
                                        break;
                                    }
                                }

                        }

                        if (!cancel)
                        {
                            x -= 1 * moveMultiplier;
                        }
                    }
                }

                if (input.isKeyDown(KeyEvent.VK_UP))
                {
                    if (y-10-(1*moveMultiplier) > 0)
                    {
                        boolean cancel = false;

                        for (int i = 0; i <= 1 * moveMultiplier; i++)
                        {

                            for (int j = -10; j <= 10; j++)
                            {
                                if (GameEngineV2.collisons[x-11][y+j])
                                {
                                    cancel = true;
                                    break;
                                }
                            }
                        }
                    
                        if (!cancel)
                        {
                            y -= 1 * moveMultiplier;
                        }
                    }
                }

                if (input.isKeyDown(KeyEvent.VK_DOWN))
                {
                    if (y+10+(1*moveMultiplier) < windowHeight)
                    {
                        boolean cancel = false;

                        for (int i = 0; i <= 1 * moveMultiplier; i++)
                        {
                            for (int j = -10; j <= 10; j++)
                            {
                                if (GameEngineV2.collisons[x+10][y+j])
                                {
                                   cancel = true;
                                   break;
                                }
                            }
                        }

                        if (!cancel)
                        {
                            y += 1 * moveMultiplier;
                        }
                    }
                }
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
}
