package no.github.hepolite.antipickup;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginAntiPickup extends JavaPlugin
{
    private final Handler handler = new Handler();
    
    @Override
    public void onEnable()
    {
        Bukkit.getPluginManager().registerEvents(handler, this);
    }
}
