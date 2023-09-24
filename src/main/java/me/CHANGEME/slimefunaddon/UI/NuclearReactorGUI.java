package me.CHANGEME.slimefunaddon.UI;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;

public class NuclearReactorGUI {
    public static final CustomItemStack PUT = new CustomItemStack(
            Material.IRON_BLOCK,
            ChatColor.GREEN + "输入"
    );

    public static final CustomItemStack OUT = new CustomItemStack(
            Material.IRON_BLOCK,
            ChatColor.RED + "输出"
    );
}
