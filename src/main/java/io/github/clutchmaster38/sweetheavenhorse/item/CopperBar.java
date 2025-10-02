package io.github.clutchmaster38.sweetheavenhorse.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.network.packet.PacketHelper;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class CopperBar extends TemplateItem {
    public CopperBar(Identifier identifier) {
        super(identifier);
    }
}
