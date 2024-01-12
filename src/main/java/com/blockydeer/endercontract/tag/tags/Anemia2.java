package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;

public class Anemia2 extends Tag {
    public Anemia2() {
        super(8, "贫血Ⅱ", "玩家初始最大血量减少10点（同类效果取最高）", Material.IRON_CHESTPLATE);
    }

    @Override
    public void init() {
        GameManager.getGameManager().playerMaxHpSub(10.0d);
    }

    @Override
    public void tick() {

    }

}

