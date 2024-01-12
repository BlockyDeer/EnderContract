package com.blockydeer.endercontract;

import com.blockydeer.endercontract.util.Util;
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
        GameManager gameManager = GameManager.getGameManager();

        gameManager.tagTick();

        if (gameManager.getMonsterDamageRate() != 1.0d) {
            Util.monsterSetDamage(gameManager.getMonsterDamageRate());
        }

        if (gameManager.getMonsterHpRate() != 1.0d) {
            Util.monsterSetHp(gameManager.getMonsterHpRate());
        }
    }
}
