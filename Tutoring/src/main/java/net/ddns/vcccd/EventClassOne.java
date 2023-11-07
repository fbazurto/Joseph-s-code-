package net.ddns.vcccd;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;

//import java.util.Date;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class EventClassOne implements Listener{// sees if the event executed? Idk google it 
	@EventHandler
	public void onNetUse(PlayerInteractEntityEvent event) {
		Player player = event.getPlayer();
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Fatima's Net")) {
			if(event.getRightClicked() instanceof Cow) {
				Cow cow = (Cow) event.getRightClicked();
				cow.damage((cow.getHealth()));
				ItemStack egg = new ItemStack(Material.COW_SPAWN_EGG);
				player.getInventory().setItemInOffHand(egg);
				player.sendMessage("You captured a Cow!");
			} else if(event.getRightClicked() instanceof Chicken) {
				Chicken cow = (Chicken) event.getRightClicked();
				cow.damage((cow.getHealth()));
				ItemStack egg = new ItemStack(Material.CHICKEN_SPAWN_EGG);
				player.getInventory().setItemInOffHand(egg);
				player.sendMessage("You captured a Cow!");
			}
		}
	}
	

}
