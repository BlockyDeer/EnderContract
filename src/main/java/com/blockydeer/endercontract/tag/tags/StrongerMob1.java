package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.listener.ListenerRunnable;
import com.blockydeer.endercontract.tag.Tag;
import com.blockydeer.endercontract.util.Util;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.EntityCategory;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Zombie;
import org.bukkit.event.Event;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

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

    @Override
    public void clean() {
    }
}
