package com.company;

import java.lang.Class;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PlayerInteractions
{
    static Scanner scanner = new Scanner(System.in);

    public static void moveNorth()
    {
        int locateY = Main.getLocationY();
        int mapLimit = Main.getMapLimit('N');

        if(locateY == mapLimit)
        {
            System.out.println("Idiot");
        }
        else
        {
            Main.move('N');
            System.out.println("You moved north");
        }

        Utility.setLocation();

    }

    public static void moveSouth()
    {
        int locateY = Main.getLocationY();
        int mapLimit = Main.getMapLimit('S');

        if(locateY == mapLimit)
        {
            System.out.println("Idiot");
        }
        else
        {
            Main.move('S');
            System.out.println("You moved south");
        }

        Utility.setLocation();

    }

    public static void moveWest()
    {
        int locateX = Main.getLocationX();
        int mapLimit = Main.getMapLimit('W');

        if(locateX == mapLimit)
        {
            System.out.println("Idiot");
        }
        else
        {
            Main.move('W');
            System.out.println("You moved west");
        }

        Utility.setLocation();

    }

    public static void moveEast()
    {
        int locateX = Main.getLocationX();
        int mapLimit = Main.getMapLimit('E');

        if(locateX == mapLimit)
        {
            System.out.println("Idiot");
        }
        else
        {
            Main.move('E');
            System.out.println("You moved east");
        }

        Utility.setLocation();

    }

    public static void location()
    {
        int locateY = Main.getLocationY();
        int locateX = Main.getLocationX();

        System.out.println("x: " + locateX + ", y: " + locateY);


    }

    public static void playerHealth()
    {
        int pHealth = PlayerVariables.getPlayerStats("Health");

        System.out.println(pHealth);
    }

    public static void lookAround()
    {
        WorldController.getLocation();
    }

    public static void inventory()
    {
        PlayerVariables.listInventory();
    }

    public static void pickUp()
    {
        System.out.println("What item?");
        String input = scanner.nextLine();
        WorldController.pickUp(input);

    }

    public static void equipItem()
    {
        System.out.println("What item?");
        String input = scanner.nextLine();
        PlayerVariables.equipItem(input);
    }

    public static void unequip()
    {
        PlayerVariables.unequipItem();
    }

    public static void equipped()
    {
        System.out.println(PlayerVariables.equipped());
    }

    public static void help()
    {
        Class c = PlayerInteractions.class;

        Method[] methods = c.getMethods();

        for (Method method : methods)
        {
            System.out.println(method.getName());
        }
    }

    // ---- Dev Controls ---- //

    public static void damage()
    {
        PlayerVariables.manipulateHealth(-1);

        System.out.println("Ouch");


    }

    public static void heal()
    {
        PlayerVariables.manipulateHealth(1);

        System.out.println("That's Better");
    }
}