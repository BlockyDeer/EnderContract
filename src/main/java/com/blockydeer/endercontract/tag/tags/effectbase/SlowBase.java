package com.blockydeer.endercontract.tag.tags.effectbase;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public abstract class SlowBase extends Tag {
    private final int slowAmplifier;

    public SlowBase(int id, String name, String description, Material showedItem, int slowAmplifier) {
        super(id, name, description, showedItem);
        this.slowAmplifier = slowAmplifier;
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

            if (!(player.hasPotionEffect(PotionEffectType.SLOW) &&
                    Objects.requireNonNull(player.getPotionEffect(PotionEffectType.SPEED)).getAmplifier() < slowAmplifier)) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1, slowAmplifier, true, false));
            }
        });
    }
}
