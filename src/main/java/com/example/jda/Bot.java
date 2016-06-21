package com.example.jda;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

public class Bot
{
	
	/**
	 * A test Method, should return {@code 1}
	 * @return 1
	 */
	public static int aMethod(){
		return 1;
	}
	
    public static void main(String[] args)
    {
    	    	
        try
        {
            JDA jda = new JDABuilder().setBotToken("YOUR BOT'S TOKEN").buildBlocking();
            // Do whatever
        }
        catch (LoginException e)
        {
            // The token is invalid
            e.printStackTrace();
        }
        catch (IllegalArgumentException e)
        {
            // The token is empty or null
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            // The operation has been interrupted
            e.printStackTrace();
        }
    }
}
