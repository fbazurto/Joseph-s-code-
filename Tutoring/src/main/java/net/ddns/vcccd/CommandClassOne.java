package net.ddns.vcccd;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CommandClassOne implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			//Casts sender as a reference player object
			Player player = (Player) sender;
			
			//Creates the net as a new Item
			ItemStack net = new ItemStack(Material.STONE_AXE);
			
			//Gets the metadata of the net
			ItemMeta netData = net.getItemMeta();
			
			//Sets the display name
			netData.setDisplayName(ChatColor.GRAY + "Fatima's Net");
			
			//Then sets the metadata of the net to the edited metadata
			net.setItemMeta(netData);
			
			//Then sets the item in the main hand to the net
			player.getInventory().setItemInMainHand(net);
			
		}
		return(true);
	}

}
