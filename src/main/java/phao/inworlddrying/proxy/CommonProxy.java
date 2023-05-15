package phao.inworlddrying.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import phao.inworlddrying.RegistryHandler;

// TODO: The correct way to do proxies is an IProxy interface rather than a CommonProxy class
// Reference: https://forums.minecraftforge.net/topic/69593-javalangclassnotfoundexception-of-my-clientproxy/
// The concept of a "common" proxy makes no sense. Anything that is "common" should go in your main mod class. 
// You should use an IProxy interface and a client-only proxy and dedicated-server-only proxy implementations.
// Reference: https://www.youtube.com/watch?v=bS0TmBNKguc&t=15s

// More Reading!
// http://jabelarminecraft.blogspot.com/p/minecraft-modding-organizing-your-proxy.html
// http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.Common();
	}
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {}
	
}
