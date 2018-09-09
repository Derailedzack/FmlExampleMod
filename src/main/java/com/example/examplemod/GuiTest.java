package com.example.examplemod;

import java.util.logging.Logger;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;


public class GuiTest extends GuiScreen{
	
	public GuiButton test = new GuiButton(0, this.width / 2 - 100, this.height - (this.height / 4) + 10, "Test Button");
public void initgui() {
	
	buttonList.add(test);
}
protected void actionPerformed(GuiButton guibutton) {
	if(guibutton == test) {
		Logger.getAnonymousLogger().info("test");
	}
}
public void drawScreen(int mouseX,int mouseY,float partialticks) {
	
	this.drawDefaultBackground();
	super.drawScreen(mouseX, mouseY, partialticks);
	
	initgui();
	
}
@Override
public boolean doesGuiPauseGame() {
	return true;
}
}
