package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.Material;

public class Uhc extends Tag {
    public Uhc() {
        super(16, "UHC", "玩家血量不再自然回复", Material.GOLDEN_APPLE);
    }

    @Override
    public void init() {
        Bukkit.getWorlds().forEach(world -> world.setGameRule(GameRule.NATURAL_REGENERATION, false));
    }

    @Override
    public void tick() {

    }
}
