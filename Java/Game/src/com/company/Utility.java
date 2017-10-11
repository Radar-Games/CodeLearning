package com.company;

public class Utility
{
    public static void finishLine()
    {
        System.out.println("\n");
    }

    public static void setLocation()
    {
        int locationX = Main.getLocationX();
        int locationY = Main.getLocationY();

        WorldController.setLocation();
    }
}
