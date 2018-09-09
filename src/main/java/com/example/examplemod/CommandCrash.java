package com.example.examplemod;

import java.security.DigestException;

import joptsimple.internal.Classes;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.crash.CrashReport;
import net.minecraft.server.MinecraftServer;

public class CommandCrash extends CommandBase {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Crash";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		;
net.minecraft.client.Minecraft.getMinecraft().displayCrashReport(CrashReport.makeCrashReport(new java.lang.ArrayIndexOutOfBoundsException(), "null"));
	}

}
