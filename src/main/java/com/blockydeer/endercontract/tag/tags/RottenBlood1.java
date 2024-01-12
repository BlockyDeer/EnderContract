package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;

public class RottenBlood1 extends Tag {
    public RottenBlood1() {
        super(4, "腐化之血Ⅰ", "所有怪物的血量增加20%", Material.POTION);
    }

    @Override
    public void init() {
        GameManager.getGameManager().monsterHpRateTimes(1.2d);
    }

    @Override
    public void tick() {

    }

}
