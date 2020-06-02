package net.nea;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.nea.registry.NEntities;

public class Main implements ModInitializer {

	public static final String MOD_ID = "nea";

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(id("nea"), () -> new ItemStack(Items.BLUE_CARPET));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		NEntities.init();

		System.out.println("Hello Fabric world!");
	}
}
