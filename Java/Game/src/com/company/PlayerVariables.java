package com.company;

import java.util.HashMap;
import java.util.Map;

public class PlayerVariables
{
    public static HashMap<String, Integer> PlayerStats = new HashMap<String, Integer>();
    public static HashMap<String, Boolean> PlayerInventory = new HashMap<String, Boolean>();
    public static String equipped = "null";

    public static void restartPlayerStats()
    {
        PlayerStats.clear();
        PlayerStats.put("Health", 10);
    }

    public static void restartPlayerInventory()
    {
        PlayerInventory.clear();
        PlayerInventory.put("Sword", false);
    }

    public static int getPlayerStats(String i)
    {
        int returned = 0;

        switch(i)
        {
            case "Health" :
                returned = PlayerStats.get("Health");
                break;
        }

        return returned;
    }

    public static void manipulateHealth(int multiplier)
    {
        int health = PlayerStats.get("Health");

        health += 1 * multiplier;

        PlayerStats.replace("Health", health);
    }

    public static void listInventory()
    {
        int i = 0;

        for(Map.Entry<String, Boolean> entry : PlayerInventory.entrySet())
        {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            if(value != false)
            {
                System.out.println(key);
                i++;
            }
        }

        if (i == 0)
        {
            System.out.println("You don't have anything :(");
        }
    }

    public static void equipItem(String desiredItem)
    {
        switch (desiredItem)
        {
            case "Sword" :
                if(PlayerInventory.get(desiredItem) == true)
                {
                    equipped = desiredItem;
                    System.out.println("You equipped a " + desiredItem);
                }
                else
                {
                    System.out.println("You don't have that item");
                }
                break;
        }
    }

    public static void unequipItem()
    {
        equipped = "null";
    }

    public static String equipped()
    {
        return equipped;
    }
}


