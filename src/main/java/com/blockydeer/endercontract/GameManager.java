package com.blockydeer.endercontract;

import com.blockydeer.endercontract.tag.Tag;
import com.blockydeer.endercontract.tag.tags.*;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static final GameManager gameManager = new GameManager();
    private int enderDragonCount = 1;

    private final List<Tag> tagList = new ArrayList<>();

    private double monsterDamageRate = 1.0d;
    private double monsterHpRate = 1.0d;
    public static GameManager getGameManager() {
        return gameManager;
    }

    public void init() {
        tagList.add(new Cage());

        tagList.add(new StrongerMob1());
        tagList.add(new StrongerMob2());
        tagList.add(new StrongerMob3());

        tagList.add(new RottenBlood1());
        tagList.add(new RottenBlood2());
        tagList.add(new RottenBlood3());


    }

    public int getEnderDragonCount() {
        return enderDragonCount;
    }

    public void setEnderDragonCount(int enderDragonCount) {
        this.enderDragonCount = enderDragonCount;
    }

    public double getMonsterDamageRate() {
        return monsterDamageRate;
    }

    public void monsterDamageRateTimes(double value) {
        monsterDamageRate *= value;
    }

    public double getMonsterHpRate() {
        return monsterHpRate;
    }

    public void monsterHpRateTimes(double value) {
        monsterHpRate *= value;
    }

    public void registerTag(Tag tag) {
        tagList.add(tag);
    }


    public void tagInit() {
        tagList.forEach(Tag::init);
    }

    public void tagTick() {
        tagList.forEach(Tag::tick);
    }

    public void tagClean() {
        tagList.forEach(Tag::clean);
    }
}
