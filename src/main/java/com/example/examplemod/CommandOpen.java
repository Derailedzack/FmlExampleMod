package com.example.examplemod;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandOpen extends CommandBase  {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Run";
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
		try {
		
			java.awt.Desktop.getDesktop().open(new File(str));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
