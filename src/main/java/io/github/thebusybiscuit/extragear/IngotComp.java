package io.github.thebusybiscuit.extragear;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class IngotComp extends AContainer implements RecipeDisplayItem {
    public IngotComp(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
     super(itemGroup, item, recipeType, recipe);}
        @Override
        protected void registerDefaultRecipes() {

            registerRecipe(8, new ItemStack[] {new ItemStack(Material.COBBLESTONE, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_1});
            registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_1, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_2});
            registerRecipe(24, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_2, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_3});
            registerRecipe(32, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_3, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_4});
            registerRecipe(40, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_4, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_5});
            registerRecipe(48, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_5, 8)}, new ItemStack[] {CompressionCraftItems.JC_COBBLESTONE_6});

        }
        @Override
        public ItemStack getProgressBar() {
            return new ItemStack(SlimefunItems.ELECTRIC_PRESS);
        }
        @Override
        public String getMachineIdentifier() {return "INGOTCOMP";}

    }

