package SOLID;
import SOLID.*;
import java.util.*;
public class PremiumCoffee extends coffee{

	
	public static void main(String[] args)
	{	
		int grms=Espressomachine(10);
		int powder=grindCoffee(grms);
		int ml=brewFilter_coffee(powder);
	}

	public static int Espressomachine(int n)
	{
		return 10;
	}
	public static int brewEspresso(int n)
	{
		return 100;
	}
	
	public static int brewFilter_coffee(int n)
	{
		return 250;
	}

	
}
