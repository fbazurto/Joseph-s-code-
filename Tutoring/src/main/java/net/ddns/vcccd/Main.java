package net.ddns.vcccd;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	ConsoleCommandSender console = getServer().getConsoleSender();
	
	@Override
	public void onEnable() {
		//Executed when plugin is enabled on the server...
		console.sendMessage(ChatColor.RED + "Hello World!");
		this.getCommand("testme").setExecutor(new CommandClassOne());
		this.getCommand("playerweather").setExecutor(new PlayerWeather());
		this.getCommand("playerrain").setExecutor(new PlayerRain());
		this.getCommand("generatetree").setExecutor(new GenerateTree());
		
		getServer().getPluginManager().registerEvents(new EventClassOne(), this);
		
	}
	
	//@Override
	public void onReload() {
		//Executed when plugin is enabled on the server...
		console.sendMessage(ChatColor.RED + "Hello World!");
		
	}
	
	@Override
	public void onDisable() {
		//Executed when plugin is disabled on the server...
		
	}
}
