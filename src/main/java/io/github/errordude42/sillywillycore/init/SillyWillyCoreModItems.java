
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import io.github.errordude42.sillywillycore.item.RefinedTriangulumItem;
import io.github.errordude42.sillywillycore.item.RawTriangulumItem;
import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SillyWillyCoreMod.MODID);
	public static final RegistryObject<Item> RAW_TRIANGULUM = REGISTRY.register("raw_triangulum", () -> new RawTriangulumItem());
	public static final RegistryObject<Item> REFINED_TRIANGULUM = REGISTRY.register("refined_triangulum", () -> new RefinedTriangulumItem());
	public static final RegistryObject<Item> TRIANGULUMORE = block(SillyWillyCoreModBlocks.TRIANGULUMORE);
	public static final RegistryObject<Item> TRIANGULUMORE_DEEPSLATE = block(SillyWillyCoreModBlocks.TRIANGULUMORE_DEEPSLATE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
