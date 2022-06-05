package store.seasonlabs.api.libraries.command;

import lombok.AllArgsConstructor;
import lombok.val;
import me.saiintbrisson.bukkit.command.BukkitFrame;
import me.saiintbrisson.minecraft.command.message.MessageType;
import org.bukkit.plugin.Plugin;
import store.seasonlabs.api.SeasonAPI;

@AllArgsConstructor
public class CommandLibrary {

    private BukkitFrame bukkitFrame;

    public void provide(Plugin plugin, Object... commands) {

        bukkitFrame = new BukkitFrame(plugin);

        bukkitFrame.registerCommands(commands);

        bukkitFrame.getMessageHolder().setMessage(MessageType.ERROR, "§cHouve um erro na execução do comando, abra um ticket na SeasonLabs e reporte o erro.");
        bukkitFrame.getMessageHolder().setMessage(MessageType.NO_PERMISSION, "§cVocê não tem permissão para executar este comando.");
        bukkitFrame.getMessageHolder().setMessage(MessageType.INCORRECT_TARGET, "§cVocê não pode usar este comando.");
        bukkitFrame.getMessageHolder().setMessage(MessageType.INCORRECT_USAGE, "§cUtilize /{usage} para executar o comando.");

        SeasonAPI.getInstance().getLogger().info("Foram registrados " + commands.length + " comandos utilizando a SeasonAPI!");
    }
}