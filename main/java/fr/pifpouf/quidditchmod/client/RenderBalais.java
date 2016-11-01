package fr.pifpouf.quidditchmod.client;

import fr.pifpouf.quidditchmod.common.EntityBalais;
import fr.pifpouf.quidditchmod.common.QuidditchMod;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderHorse;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderBalais extends RenderLiving
{
    public final ResourceLocation texture = new ResourceLocation(QuidditchMod.MODID, "textures/entity/entity_balais.png"); 
    
    public RenderBalais(ModelBalais model, float shadow)
    {
        super(model, shadow);
    }
    
    protected ResourceLocation getEntityTexture(Entity living)
    {
        return this.getEntityBalaisTexture((EntityBalais)living);
    }

    private ResourceLocation getEntityBalaisTexture(EntityBalais entityBalais)
    {
        return texture;
    }
}