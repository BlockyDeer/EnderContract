package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;

public class SlowCurse extends Tag {
    public SlowCurse() {
        super(13, "缓慢诅咒", "缓慢效果无法被速度效果抵消", Material.ENCHANTED_BOOK);
    }

    @Override
    public void init() {
        GameManager.getGameManager().setSlowNeutralizable(false);
    }

    @Override
    public void tick() {

    }
}
