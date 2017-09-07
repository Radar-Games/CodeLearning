/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev2;

/**
 *
 * @author 154015
 */
public class Solid 
{
    int x, y;
    
    public void run(int createX, int createY)
    {
        x = createX;
        y = createY;
        
        int xx = -10;
        int yy = -10;
        
        for (int i = 0; i <= 20*20; i++)
        {
            GameEngineV2.collisons[x+xx][y+yy] = true;
            if (xx == 10)
            {
                xx = -10;
                yy += 1;
            }
            else
            {
                xx += 1;
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
