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

public final class ACMBlocks {

    public static final SlimefunItemStack INGOTCOMP = new SlimefunItemStack(
            "INGOT_COMP",
            Material.BLACK_CONCRETE,
            "&6Ingot Compressor",
            "&ebuilds ingots it's just that."
    );

    public static void setup(ExtraGear plugin) {
        ItemStack categoryItem = new CustomItemStack(SlimefunUtils.getCustomHead("240775c3ad75763613f32f04986881bbe4eee4366d0c57f17f7c7514e2d0a77d"), "&2Eco-Power Generators");
        ItemGroup itemGroup = new ItemGroup(new NamespacedKey(this, "BlackTure Tech"), categoryItem, 4);

        new IngotComp(category, INGOTCOMP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK),
                new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.QUARTZ_BLOCK),
                new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK)
        }).register(plugin);
    }
}
