package ml.noxxious.maps;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Maps extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_BLUE + "MAPS - Mineshaft Abuse Prevention System has started.");
    }
}
