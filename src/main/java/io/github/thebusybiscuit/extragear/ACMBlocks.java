package io.github.thebusybiscuit.extragear;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;


public class ACMBlocks {

    private ACMBlocks() {}
    //Machines
    public static final SlimefunItemStack INGOTCOMP = new SlimefunItemStack("INGOTCOMP", Material.PISTON, "&eIngot Builder", "", "&7Builds Ingots", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eBlack Tech");

    //Item Groups
    public static final NestedItemGroup JC_CC_GENERAL = new NestedItemGroup(new NamespacedKey(ExtraGear.getInstance(), "JC_CC_GENERAL"), new CustomItemStack(Material.PISTON, "&bBlackTure Tech"));
    public static final SubItemGroup JC_CC_ITEM_COMPRESSION = new SubItemGroup(new NamespacedKey(ExtraGear.getInstance(), "JC_CC_ITEM_COMPRESSION"), JC_CC_GENERAL, new CustomItemStack(Material.PISTON, "&bItems"));
    public static final SubItemGroup JC_CC_MACHINES = new SubItemGroup(new NamespacedKey(ExtraGear.getInstance(), "JC_CC_MACHINES"), JC_CC_GENERAL, new CustomItemStack(Material.BLAST_FURNACE, "&bMachines"));
}
