package com.blockydeer.endercontract.tag.tags.effectbase;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public abstract class HungerBase extends Tag {
    protected int hungerAmplifier;

    public HungerBase(int id, String name, String description, Material showedItem, int hungerAmplifier) {
        super(id, name, description, showedItem);
        this.hungerAmplifier = hungerAmplifier;
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

            player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 1, hungerAmplifier, true, false));
        });
    }
}
