package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
//@Config(modid = ExampleMod.MODID)
public class ExampleMod
{
	public static Configuration con = new Configuration(new File("config/FMLtest.cfg"));
	public static Property Path = con.get("Sound", "WavePath","G:\\FamiTracker-v0.4.6\\Demo\\Thunderforce.wav", "Path To the Wave File To Play");
	 public static   Property Loops = con.get("Sound", "Loops", "-1", "How Many Times Does The Wave Loop");
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";
private static  Clip wave;
    private static Logger logger;
   //private static String  path = "G:\\FamiTracker-v0.4.6\\Demo\\Thunderforce.wav";
   
    @EventHandler
    public void preInit(net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent event)
    {
    	
    	wave.stop();
		 wave.close();

    }
    @EventHandler
    public void preInit3(net.minecraftforge.fml.common.event.FMLServerStoppingEvent event)
    {
    	
    	wave.stop();
		 wave.close();

    }
    @EventHandler
    public void init(net.minecraftforge.fml.common.event.FMLModIdMappingEvent event)
    {
    	
    	
    	
    	con.load();
    	
   
    net.minecraftforge.common.config.ConfigElement.getType(Path);
    net.minecraftforge.common.config.ConfigElement.getType(Loops);
    con.save();
    
    	
		try {
//org.apache.logging.log4j.LogManager.getLogger().warn("Make Sure Your Path Is Correct Or It Will Crash Your Game");
			wave = AudioSystem.getClip();
			wave.open(AudioSystem.getAudioInputStream(new File(Path.getString())));
			 
			wave.start();
			wave.loop(Loops.getInt());
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			net.minecraft.client.Minecraft.getMinecraft().displayCrashReport(CrashReport.makeCrashReport(e, e.getLocalizedMessage()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			net.minecraft.client.Minecraft.getMinecraft().displayCrashReport(CrashReport.makeCrashReport(e, e.getLocalizedMessage()));
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			net.minecraft.client.Minecraft.getMinecraft().displayCrashReport(CrashReport.makeCrashReport(e, e.getLocalizedMessage()));
		}
    		//event.registerServerCommand(new CommandTest());
    		//logger.debug("test -1");
    	
        
           	
        	//event.registerServerCommand(new CommandCrash());
        	//logger.debug("test 1");
        	//event.registerServerCommand(new CommandRectangle());
        	//logger.debug("test 2");
        	//event.registerServerCommand(new CommandSetTitle());
        	//logger.debug("test 3");
        	//event.registerServerCommand(new CommandSetRes());
        	//logger.debug("test 4");
			//net.minecraft.client.Minecraft.getMinecraft().player.world.createExplosion(net.minecraft.client.Minecraft.getMinecraft().player, net.minecraft.client.Minecraft.getMinecraft().player.posX, net.minecraft.client.Minecraft.getMinecraft().player.posY, net.minecraft.client.Minecraft.getMinecraft().player.posZ,Float.valueOf(str), true);
		
		
  
    }
   
}

