package com.blockydeer.endercontract.tag;

import com.blockydeer.endercontract.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public abstract class Tag {
    private final int id;
    private final String name;
    private final String description;
    private final Material showedItem;

    public Tag(int id, String name, String description, Material showedItem) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.showedItem = showedItem;
    }

    public int getId() {
        return id;
    }

    private ItemStack getShowedItem() {
        return new ItemStack(showedItem);
    }

    private String toStringItemName() {
        StringBuilder finalString = new StringBuilder();
        finalString.append(ChatColor.MAGIC).append(getId()).append(" ").append(name);
        return finalString.toString();
    }

    public ItemStack getFinalShowedItem() {
        ItemStack itemStack = getShowedItem();
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setDisplayName(ChatColor.GOLD + name);
            itemMeta.setLore(Collections.singletonList(ChatColor.AQUA + description));
        } else {
            Main.plugin.getLogger().warning("Fail to get the ItemMeta of the ItemStack, tag id: " + id + ". The description and name of that tag won't be shown.");
        }
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public abstract void init();

    public abstract void tick();

    public abstract void clean();
}
