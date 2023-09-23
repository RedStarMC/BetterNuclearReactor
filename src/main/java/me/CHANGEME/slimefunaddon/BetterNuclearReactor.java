package me.CHANGEME.slimefunaddon;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;

import static me.CHANGEME.slimefunaddon.Group.Group.Group;

import me.CHANGEME.slimefunaddon.Items.ControlBar;
import me.CHANGEME.slimefunaddon.Items.LeadBar;
import me.CHANGEME.slimefunaddon.Items.LeadCasing;
import me.CHANGEME.slimefunaddon.Items.NuclearReactor;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

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
        // Give your Category a unique id.

        /*
         *2。创建新的SlimefunItemStack
         *这个类有很多构造函数，它非常重要
         *你给每个项目一个唯一的id。
         */
        SlimefunItemStack BNR_lead_plate = new SlimefunItemStack("BNR_LEAD_PLATE", Material.DIAMOND, "&l铅板", "&0防辐射的材料/n制作核反应堆的材料");

        /*
         * 3.创建配方
         *Recipe是一个长度为9的ItemStack数组。
         *它代表一个3x3制作网格中的成形配方。
         *指定了制作此配方的机器
         *再往下称为RecipeType。
         */
        ItemStack[] recipe = {SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,
                              SlimefunItems.LEAD_INGOT,null,SlimefunItems.LEAD_INGOT,
                              SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT};

        /*
         *4.正在注册项目
         *现在您只需要注册该项目。
         *RecipeType.ENHANCED_CRAFTING_TABLE指的是
         *这个项目是在其中制作的。
         *Slimefun本身的配方类型将自动将配方添加到该机器中。
         */
        SlimefunItem item = new SlimefunItem(Group, BNR_lead_plate, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        item.register(this);
        getLogger().info("------------------------");
        getLogger().info("| BetterNuclearReactor |");
        getLogger().info("| 作者: pingguomc      |");
        getLogger().info("|       插件加载成功    |");
        getLogger().info("------------------------");
        LeadBar.reg();
        ControlBar.reg2();
        LeadCasing.reg3();
        NuclearReactor.reg4();
    }

    @Override
    public void onDisable() {
        getLogger().info("------------------------");
        getLogger().info("| BetterNuclearReactor |");
        getLogger().info("| 作者: pingguomc      |");
        getLogger().info("|       插件卸载成功    |");
        getLogger().info("------------------------");
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
