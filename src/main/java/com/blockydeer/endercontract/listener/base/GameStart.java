package com.blockydeer.endercontract.listener.base;

import com.blockydeer.endercontract.GameManager;
import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;

public class GameStart {
    public void playerInit() {
        GameManager gameManager = GameManager.getGameManager();

        gameManager.tagInit();

        gameManager.getInGamePlayerList().forEach(id -> {
            Player player = Bukkit.getPlayerExact(id);
            if (player == null) {
                gameManager.playerGone(id);
            }
            AttributeInstance attri = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            attri.setBaseValue(gameManager.getPlayerMaxHp());
        });
    }
}
