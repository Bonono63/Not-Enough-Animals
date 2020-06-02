package net.nea.registry;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;
import net.nea.Main;

public class NEntityTypes {

    public NEntityTypes()
    {}

    public static void init() {
    }

    private static <T extends Entity> EntityType<T> register(String name, EntityType<T> entity) {
        return Registry.register(Registry.ENTITY_TYPE, Main.id(name), entity);
    }
}
