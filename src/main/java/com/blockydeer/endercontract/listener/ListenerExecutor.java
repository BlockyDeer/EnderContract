package com.blockydeer.endercontract.listener;

import org.bukkit.event.Event;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class ListenerExecutor {
    private static final ListenerExecutor listenerExecutor = new ListenerExecutor();
    private final List<ListenerRunnable> entitySpawnExecution = new ArrayList<>();
    private final List<ListenerRunnable> creatureSpawnExecution = new ArrayList<>();
    private final List<ListenerRunnable> inventoryMoveItemExecution = new ArrayList<>();

    public static ListenerExecutor getListenerExecutor() {
        return listenerExecutor;
    }

    public void registerGameEvents(ListenerType listenerType, ListenerRunnable runnable) {
        switch (listenerType) {
            case ENTITY_SPAWN -> entitySpawnExecution.add(runnable);
            default -> throw new RuntimeException("Unsupported listener Type.");
        }
    }

    public void entitySpawnExecutionForEach(Event event) {
        entitySpawnExecution.forEach(runnable -> runnable.run(event));
    }

    public void creatureSpawnExecutionForEach(Event event) {
        creatureSpawnExecution.forEach(runnable -> runnable.run(event));
    }

    public void inventoryMoveItemExecutionForEach(Event event) {
        inventoryMoveItemExecution.forEach(runnable -> runnable.run(event));
    }
}
