package com.blockydeer.endercontract.util;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Util {
    public static List<Entity> getAllEntity() {
        List<Entity> entityList = new ArrayList<>();
        for (World world : Bukkit.getWorlds()) {
            entityList.addAll(world.getEntities());
        }
        return entityList;
    }

    public static List<Monster> getAllMonster() {
        List<Monster> monsterList = new ArrayList<>();
        Util.getAllEntity().forEach(entity -> {
            if (entity instanceof Monster monster) {
                monsterList.add(monster);
            }
        });
        return monsterList;
    }

    public static List<Zombie> getAllZombie() {
        List<Zombie> zombieList = new ArrayList<>();
        Util.getAllEntity().forEach(entity -> {
            if (entity instanceof Zombie zombie) {
                zombieList.add(zombie);
            }
        });
        return zombieList;
    }

    public static void zombieAddPotionEffect(PotionEffect potionEffect) {
        Util.getAllZombie().forEach(zombie -> zombie.addPotionEffect(potionEffect));
    }

    public static void zombieSetMaxHealth(double rate) {
        Util.getAllZombie().forEach(zombie -> {
            AttributeInstance attri = Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH));
            double maxHealth = attri.getBaseValue();
            attri.setBaseValue(maxHealth * rate);
        });
    }

    public static void monsterSetDamage(double rate) {
        Util.getAllMonster().forEach(monster -> {
            AttributeInstance attri = Objects.requireNonNull(monster.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE));
            double damage = attri.getBaseValue();
            attri.setBaseValue(damage * rate);
        });
    }
}
