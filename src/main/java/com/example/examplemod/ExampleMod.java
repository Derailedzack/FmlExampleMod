package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;
    private static Minecraft mc;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        
    }
    @EventHandler
    public void init(FMLServerStartingEvent event)
    {
    	try {
    		event.registerServerCommand(new CommandTest());
           	event.registerServerCommand(new CommandOpen());
        	event.registerServerCommand(new CommandCrash());
        	event.registerServerCommand(new CommandRectangle());
        	event.registerServerCommand(new CommandSetTitle());
        	event.registerServerCommand(new CommandSetRes());
			//net.minecraft.client.Minecraft.getMinecraft().player.world.createExplosion(net.minecraft.client.Minecraft.getMinecraft().player, net.minecraft.client.Minecraft.getMinecraft().player.posX, net.minecraft.client.Minecraft.getMinecraft().player.posY, net.minecraft.client.Minecraft.getMinecraft().player.posZ,Float.valueOf(str), true);
		}
	
		catch(net.minecraftforge.fml.common.LoaderExceptionModCrash e) {
			
			net.minecraft.client.Minecraft.getMinecraft().displayCrashReport(net.minecraft.crash.CrashReport.makeCrashReport(e, "Float Error"));
			//System.exit(-1);
		}
     
  
    }
   
}
