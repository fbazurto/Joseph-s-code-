package net.ddns.vcccd;

import org.bukkit.Location;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GenerateTree implements CommandExecutor {
	public static final TreeType CHERRY = TreeType.CHERRY;
		@Override
		public  boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
			if(sender instanceof Player) {
					Player player = (Player) sender;
					World my_world = player.getWorld();
					Location playerLocation = player.getLocation();
				
								
							my_world.generateTree(playerLocation,CHERRY );
							player.sendMessage("Working");
							}return true;
		}

}
