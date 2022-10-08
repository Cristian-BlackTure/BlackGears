package io.github.thebusybiscuit.extragear;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.extragear.IngotComp;

@UtilityClass
public final class ACMBlocks {

    public static final SlimefunItemStack INGOTCOMP = new SlimefunItemStack(
            "INGOT_COMP",
            Material.BLACK_CONCRETE,
            "&6Ingot Compressor",
            "&ebuilds ingots it's just that."
    );

    public static void setup(ExtraGear plugin) {
        ItemGroup category = new ItemGroup(SimpleUtils.createKey("main"),
                new CustomItemStack(Material.IRON_BLOCK, "&6BlackTure Tech"), 0);

        new IngotComp(category, INGOTCOMP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK),
                new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.QUARTZ_BLOCK),
                new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK)
        }).register(plugin);
    }
}
