package com.example.examplemod;

import java.util.Arrays;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.util.EnumParticleTypes;

public class CommandSetTitle extends CommandBase {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "SetTile";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		String str = Arrays.toString(args);
		str = str.substring(1, str.length()-1).replace("[]", "");
		Float tes = new Float(str);
		
		try {
			net.minecraft.client.Minecraft.getMinecraft().player.world.createExplosion(net.minecraft.client.Minecraft.getMinecraft().player, net.minecraft.client.Minecraft.getMinecraft().player.posX, net.minecraft.client.Minecraft.getMinecraft().player.posY, net.minecraft.client.Minecraft.getMinecraft().player.posZ,Float.valueOf(str), true);
		}
	
		catch(net.minecraftforge.fml.common.LoaderExceptionModCrash e) {
			
			net.minecraft.client.Minecraft.getMinecraft().displayCrashReport(net.minecraft.crash.CrashReport.makeCrashReport(e, "Float Error"));
			//System.exit(-1);
		}
		
	}

}
