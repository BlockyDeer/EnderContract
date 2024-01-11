package com.blockydeer.endercontract.listener.base;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.Locale;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;

public class GameStart {
    public void playerInit() {
        GameManager.getGameManager().getInGamePlayerList().forEach(id -> {
            Player player = Bukkit.getPlayerExact(id);
            if (player == null) {
                GameManager.getGameManager().playerGone(id);
            }
            AttributeInstance attri = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            attri.setBaseValue(GameManager.getGameManager().getPlayerMaxHp());
        });
    }
}
