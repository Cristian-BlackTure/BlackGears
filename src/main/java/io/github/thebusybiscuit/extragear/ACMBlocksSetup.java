package io.github.thebusybiscuit.extragear;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.jasperchasetoq.compressioncraft.CompressionCraft;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.jasperchasetoq.compressioncraft.CompressionCraftRecipeTypes;
import me.jasperchasetoq.compressioncraft.implementation.items.machines.CcItemCompressor;
import me.jasperchasetoq.compressioncraft.implementation.items.machines.CcItemDecompressor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class ACMBlocksSetup {
    private ACMBlocksSetup() {}

    public static void setup(@Nonnull ExtraGear plugin) {
    
        //Machines
        //Ingot Builder

        new CcItemCompressor(ACMBlocks.JC_CC_MACHINES, ACMBlocks.INGOTCOMP, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                        SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.PISTON), SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
                }).setCapacity(250)
                .setEnergyConsumption(25)
                .setProcessingSpeed(1)
                .register(plugin);
}
}
