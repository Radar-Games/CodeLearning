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
public class GameObject extends JFrame
{
    int x, y;
    int windowHeight = 500;
    int windowWidth = 500;
    String type;
    
    
    
    public void initializePlayer(PlayerTest i)
    {
        GameEngineV3.addToPlayers(i);
        
        
    }
    
    
}
