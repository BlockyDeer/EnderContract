package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;

public class Anemia1 extends Tag {
    public Anemia1() {
        super(7, "贫血Ⅰ", "玩家初始最大血量减少6点（同类效果取最高）", Material.IRON_CHESTPLATE);
    }

    @Override
    public void init() {
        GameManager.getGameManager().playerMaxHpSub(6.0d);
    }

    @Override
    public void tick() {

    }

    @Override
    public void clean() {

    }
}
