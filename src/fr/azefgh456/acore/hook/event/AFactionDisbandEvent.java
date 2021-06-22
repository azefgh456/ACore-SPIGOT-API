package fr.azefgh456.acore.hook.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import fr.azefgh456.acore.hook.utils.faction.IFaction;

public class AFactionDisbandEvent extends Event{
	
	private static final HandlerList handlers = new HandlerList();
	
	private IFaction<?,?> faction;
	
	public AFactionDisbandEvent(IFaction<?,?> faction) {
		this.faction = faction;
	}
	
	public IFaction<?,?> getFaction(){
		return this.faction;
	}
	
	public HandlerList getHandlers(){
		return handlers;
	}
     
	public static HandlerList getHandlerList() {
		return handlers;
	}

}
