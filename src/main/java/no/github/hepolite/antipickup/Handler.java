package no.github.hepolite.antipickup;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class Handler implements Listener
{
    @EventHandler
    public void handle(final EntityPickupItemEvent event)
    {
        if (event.getEntityType() == EntityType.ZOMBIE)
            event.setCancelled(true);
    }
}
