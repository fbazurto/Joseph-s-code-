package net.ddns.vcccd;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerRain implements CommandExecutor {
	//WeatherType playerWeather = player.getPlayerWeather();
	//WeatherType playerWeather;
	@Override
	public  boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender; 
			World my_world = player.getWorld();
			my_world.setClearWeatherDuration(0);
		}
		return true;
		}
		
	}


