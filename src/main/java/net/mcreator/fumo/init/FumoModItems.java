
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fumo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.fumo.item.TanCirnoItemItem;
import net.mcreator.fumo.item.ReimuItemItem;
import net.mcreator.fumo.item.NewReimuItemItem;
import net.mcreator.fumo.item.MarisaItemItem;
import net.mcreator.fumo.item.MarisaHatItemItem;
import net.mcreator.fumo.item.KoishiItemItem;
import net.mcreator.fumo.item.FumoitemItem;
import net.mcreator.fumo.item.FlandreItemItem;
import net.mcreator.fumo.item.EikiItemItem;
import net.mcreator.fumo.item.CreativeTabIconItem;
import net.mcreator.fumo.item.CirnoItemItem;
import net.mcreator.fumo.item.ChenItemItem;
import net.mcreator.fumo.item.BlueReimuItemItem;
import net.mcreator.fumo.FumoMod;

public class FumoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FumoMod.MODID);
	public static final RegistryObject<Item> FUMOITEM = REGISTRY.register("fumoitem", () -> new FumoitemItem());
	public static final RegistryObject<Item> MARISA_HAT_ITEM = REGISTRY.register("marisa_hat_item", () -> new MarisaHatItemItem());
	public static final RegistryObject<Item> EIKI_ITEM = REGISTRY.register("eiki_item", () -> new EikiItemItem());
	public static final RegistryObject<Item> REIMU_ITEM = REGISTRY.register("reimu_item", () -> new ReimuItemItem());
	public static final RegistryObject<Item> MARISA_ITEM = REGISTRY.register("marisa_item", () -> new MarisaItemItem());
	public static final RegistryObject<Item> CIRNO_ITEM = REGISTRY.register("cirno_item", () -> new CirnoItemItem());
	public static final RegistryObject<Item> TAN_CIRNO_ITEM = REGISTRY.register("tan_cirno_item", () -> new TanCirnoItemItem());
	public static final RegistryObject<Item> CHEN_ITEM = REGISTRY.register("chen_item", () -> new ChenItemItem());
	public static final RegistryObject<Item> NEW_REIMU_ITEM = REGISTRY.register("new_reimu_item", () -> new NewReimuItemItem());
	public static final RegistryObject<Item> BLUE_REIMU_ITEM = REGISTRY.register("blue_reimu_item", () -> new BlueReimuItemItem());
	public static final RegistryObject<Item> KOISHI_ITEM = REGISTRY.register("koishi_item", () -> new KoishiItemItem());
	public static final RegistryObject<Item> FLANDRE_ITEM = REGISTRY.register("flandre_item", () -> new FlandreItemItem());
	public static final RegistryObject<Item> CREATIVE_TAB_ICON = REGISTRY.register("creative_tab_icon", () -> new CreativeTabIconItem());
}
