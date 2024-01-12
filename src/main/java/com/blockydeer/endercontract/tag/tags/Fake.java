package com.blockydeer.endercontract.tag.tags;

import com.blockydeer.endercontract.listener.ListenerExecutor;
import com.blockydeer.endercontract.listener.ListenerType;
import com.blockydeer.endercontract.tag.Tag;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Fake extends Tag {
    private final List<Material> toolAndWeapon = new ArrayList<>();
    public Fake() {
        super(17, "假货", "所有工具和武器及盔甲耐久变为普通木质武器耐久（金质工具、武器和盔甲除外）", Material.WOODEN_PICKAXE);

        toolAndWeapon.add(Material.FLINT_AND_STEEL);
        toolAndWeapon.add(Material.SHEARS);

        toolAndWeapon.add(Material.FISHING_ROD);
        // 胡萝卜钓竿
        toolAndWeapon.add(Material.CARROT_ON_A_STICK);
        // 诡异菌钓竿
        toolAndWeapon.add(Material.WARPED_FUNGUS_ON_A_STICK);

        toolAndWeapon.add(Material.ELYTRA);

        toolAndWeapon.add(Material.STONE_AXE);
        toolAndWeapon.add(Material.STONE_HOE);
        toolAndWeapon.add(Material.STONE_PICKAXE);
        toolAndWeapon.add(Material.STONE_SHOVEL);
        toolAndWeapon.add(Material.STONE_SWORD);

        toolAndWeapon.add(Material.IRON_AXE);
        toolAndWeapon.add(Material.IRON_HOE);
        toolAndWeapon.add(Material.IRON_SHOVEL);
        toolAndWeapon.add(Material.IRON_PICKAXE);
        toolAndWeapon.add(Material.IRON_SWORD);

        toolAndWeapon.add(Material.DIAMOND_AXE);
        toolAndWeapon.add(Material.DIAMOND_HOE);
        toolAndWeapon.add(Material.DIAMOND_SHOVEL);
        toolAndWeapon.add(Material.DIAMOND_PICKAXE);
        toolAndWeapon.add(Material.DIAMOND_SWORD);

        toolAndWeapon.add(Material.NETHERITE_AXE);
        toolAndWeapon.add(Material.NETHERITE_HOE);
        toolAndWeapon.add(Material.NETHERITE_SHOVEL);
        toolAndWeapon.add(Material.NETHERITE_PICKAXE);
        toolAndWeapon.add(Material.NETHERITE_SWORD);

        toolAndWeapon.add(Material.LEATHER_HELMET);
        toolAndWeapon.add(Material.LEATHER_CHESTPLATE);
        toolAndWeapon.add(Material.LEATHER_LEGGINGS);
        toolAndWeapon.add(Material.LEATHER_BOOTS);

        toolAndWeapon.add(Material.IRON_HELMET);
        toolAndWeapon.add(Material.IRON_CHESTPLATE);
        toolAndWeapon.add(Material.IRON_LEGGINGS);
        toolAndWeapon.add(Material.IRON_BOOTS);

        toolAndWeapon.add(Material.GOLDEN_HELMET);
        toolAndWeapon.add(Material.GOLDEN_CHESTPLATE);
        toolAndWeapon.add(Material.GOLDEN_LEGGINGS);
        toolAndWeapon.add(Material.GOLDEN_BOOTS);


    }

    @Override
    public void init() {
        ListenerExecutor.getListenerExecutor().registerGameEvents(ListenerType.INVENTORY_MOVE_ITEM, event -> {
            if (!(event instanceof InventoryMoveItemEvent)) {
                return;
            }
            InventoryMoveItemEvent invEvent = (InventoryMoveItemEvent) event;
            ItemStack item = invEvent.getItem();
            if ()
        });
    }

    @Override
    public void tick() {
    }
}
