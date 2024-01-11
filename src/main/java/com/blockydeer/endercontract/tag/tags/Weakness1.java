package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Weakness1 extends Tag {
    private final int WEAKNESS_AMPLIFIER = 1;

    public Weakness1() {
        super(9, "虚弱Ⅰ", "玩家获得虚弱Ⅰ", Material.POTION);
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
