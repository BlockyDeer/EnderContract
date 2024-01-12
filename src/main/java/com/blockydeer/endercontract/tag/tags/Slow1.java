package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.tag.tags.effectbase.SlowBase;
import org.bukkit.Material;

public class Slow1 extends SlowBase {
    public Slow1() {
        super(11, "缓慢Ⅰ", "玩家获得缓慢Ⅱ（该效果可被速度效果抵消）", Material.SOUL_SAND, 1);
    }
}
