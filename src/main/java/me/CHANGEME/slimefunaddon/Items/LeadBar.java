package me.CHANGEME.slimefunaddon.Items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.CHANGEME.slimefunaddon.BetterNuclearReactor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.CHANGEME.slimefunaddon.Group.Group.Group;

public class LeadBar{
    static ItemStack[] recipe = {null, SlimefunItems.LEAD_INGOT,null,
            null, SlimefunItems.LEAD_INGOT,null,
            null, SlimefunItems.LEAD_INGOT,null};
    static SlimefunItemStack BNR_lead_bar = new SlimefunItemStack("BNR_LEAD_BAR", Material.STICK, "&l&b铅棒", "","&5用于制作核反应堆控制棒");
    static SlimefunItem lead_bar = new SlimefunItem(Group, BNR_lead_bar, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    public static void reg(){
        lead_bar.register((BetterNuclearReactor.getPlugin(BetterNuclearReactor.class)));
    }

}
