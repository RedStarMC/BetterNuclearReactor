package me.CHANGEME.slimefunaddon;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;

import me.CHANGEME.slimefunaddon.Items.*;

import org.bukkit.plugin.java.JavaPlugin;

public class BetterNuclearReactor extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        getLogger().info("------------------------");
        getLogger().info("| BetterNuclearReactor |");
        getLogger().info("| 作者: pingguomc      |");
        getLogger().info("|       插件加载成功   |");
        getLogger().info("------------------------");
        LeadBar.reg();
        ControlBar.reg2();
        LeadCasing.reg3();
        NuclearReactor.reg4();
        LeadPlate.reg5();
        Waste.reg6();
    }

    @Override
    public void onDisable() {
        getLogger().info("------------------------");
        getLogger().info("| BetterNuclearReactor |");
        getLogger().info("| 作者: pingguomc      |");
        getLogger().info("|       插件卸载成功   |");
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
