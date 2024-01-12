package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.tag.tags.effectbase.SlowBase;
import org.bukkit.Material;

public class Slow2 extends SlowBase {
    public Slow2() {
        super(12, "缓慢Ⅱ", "玩家获得缓慢Ⅱ（该效果可被速度效果抵消）", Material.SOUL_SAND, 2);
    }
}
