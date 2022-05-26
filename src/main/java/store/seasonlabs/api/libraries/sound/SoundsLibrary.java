package store.seasonlabs.api.libraries.sound;

import lombok.val;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import store.seasonlabs.api.SeasonAPI;

public class SoundsLibrary {

    public void playSound(Player player, Plugin plugin, String section) {

        val sound = plugin.getConfig().getString(section);

        if (sound == null) {
            player.sendMessage("§cO som §f" + sound + "§c não foi encontrado.");
            return;
        }

        player.playSound(player.getLocation(), section, 1, 1);
    }

    public void defaultSound(Player player, Sounds sound) {

        switch (sound) {

            case ERROR: {
                player.playSound(player.getLocation(), configurationDefaultSound("error"), 1, 1);
                break;
            }

            case SUCCESSFUL: {
                player.playSound(player.getLocation(), configurationDefaultSound("successful"), 1, 1);
                break;
            }

            case INVALID: {
                player.playSound(player.getLocation(), configurationDefaultSound("invalid"), 1, 1);
                break;
            }
        }
    }

    protected String configurationDefaultSound(String sound) { return SeasonAPI.getInstance().getConfig().getString("sounds." + sound); }
}