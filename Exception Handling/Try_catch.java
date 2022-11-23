import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
	    try
	    {
	        int data = 50/0; 
	    }
	    catch(Exception e)
	    {
		System.out.println("Can't divided by zero");
	    }
	    finally//statement will be printed in any case
	    {
	       System.out.println("Try catch finally program"); 
	    }
	}
}
