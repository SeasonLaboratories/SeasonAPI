package store.seasonlabs.api.libraries.text;

import org.bukkit.entity.Player;
import store.seasonlabs.api.libraries.text.type.ActionBarMessage;

public class MessageLibrary {

    public static void sendMessage(Player player, String message) {
        ActionBarMessage.sendActionBar(player, message);

    }

    public static void sendMessage(Player player, String title, String subtitle) {
        player.sendTitle(title, subtitle);

    }

}
