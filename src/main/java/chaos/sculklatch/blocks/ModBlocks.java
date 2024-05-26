package chaos.sculklatch.blocks;

import chaos.sculklatch.SculkLatch;
import chaos.sculklatch.blocks.blockEntities.ModBlockEntities;
import chaos.sculklatch.blocks.custom.SculkChestBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SCULK_CHEST = registerBlock("sculk_chest",
            new SculkChestBlock(AbstractBlock.Settings.create().strength(50.0F, 12.0F),  () -> {
                return ModBlockEntities.SCULK_CHEST_BLOCK_ENTITY_TYPE;
            }));
    private static Block registerBlock(String name, Block item) {
        return Registry.register(Registries.BLOCK, new Identifier(SculkLatch.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SculkLatch.LOGGER.info("Registering Blocks for Mod " + SculkLatch.MOD_ID);
    }
}