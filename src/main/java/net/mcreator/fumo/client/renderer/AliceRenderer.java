
package net.mcreator.fumo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fumo.entity.AliceEntity;
import net.mcreator.fumo.client.model.ModelFumo;

public class AliceRenderer extends MobRenderer<AliceEntity, ModelFumo<AliceEntity>> {
	public AliceRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFumo(context.bakeLayer(ModelFumo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(AliceEntity entity) {
		return new ResourceLocation("fumo:textures/entities/alice.png");
	}
}
