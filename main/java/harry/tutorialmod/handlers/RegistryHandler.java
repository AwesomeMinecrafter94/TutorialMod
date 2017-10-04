package harry.tutorialmod.handlers;

import harry.tutorialmod.init.BlockInit;
import harry.tutorialmod.init.ItemInit;

public class RegistryHandler 
{
	public static void Client() 
	{
		ItemInit.register();
		BlockInit.registerRenders();
	}
	
	public static void Common() 
	{
		ItemInit.init();
		BlockInit.init();
		BlockInit.register();
	}
}
