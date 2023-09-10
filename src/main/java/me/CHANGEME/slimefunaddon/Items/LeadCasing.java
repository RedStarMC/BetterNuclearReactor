package me.CHANGEME.slimefunaddon.Items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.CHANGEME.slimefunaddon.BetterNuclearReactor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.CHANGEME.slimefunaddon.Group.Group.Group;

public class LeadCasing {
    static ItemStack[] recipe = {new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.DIAMOND), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD)};
    static SlimefunItemStack BNR_lead_casing= new SlimefunItemStack("BNR_4", Material.IRON_BLOCK, "&l铅制机壳", "&0机器外壳","&0制作核反应堆的材料");
    static SlimefunItem lead_casing = new SlimefunItem(Group, BNR_lead_casing, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    public static void reg3(){
        lead_casing.register((BetterNuclearReactor.getPlugin(BetterNuclearReactor.class)));
    }
}
