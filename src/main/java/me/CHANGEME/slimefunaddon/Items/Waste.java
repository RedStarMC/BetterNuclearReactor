package me.CHANGEME.slimefunaddon.Items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import me.CHANGEME.slimefunaddon.BetterNuclearReactor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.CHANGEME.slimefunaddon.Group.Group.Group;

public class Waste extends SlimefunItem implements Radioactive {
    public Waste(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }
    static ItemStack[] recipe = {null, null,null,
            null, null,null,
            null, null,null};
    static SlimefunItemStack BNR_waste = new SlimefunItemStack("BNR_6", Material.GUNPOWDER, "&c&l核 废 料", "","&e禁止排放到大海","","&a☢ &7辐射等级:&6高","☞ &4需要防化服！");
    static SlimefunItem waste = new SlimefunItem(Group, BNR_waste, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    public static void reg6(){
        waste.register((BetterNuclearReactor.getPlugin(BetterNuclearReactor.class)));
    }

    @Override
    public Radioactivity getRadioactivity() {
        return Radioactivity.HIGH;
    }
}
