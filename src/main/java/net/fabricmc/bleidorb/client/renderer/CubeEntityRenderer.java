package net.fabricmc.bleidorb.client.renderer;

import net.fabricmc.bleidorb.Main;
import net.fabricmc.bleidorb.client.model.CubeEntityModel;
import net.fabricmc.bleidorb.entity.CubeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

    public CubeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CubeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier(Main.MOD_ID, "textures/entity/cube/cube.png");
    }
}
