package com.blockydeer.endercontract.listener.tag;

import com.blockydeer.endercontract.listener.ListenerExecutor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

public class InventoryMoveItem implements Listener {
    @EventHandler
    public void onInventoryMove(InventoryMoveItemEvent event) {
        ListenerExecutor.getListenerExecutor().inventoryMoveItemExecutionForEach(event);
    }
}
