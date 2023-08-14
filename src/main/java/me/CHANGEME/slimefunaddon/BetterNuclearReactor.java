package me.CHANGEME.slimefunaddon;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class BetterNuclearReactor extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        /*
         * 1. Creating a new Category
         * This Category will use the following ItemStack
         */
        ItemStack itemGroupItem = new CustomItemStack(Material.DIAMOND, "&4更好的核反应堆", "", "&a> 点击打开");

        // Give your Category a unique id.
        NamespacedKey itemGroupId = new NamespacedKey(this, "xin_he_fan_ying_dui");
        ItemGroup BNR_Group = new ItemGroup(itemGroupId, itemGroupItem);

        /*
         *2。创建新的SlimefunItemStack
         *这个类有很多构造函数，它非常重要
         *你给每个项目一个唯一的id。
         */
        SlimefunItemStack BNR_lead_plate = new SlimefunItemStack("BNR_LEAD_PLATE", Material.DIAMOND, "&l铅板", "&0防辐射的材料（可制作核反应堆）");

        /*
         * 3.创建配方
         *Recipe是一个长度为9的ItemStack数组。
         *它代表一个3x3制作网格中的成形配方。
         *指定了制作此配方的机器
         *再往下称为RecipeType。
         */
        ItemStack[] recipe = {new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.DIAMOND), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD)};

        /*
         *4.正在注册项目
         *现在您只需要注册该项目。
         *RecipeType.ENHANCED_CRAFTING_TABLE指的是
         *这个项目是在其中制作的。
         *Slimefun本身的配方类型将自动将配方添加到该机器中。
         */
        SlimefunItem item = new SlimefunItem(BNR_Group, BNR_lead_plate, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        item.register(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
