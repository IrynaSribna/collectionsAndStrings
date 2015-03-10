package com.ira.inputoutput;

/**
 * Created by Iryna on 3/11/15.
 */
public class ClearUtility {
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            System.err.println("Error happened");
        }
    }
}
