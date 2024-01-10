package com.blockydeer.endercontract;

import com.blockydeer.endercontract.tag.Tag;
import com.blockydeer.endercontract.tag.tags.Cage;
import com.blockydeer.endercontract.tag.tags.StrongerMob1;
import com.blockydeer.endercontract.tag.tags.StrongerMob2;
import com.blockydeer.endercontract.tag.tags.StrongerMob3;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static final GameManager gameManager = new GameManager();
    private int enderDragonCount = 1;

    private final List<Tag> tagList = new ArrayList<>();


    public static GameManager getGameManager() {
        return gameManager;
    }

    public void init() {
        tagList.add(new Cage());

        tagList.add(new StrongerMob1());
        tagList.add(new StrongerMob2());
        tagList.add(new StrongerMob3());
    }

    public int getEnderDragonCount() {
        return enderDragonCount;
    }

    public void setEnderDragonCount(int enderDragonCount) {
        this.enderDragonCount = enderDragonCount;
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
