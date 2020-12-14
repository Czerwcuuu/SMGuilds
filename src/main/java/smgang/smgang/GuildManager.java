package smgang.smgang;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.HashMap;

public final class GuildManager {
    public GuildManager(){};

    public static HashMap<String,Guild> guilds = new HashMap<>();

    public static void CreateGuild(String guildName){
        Guild guild = new Guild(guildName);
        guilds.put(guildName,guild);
        Bukkit.broadcastMessage("Dodana nowy gang:"+guildName);
    }

    public static void AddGuildMember(Player p, String guildName){
        Guild guild = guilds.get(guildName);
        guild.AddGuildMember(p);
    }
    public static void RemoveGuildMember(Player p, String guildName){
        Guild guild = guilds.get(guildName);
        guild.RemoveGuildMember(p);
    }

}
