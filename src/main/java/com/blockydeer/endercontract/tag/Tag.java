package com.blockydeer.endercontract.tag;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public abstract class Tag {
    private final int id;
    private final String name;
    private final String description;
    private final ItemStack showedItem;

    public Tag(int id, String name, String description, Material showedItem) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.showedItem = new ItemStack(showedItem);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ItemStack getShowedItem() {
        return showedItem;
    }

    public abstract void init();
    public abstract void tick();
    public abstract void clean();
}
