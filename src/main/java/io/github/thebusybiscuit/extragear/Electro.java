package me.gallowsdove.foxymachines;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import me.gallowsdove.foxymachines.implementation.machines.ElectricGoldRefinery;
import me.gallowsdove.foxymachines.implementation.machines.ForcefieldDome;
import me.gallowsdove.foxymachines.implementation.machines.ImprovementForge;
import me.gallowsdove.foxymachines.implementation.machines.PotionMixer;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

public final class Items{

    // Item groups
    public static NestedItemGroup MAIN_ITEM_GROUP = new NestedItemGroup(
            new NamespacedKey(ExtraGear.getInstance(), "blackture"),
            new CustomItemStack(Material.BLACK_CONCRETE, "&4BlackTure Tech")
    );

    public static SubItemGroup MATERIALS_ITEM_GROUP = new SubItemGroup(
            new NamespacedKey(ExtraGear.getInstance(), "materials"),
            MAIN_ITEM_GROUP,
            new CustomItemStack(Material.GOLD_INGOT, "&bMaterials")
    );

    public static SubItemGroup TOOLS_ITEM_GROUP = new SubItemGroup(
            new NamespacedKey(ExtraGear.getInstance(), "tools"),
            MAIN_ITEM_GROUP,
            new CustomItemStack(Material.IRON_INGOT, "&bTools")
    );

