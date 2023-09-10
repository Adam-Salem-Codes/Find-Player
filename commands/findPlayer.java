
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

import static org.bukkit.Bukkit.getServer;

public class findPlayer implements CommandExecutor {
    // This plugin is written for 1.20.1 Spigot !!!

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Stolen from my own github. Repo: Spigot-Plugin

        if ((sender instanceof Player) && label.equalsIgnoreCase("findplayer")) {
            Player player = Objects.requireNonNull(((Player) sender).getPlayer());

            for (Player p : getServer().getOnlinePlayers()) {
                if (p.getName().equals(args[0])) {
                    player.sendMessage(ChatColor.GOLD + "Currently Online Players: " + ""
                            + getServer().getOnlinePlayers().size() + "/" + getServer().getMaxPlayers());
                    int[] coords = {
                            (int) p.getLocation().getX(),
                            (int) p.getLocation().getY(),
                            (int) p.getLocation().getZ(),
                    };

                    player.sendMessage(ChatColor.RED + "X: " + coords[0] + "" + ChatColor.GREEN + " Y: " + coords[1]
                            + "" + ChatColor.BLUE + " Z: " + coords[2]);
                } else
                    player.sendMessage(ChatColor.RED + "Could not find player!!!");
            }
        }
        return true;
    }
}
