package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;

/**
 * 怪物增强Ⅲ
 * 所有怪物攻击力增加50%
 */
public class StrongerMob3 extends Tag {
    public StrongerMob3() {
        super(3, "怪物增强Ⅲ", "所有怪物的攻击力增加50%", Material.DIAMOND_SWORD);
    }

    @Override
    public void init() {
        GameManager.getGameManager().monsterDamageRateTimes(1.5d);
    }

    @Override
    public void tick() {
    }

}
