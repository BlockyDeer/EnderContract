package com.blockydeer.endercontract;

import com.blockydeer.endercontract.listener.base.GameStart;
import com.blockydeer.endercontract.tag.Tag;
import com.blockydeer.endercontract.tag.tags.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static final GameManager gameManager = new GameManager();
    private int enderDragonCount = 1;
    private final List<String> inGamePlayerList = new ArrayList<>();

    private final List<Tag> tagList = new ArrayList<>();
    // 所有怪物的乘算基础攻击力
    private double monsterDamageRate = 1.0d;
    // 所有怪物的乘算血量
    private double monsterHpRate = 1.0d;
    // 玩家最终最大血量
    private double playerMaxHp = 20.0d;

    // 缓慢效果是否可被速度效果抵消
    private boolean slowNeutralizable = true;

    public static GameManager getGameManager() {
        return gameManager;
    }

    public List<String> getInGamePlayerList() {
        return inGamePlayerList;
    }

    private void removePlayer(String id) {
        inGamePlayerList.remove(id);
    }

    public void playerGone(String id) {
        Bukkit.broadcastMessage(ChatColor.YELLOW + Locale.PLAYER_GONE);
        removePlayer(id);
    }
    /**
     * 向参加游戏的玩家列表中添加玩家
     *
     * @param playerId: 添加的玩家id
     * @return 如果该玩家不在列表中，返回true，否则返回false
     */
    public boolean registerPlayer(String playerId) {
        if (inGamePlayerList.contains(playerId)) {
            inGamePlayerList.add(playerId);
            return true;
        } else {
            return false;
        }
    }

    public void init() {
        tagList.add(new Cage());

        tagList.add(new StrongerMob1());
        tagList.add(new StrongerMob2());
        tagList.add(new StrongerMob3());

        tagList.add(new RottenBlood1());
        tagList.add(new RottenBlood2());
        tagList.add(new RottenBlood3());

        tagList.add(new Anemia1());
        tagList.add(new Anemia2());

        tagList.add(new Weakness1());
        tagList.add(new Weakness2());

        tagList.add(new Slow1());
        tagList.add(new Slow2());
    }

    public void start() {
        GameStart gameStart = new GameStart();
        gameStart.playerInit();
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

    /**
     * 向“最终怪物乘算攻击力”上乘倍数
     *
     * @param value: 倍数
     */
    public void monsterDamageRateTimes(double value) {
        monsterDamageRate *= value;
    }

    public double getMonsterHpRate() {
        return monsterHpRate;
    }

    /**
     * 向“最终怪物乘算血量”上乘倍数
     *
     * @param value: 倍数
     */
    public void monsterHpRateTimes(double value) {
        monsterHpRate *= value;
    }

    public double getPlayerMaxHp() {
        return playerMaxHp;
    }

    public void setSlowNeutralizable(boolean slowNeutralizable) {
        this.slowNeutralizable = slowNeutralizable;
    }

    /**
     * 向“玩家最终最大血量”上减去数值
     *
     * @param value: 减去的数值
     */
    public void playerMaxHpSub(double value) {
        playerMaxHp -= value;
    }

    public void tagInit() {
        tagList.forEach(Tag::init);
    }

    public void tagTick() {
        tagList.forEach(Tag::tick);
    }
}
