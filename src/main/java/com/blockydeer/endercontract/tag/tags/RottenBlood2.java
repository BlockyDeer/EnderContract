package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;

public class RottenBlood2 extends Tag {
    public RottenBlood2() {
        super(5, "腐化之血Ⅱ", "所有怪物的血量增加30%", Material.POTION);
    }

    @Override
    public void init() {
        GameManager.getGameManager().monsterHpRateTimes(1.3d);
    }

    @Override
    public void tick() {

    }

    @Override
    public void clean() {

    }
}