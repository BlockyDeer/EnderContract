package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;

public class RottenBlood3 extends Tag {
    public RottenBlood3() {
        super(6, "腐化之血Ⅲ", "所有怪物的血量增加50%", Material.POTION);
    }

    @Override
    public void init() {
        GameManager.getGameManager().monsterHpRateTimes(1.2d);
    }

    @Override
    public void tick() {

    }

    @Override
    public void clean() {

    }
}
