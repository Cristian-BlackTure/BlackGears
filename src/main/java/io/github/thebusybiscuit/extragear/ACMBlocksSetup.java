package io.github.thebusybiscuit.extragear;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.extragear.IngotComp;
import io.github.thebusybiscuit.extragear.ACMBlocks;

public class ACMBlocksSetup {
    private ACMBlocksSetup() {}

    public static void setup(ExtraGear plugin) {
    
        //Machines
        //Ingot Builder

        new IngotComp(ACMBlocks.INGOTCOMP, RecipeType.ENHANCED_CRAFTING_TABLE,
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
