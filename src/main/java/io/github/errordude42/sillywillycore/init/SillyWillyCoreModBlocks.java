
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.github.errordude42.sillywillycore.block.TriangulumoreDeepslateBlock;
import io.github.errordude42.sillywillycore.block.TriangulumoreBlock;
import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SillyWillyCoreMod.MODID);
	public static final RegistryObject<Block> TRIANGULUMORE = REGISTRY.register("triangulumore", () -> new TriangulumoreBlock());
	public static final RegistryObject<Block> TRIANGULUMORE_DEEPSLATE = REGISTRY.register("triangulumore_deepslate", () -> new TriangulumoreDeepslateBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
