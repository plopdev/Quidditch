package fr.pifpouf.quidditchmod.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.pifpouf.quidditchmod.client.ModelBalais;
import fr.pifpouf.quidditchmod.client.RenderBalais;
import fr.pifpouf.quidditchmod.common.EntityBalais;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRender()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityBalais.class, new RenderBalais(new ModelBalais(), 0.5F));
    }
}