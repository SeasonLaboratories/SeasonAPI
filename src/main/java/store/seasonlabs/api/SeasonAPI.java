package store.seasonlabs.api;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SeasonAPI extends JavaPlugin {

    @Getter private static SeasonAPI instance;

    @Override
    public void onLoad() {

        instance = this;

        saveDefaultConfig();

        Bukkit.getConsoleSender().sendMessage(new String[] {
                "",
                "§e Season Laboratories",
                "§f www.github.com/SeasonLaboratories",
                "",
                "§e Obrigado por utilizar nossos plugins!",
                "§a Carregando dependências...",
                ""
        });
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}