package com.example.examplemod;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

import javax.imageio.ImageIO;

import org.lwjgl.opengl.Display;
import org.lwjgl.util.Rectangle;
import org.lwjgl.util.Renderable;
import org.newdawn.slick.opengl.ImageIOImageData;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandRectangle  extends CommandBase  {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "SetWindowIcon";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		ByteBuffer[] iconlist = new ByteBuffer[1];
		String str = Arrays.toString(args);
		str = str.substring(1, str.length()-1).replace("[]", "");
		try {
			iconlist[0] = new ImageIOImageData().imageToByteBuffer(ImageIO.read(new File(str)), false, false, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str2 = Arrays.toString(args);
		str2 = str2.substring(1, str.length()-1).replace("[]", "");
		Display.setIcon(iconlist);
	}



}
