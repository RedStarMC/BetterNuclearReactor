package me.CHANGEME.slimefunaddon.Group;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.CHANGEME.slimefunaddon.BetterNuclearReactor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class Group extends BetterNuclearReactor{

    private Group() {
    }
    static ItemStack itemGroupItem = new CustomItemStack(Material.IRON_BLOCK, "&e更好的核反应堆", "", "&a> 点击打开");
    static NamespacedKey itemGroupId = new NamespacedKey(BetterNuclearReactor.getPlugin(BetterNuclearReactor.class), "xin_he_fan_ying_dui");
    public static ItemGroup Group = new ItemGroup(itemGroupId, itemGroupItem);
}
