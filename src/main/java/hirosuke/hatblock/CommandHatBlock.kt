package hirosuke.hatblock

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandHatBlock : CommandExecutor {

    @Override
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
<<<<<<< HEAD
        if (command.isRegistered) {
            if(sender is Player) {
                Bukkit.getPlayer(sender.name).inventory.helmet = Bukkit.getPlayer(sender.name).inventory.itemInMainHand
                sender.sendMessage("§f§l§oHat!")
                return true
            }
=======
        if (command.isRegistered and (sender is Player)) {
            sender.inventory.helmet = sender.inventory.itemInMainHand
            sender.sendMessage("§f§l§oHat!")
            return true
>>>>>>> 69423ca897e7f6620e7c49c8683d73097593216a
        }
        return false
    }

}
