package net.nea;

import net.fabricmc.api.ModInitializer;
import net.nea.registry.NEntities;

public class Main implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		NEntities.init();

		System.out.println("Hello Fabric world!");
	}
}
