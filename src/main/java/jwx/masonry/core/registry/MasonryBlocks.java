package jwx.masonry.core.registry;

import com.mojang.datafixers.util.Pair;
import com.teamabnormals.blueprint.core.util.PropertyUtil;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import jwx.masonry.core.Masonry;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;

@Mod.EventBusSubscriber(modid = Masonry.MOD_ID,bus= Mod.EventBusSubscriber.Bus.MOD)
public class MasonryBlocks {
    public static final BlockSubRegistryHelper HELPER = Masonry.REGISTRY_HELPER.getBlockSubHelper();
    //tuff
    public static final RegistryObject<Block>  POLISHED_TUFF = HELPER.createBlock("polished_tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  TUFF_BRICKS = HELPER.createBlock("tuff_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CRACKED_TUFF_BRICKS = HELPER.createBlock("cracked_tuff_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CHISELED_TUFF = HELPER.createBlock("chiseled_tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //calcite
    public static final RegistryObject<Block>  POLISHED_CALCITE = HELPER.createBlock("polished_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CALCITE_BRICKS = HELPER.createBlock("calcite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CRACKED_CALCITE_BRICKS = HELPER.createBlock("cracked_calcite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CHISELED_CALCITE = HELPER.createBlock("chiseled_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //dripstone
    public static final RegistryObject<Block>  POLISHED_DRIPSTONE = HELPER.createBlock("polished_dripstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  DRIPSTONE_BRICKS = HELPER.createBlock("dripstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CRACKED_DRIPSTONE_BRICKS = HELPER.createBlock("cracked_dripstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CHISELED_DRIPSTONE = HELPER.createBlock("chiseled_dripstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //granite
    public static final RegistryObject<Block>  GRANITE_BRICKS = HELPER.createBlock("granite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CRACKED_GRANITE_BRICKS = HELPER.createBlock("cracked_granite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CHISELED_GRANITE = HELPER.createBlock("chiseled_granite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //diorite
    public static final RegistryObject<Block>  DIORITE_BRICKS = HELPER.createBlock("diorite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CRACKED_DIORITE_BRICKS = HELPER.createBlock("cracked_diorite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CHISELED_DIORITE = HELPER.createBlock("chiseled_diorite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //andesite
    public static final RegistryObject<Block>  ANDESITE_BRICKS = HELPER.createBlock("andesite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CRACKED_ANDESITE_BRICKS = HELPER.createBlock("cracked_andesite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block>  CHISELED_ANDESITE = HELPER.createBlock("chiseled_andesite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

}
