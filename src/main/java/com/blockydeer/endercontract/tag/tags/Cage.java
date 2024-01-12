package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.WorldBorder;

import java.util.Objects;

/**
 * 囚笼
 * 世界边长变为8192
 */
public class Cage extends Tag {
    public Cage() {
        super(0, "囚笼", "世界边长变为8192", Material.BARRIER);
    }

    @Override
    public void init() {
        WorldBorder overWorld = Objects.requireNonNull(Bukkit.getWorld("world")).getWorldBorder();
        overWorld.setCenter(0.0, 0.0);
        overWorld.setSize(8192.0);

        WorldBorder nether = Objects.requireNonNull(Bukkit.getWorld("world_nether")).getWorldBorder();
        nether.setCenter(0.0, 0.0);
        nether.setSize(8192.0 / 8.0);

        WorldBorder end = Objects.requireNonNull(Bukkit.getWorld("world_end")).getWorldBorder();
        end.setCenter(0.0, 0.0);
        end.setSize(8192.0);
    }

    @Override
    public void tick() {

    }

}
