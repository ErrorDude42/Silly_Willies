
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SillyWillyCoreMod.MODID);
	public static final RegistryObject<CreativeModeTab> GEOMETERY_DIMENSION_BETA = REGISTRY.register("geometery_dimension_beta",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.silly_willy_core.geometery_dimension_beta")).icon(() -> new ItemStack(SillyWillyCoreModItems.REFINED_TRIANGULUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SillyWillyCoreModItems.RAW_TRIANGULUM.get());
				tabData.accept(SillyWillyCoreModItems.REFINED_TRIANGULUM.get());
				tabData.accept(SillyWillyCoreModBlocks.TRIANGULUMORE.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.TRIANGULUMORE_DEEPSLATE.get().asItem());
			})

					.build());
}
