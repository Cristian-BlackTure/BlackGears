package io.github.thebusybiscuit.extragear;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.inventory.ItemStack;

public class IngotComp extends AContainer implements RecipeDisplayItem {
    public IngotComp(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
     super(itemGroup, item, recipeType, recipe);}
        @Override
        protected void registerDefaultRecipes() {

            registerRecipe(8, new ItemStack[] {new ItemStack(Material.COBBLESTONE, 8)}, new ItemStack[] {Material.COBBLESTONE, 1});
            registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(Material.COBBLESTONE, 8)}, new ItemStack[] {Material.COBBLESTONE, 1});

        }
        @Override
        public ItemStack getProgressBar() {
            return new ItemStack(SlimefunItems.ELECTRIC_PRESS);
        }
        @Override
        public String getMachineIdentifier() {return "INGOTCOMP";}

    }

