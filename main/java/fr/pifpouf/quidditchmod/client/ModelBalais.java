package fr.pifpouf.quidditchmod.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBalais extends ModelBase
{
    // fields
    ModelRenderer Manche;
    ModelRenderer Cube;
    ModelRenderer Paille;

    public ModelBalais()
    {
        textureWidth = 64;
        textureHeight = 32;

        Manche = new ModelRenderer(this, 0, 5);
        Manche.addBox(0F, 0F, 0F, 27, 1, 1);
        Manche.setRotationPoint(-19F, 18F, -1F);
        Manche.setTextureSize(64, 32);
        Manche.mirror = true;
        setRotation(Manche, 0F, 0F, 0F);
        Cube = new ModelRenderer(this, 0, 11);
        Cube.addBox(0F, 0F, 0F, 3, 3, 3);
        Cube.setRotationPoint(8F, 17F, -2F);
        Cube.setTextureSize(64, 32);
        Cube.mirror = true;
        setRotation(Cube, 0F, 0F, 0F);
        Paille = new ModelRenderer(this, 0, 22);
        Paille.addBox(0F, 0F, 0F, 12, 5, 5);
        Paille.setRotationPoint(11F, 16F, -3F);
        Paille.setTextureSize(64, 32);
        Paille.mirror = true;
        setRotation(Paille, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Manche.render(f5);
        Cube.render(f5);
        Paille.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
