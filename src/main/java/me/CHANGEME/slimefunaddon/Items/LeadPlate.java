package me.CHANGEME.slimefunaddon.Items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.CHANGEME.slimefunaddon.BetterNuclearReactor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.CHANGEME.slimefunaddon.Group.Group.Group;

public class LeadPlate extends SlimefunItem {
    public LeadPlate(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }
    static SlimefunItemStack BNR_lead_plate = new SlimefunItemStack("BNR_LEAD_PLATE", Material.PAPER, "&l&7铅板", "","&5用于制作铅制机壳");
    static ItemStack[] recipe = {SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,
            SlimefunItems.LEAD_INGOT,null,SlimefunItems.LEAD_INGOT,
            SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT};
    static SlimefunItem lead_plate = new SlimefunItem(Group, BNR_lead_plate, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    public static void reg5(){lead_plate.register((BetterNuclearReactor.getPlugin(BetterNuclearReactor.class)));
    }
}
