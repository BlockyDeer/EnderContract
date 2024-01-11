package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import com.blockydeer.endercontract.util.Util;
import org.bukkit.Material;

/**
 * 怪物增强Ⅱ
 * 所有怪物攻击力增加30%
 */
public class StrongerMob2 extends Tag {
    public StrongerMob2() {
        super(2, "怪物增强Ⅱ", "所有怪物的攻击力增加30%", Material.IRON_SWORD);
    }

    @Override
    public void init() {
        GameManager.getGameManager().monsterDamageRateTimes(1.3d);
    }

    @Override
    public void tick() {

    }

    @Override
    public void clean() {

    }
}
