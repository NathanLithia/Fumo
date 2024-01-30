package net.mcreator.fumo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fumo.init.FumoModItems;
import net.mcreator.fumo.init.FumoModEntities;

public class EikiSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(FumoModItems.EIKI_ITEM.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = FumoModEntities.EIKI.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot((float) (entity.getYRot() - 180));
				entityToSpawn.setYBodyRot((float) (entity.getYRot() - 180));
				entityToSpawn.setYHeadRot((float) (entity.getYRot() - 180));
			}
		}
	}
}
