package com.company;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorldController
{
    public static HashMap<String, Boolean> Location = new HashMap<String, Boolean>();

    public static void setVariables()
    {
        Location.put("Sword", false);
        System.out.println(Location.get("Sword"));
    }

    public static void getLocation()
    {
        int i = 0;

        for(Map.Entry<String, Boolean> entry : Location.entrySet())
        {
                String key = entry.getKey();
                Boolean value = entry.getValue();
                if(value == true)
                {
                    System.out.println("There is a " + key + " here");
                    i++;
                }
        }

        if (i == 0)
        {
            System.out.println("Theres nothing around you");
        }
    }

    public static void setLocation()
    {
        int x = Main.getLocationX();
        int y = Main.getLocationY();

        if(x == 2 && y == 3)
        {
            Location.clear();
            Location.put("Sword", true);
        }
    }

    public static void pickUp(String i)
    {
        int j = 0;

        for(Map.Entry<String, Boolean> entry : Location.entrySet())
        {
            Boolean value = entry.getValue();

            if(value == true)
            {
                Location.replace(i, false);
                PlayerVariables.PlayerInventory.replace(i, true);
                System.out.println("You picked up a " + i);
                j++;
            }

        }

        if (j == 0)
        {
            System.out.println("That item isn't here");
        }
    }
}