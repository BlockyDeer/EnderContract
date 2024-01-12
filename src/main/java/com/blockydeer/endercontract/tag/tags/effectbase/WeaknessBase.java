package com.blockydeer.endercontract.tag.tags.effectbase;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public abstract class WeaknessBase extends Tag {
    protected final int weaknessAmplifier;

    public WeaknessBase(int id, String name, String description, Material showedItem, int weaknessAmplifier) {
        super(id, name, description, showedItem);
        this.weaknessAmplifier = weaknessAmplifier;
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

            player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1, weaknessAmplifier, true, false));
        });
    }
}
