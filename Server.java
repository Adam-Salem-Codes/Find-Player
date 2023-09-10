import java.util.Objects;

import org.bukkit.plugin.java.JavaPlugin;
import org.adamsalem.untitled.commands.*;

public final class Server extends JavaPlugin {
    public static final String SERVER_NAME = "Adam's Server";

    // This plugin is written for 1.20.1 Spigot !!!
    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(this.getCommand("findplayer")).setExecutor(new findPlayer());
    }
}
