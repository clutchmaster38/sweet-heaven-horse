package io.github.clutchmaster38.sweetheavenhorse;

import io.github.clutchmaster38.sweetheavenhorse.block.CopperBlock;
import io.github.clutchmaster38.sweetheavenhorse.item.CopperBar;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;
import org.apache.logging.log4j.Logger;

public class SweetHeavenHorse {
    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    @Entrypoint.Logger
    public static Logger LOGGER = Null.get();

    public static Block copperBlock;

    public static Item copperBar;

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        copperBlock = new CopperBlock(NAMESPACE.id("copper_block")).setTranslationKey(NAMESPACE, "copper_block");
    }

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        copperBar = new CopperBar(NAMESPACE.id("copper_bar")).setTranslationKey(NAMESPACE, "copper_bar");
    }
}
