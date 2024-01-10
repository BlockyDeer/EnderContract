package com.blockydeer.endercontract;

public class Game {
    private GameTick gameTick;

    public void init() {
        gameTick = new GameTick();
    }

    public void run() {
        gameTick.runTaskTimer(Main.plugin, 0, 0);
    }
}
