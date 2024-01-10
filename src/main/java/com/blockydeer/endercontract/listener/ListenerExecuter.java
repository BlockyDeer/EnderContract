package com.blockydeer.endercontract.listener;

import org.bukkit.event.Event;

import java.util.ArrayList;
import java.util.List;

public class ListenerExecuter {
    private final List<ListenerRunnable> entitySpawnExecution = new ArrayList<>();

    public void registerGameEvents(ListenerType listenerType, ListenerRunnable runnable) {
        switch (listenerType) {
            case ENTITY_SPAWN -> entitySpawnExecution.add(runnable);
            default -> throw new RuntimeException("Unsupported listener Type.");
        }
    }

    public void entitySpawnExecutionForEach(Event event) {
        entitySpawnExecution.forEach(runnable -> runnable.run(event));
    }
}
