package me.CHANGEME.slimefunaddon.Items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.CHANGEME.slimefunaddon.BetterNuclearReactor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static me.CHANGEME.slimefunaddon.Group.Group.Group;

public class NuclearReactor {
    static ItemStack[] recipe = {};
    static SlimefunItemStack BNR_Nuclear_reactor= new SlimefunItemStack("BNR_5", Material.CREEPER_HEAD, "&l反应堆", "&a更好的核反应堆","","&c必须被水包围","会使周围生物获得凋零效果","5120 J/s");
    static SlimefunItem Nuclear_reactor = new SlimefunItem(Group, BNR_Nuclear_reactor, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    public static void reg4(){
        Nuclear_reactor.register((BetterNuclearReactor.getPlugin(BetterNuclearReactor.class)));
    }
}
