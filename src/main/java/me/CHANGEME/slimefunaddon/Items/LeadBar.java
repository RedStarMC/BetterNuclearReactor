package me.CHANGEME.slimefunaddon.Items;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.CHANGEME.slimefunaddon.Group.Group.Group;

public class LeadBar extends SlimefunItem {
    public LeadBar(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

    }
    ItemStack[] recipe = {new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.DIAMOND), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD)};
    SlimefunItemStack BNR_lead_bar = new SlimefunItemStack("BNR_LEAD_BAR", Material.DIAMOND, "&l铅棒", "&0吸收中子的材料/n制作核反应堆控制棒的材料");
    SlimefunItem lead_bar = new SlimefunItem(Group, BNR_lead_bar, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    lead_bar.register(this);

}
