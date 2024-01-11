package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.concurrent.atomic.AtomicBoolean;

public class Weakness2 extends Tag {
    private final int WEAKNESS_AMPLIFIER = 2;

    public Weakness2() {
        super(10, "虚弱Ⅱ", "玩家获得虚弱Ⅱ", Material.POTION);
    }

    @Override
    public void init() {
    }

    @Override
    public void tick() {
        GameManager.getGameManager().getInGamePlayerList().forEach(id -> {
            Player player = Bukkit.getPlayerExact(id);
            if (player == null) {
                GameManager.getGameManager().playerGone(id);
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1, WEAKNESS_AMPLIFIER, true, false));
        });
    }

    @Override
    public void clean() {
    }
}
