package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;

/**
 * 怪物增强I
 * 所有怪物攻击力增加20%
 */
public class StrongerMob1 extends Tag {
    public StrongerMob1() {
        super(1, "怪物增强Ⅰ", "所有怪物的攻击力增加20%", Material.STONE_SWORD);
    }

    @Override
    public void init() {
        GameManager.getGameManager().monsterDamageRateTimes(1.2d);
    }

    @Override
    public void tick() {
    }

}
