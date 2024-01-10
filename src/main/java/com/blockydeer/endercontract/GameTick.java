package com.blockydeer.endercontract;

import org.bukkit.scheduler.BukkitRunnable;

public class GameTick extends BukkitRunnable {
    private GameState gameState = GameState.PREPARING;

    @Override
    public void run() {
        switch (gameState) {
            case PREPARING -> gamePrepare();
            case STARTED -> gameStart();
            default -> throw new RuntimeException("Unsupported gameState.");
        }
    }

    private void gamePrepare() {

    }

    private void gameStart() {
        GameManager.getGameManager().tagTick();
    }
}
