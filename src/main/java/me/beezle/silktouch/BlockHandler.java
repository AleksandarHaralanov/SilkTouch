package me.beezle.silktouch;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class BlockHandler implements Listener {

    @EventHandler
    public void onBlockBreak(final BlockBreakEvent event) {
        switch (event.getPlayer().getItemInHand().getType()) {
            case GOLD_SWORD:
                switch (event.getBlock().getType()) {
                    case WEB:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.WEB, 1));
                        break;
                    case LONG_GRASS:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.LONG_GRASS, 1));
                        break;
                    case DEAD_BUSH:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.DEAD_BUSH, 1));
                        break;
                    default:
                        break;
                }
                break;
            case GOLD_PICKAXE:
                switch (event.getBlock().getType()) {
                    case STONE:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.STONE, 1));
                        break;
                    case COAL_ORE:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.COAL_ORE, 1));
                        break;
                    case REDSTONE_ORE:
                    case GLOWING_REDSTONE_ORE:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.REDSTONE_ORE, 1));
                        break;
                    case LAPIS_ORE:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.LAPIS_ORE, 1));
                        break;
                    case DIAMOND_ORE:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.DIAMOND_ORE, 1));
                        break;
                    case COBBLESTONE_STAIRS:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.COBBLESTONE_STAIRS, 1));
                        break;
                    case ICE:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.ICE, 1));
                        break;
                    case DOUBLE_STEP:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.DOUBLE_STEP, 1));
                        break;
                    case GLOWSTONE:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.GLOWSTONE, 1));
                        break;
                    case GLASS:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.GLASS, 1));
                        break;
                    case MOB_SPAWNER:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.MOB_SPAWNER, 1));
                        break;
                    case BURNING_FURNACE:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.BURNING_FURNACE, 1));
                        break;
                    case CAKE_BLOCK:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.CAKE_BLOCK, 1));
                        break;
                    case IRON_DOOR_BLOCK:
                        if (event.getBlock().getData() <= 7) {
                            event.setCancelled(true);
                            event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                            event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.IRON_DOOR_BLOCK, 1));
                        }
                        break;
                    default:
                        break;
                }
                break;
            case GOLD_SPADE:
                switch (event.getBlock().getType()) {
                    case GRASS:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.GRASS, 1));
                        break;
                    case SNOW_BLOCK:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.SNOW_BLOCK, 1));
                        break;
                    case SNOW:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.SNOW, 1));
                        break;
                    case CLAY:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.CLAY, 1));
                        break;
                    case SOIL:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.SOIL, 1));
                        break;
                    default:
                        break;
                }
                break;
            case GOLD_AXE:
                switch (event.getBlock().getType()) {
                    case BOOKSHELF:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.BOOKSHELF, 1));
                        break;
                    case WOOD_STAIRS:
                        event.setCancelled(true);
                        event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                        event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.WOOD_STAIRS, 1));
                        break;
                    case WOODEN_DOOR:
                        if (event.getBlock().getData() <= 7) {
                            event.setCancelled(true);
                            event.getBlock().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
                            event.getPlayer().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.WOODEN_DOOR, 1));
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }
}
