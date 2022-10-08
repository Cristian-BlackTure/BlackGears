package io.github.thebusybiscuit.extragear;

import java.util.Arrays;
import java.util.List;

import org.bstats.bukkit.Metrics;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

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
