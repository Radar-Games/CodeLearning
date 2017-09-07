package com.company;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.lang.Class;
import java.lang.Throwable;

public class Main
{
    public static int pLocateX = 0, pLocateY = 0, posMapLimitY, negMapLimitY, posMapLimitX, negMapLimitX;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        String input;

        setMapLimit();
        PlayerVariables.restartPlayerStats();
        WorldController.setVariables();
        PlayerVariables.restartPlayerInventory();

        while (true) {
            input = scanner.nextLine();
            Class c = PlayerInteractions.class;
            try
            {
                c.getMethod(input, null).invoke(c, null);
            }
            catch (NoSuchMethodException e)
            {
                System.out.println("Error Code: 1");
            }
            catch (IllegalAccessException e)
            {
                System.out.println("Error Code: 2");
            }
            catch (InvocationTargetException e)
            {
                Throwable cause = new Throwable();
                System.out.println(cause.getCause().toString());
            }
        }
    }

    public static void setMapLimit()
    {
        //  Always Square !!
        //
        //  Currently 10^2
        //

        int boundary = 5;

        posMapLimitX = boundary;
        posMapLimitY = boundary;
        negMapLimitX = -boundary;
        negMapLimitY = -boundary;
    }

    // Get Variables

    public static int getLocationX()
    {
        return pLocateX;
    }

    public static int getLocationY()
    {
        return pLocateY;
    }

    public static int getMapLimit(char dir)
    {
        char direction = dir;

        int returned = 5;

        switch(direction)
        {
            case 'N' :
                returned = posMapLimitY;

            case 'E' :
                returned = posMapLimitX;

            case 'S' :
                returned = negMapLimitY;

            case 'W' :
                returned = negMapLimitX;
        }

        return returned;
    }

    public static void move(char dir)
    {
        char direction = dir;

        switch(direction)
        {
            case 'N' :
                pLocateY++;
                break;

            case 'E' :
                pLocateX++;
                break;

            case 'S' :
                pLocateY--;
                break;

            case 'W' :
                pLocateX--;
                break;
        }
    }
}