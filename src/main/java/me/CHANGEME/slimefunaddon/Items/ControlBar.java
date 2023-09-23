package me.CHANGEME.slimefunaddon.Items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.CHANGEME.slimefunaddon.BetterNuclearReactor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.CHANGEME.slimefunaddon.Group.Group.Group;

public class ControlBar {
    static ItemStack[] recipe = {null, SlimefunItems.LEAD_INGOT,null,
            null, SlimefunItems.LEAD_INGOT,null,
            null, SlimefunItems.LEAD_INGOT,null};
    static SlimefunItemStack BNR_control_bar = new SlimefunItemStack("BNR_3", Material.STICK, "&l控制棒", "可以吸收中子的棒","制作核反应堆控制棒的材料");
    static SlimefunItem control_bar = new SlimefunItem(Group, BNR_control_bar, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    public static void reg2(){
        control_bar.register((BetterNuclearReactor.getPlugin(BetterNuclearReactor.class)));
    }
}
