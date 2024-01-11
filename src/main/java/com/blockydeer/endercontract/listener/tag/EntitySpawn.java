package com.blockydeer.endercontract.listener.tag;

import com.blockydeer.endercontract.GameManager;
import com.blockydeer.endercontract.listener.ListenerExecutor;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EntitySpawn implements Listener {
    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent event) {
        ListenerExecutor.getListenerExecutor().entitySpawnExecutionForEach(event);
    }

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity instanceof Monster monster) {
            // Damage set
            AttributeInstance attriDamage = monster.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE);
            double damage = attriDamage.getBaseValue();
            attriDamage.setBaseValue(damage * GameManager.getGameManager().getMonsterDamageRate());

            // Hp set

            // max hp
            AttributeInstance attriMaxHp = monster.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            double hp = attriMaxHp.getBaseValue();

            double finalHp = hp * GameManager.getGameManager().getMonsterHpRate();
            attriMaxHp.setBaseValue(finalHp);

            // hp itself
            monster.setHealth(finalHp);

            // Hp set END

        }
    }
}
