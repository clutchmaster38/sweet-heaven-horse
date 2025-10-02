package io.github.clutchmaster38.sweetheavenhorse.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;


public class CopperBlock extends TemplateBlock {
    public CopperBlock(Identifier identifier) {
        super(identifier, Material.METAL);
    }

}
