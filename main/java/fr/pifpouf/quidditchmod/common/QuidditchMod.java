package fr.pifpouf.quidditchmod.common;

import java.awt.Color;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.pifpouf.quidditchmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "quidditchmod", name = "QuidditchMod", version = "1.0")

public class QuidditchMod
{
    @Instance("quidditchmod")
    public static QuidditchMod instance;
    public static final String MODID = "quidditchmod";
    
    @SidedProxy(clientSide = "fr.pifpouf.quidditchmod.proxy.ClientProxy", serverSide = "fr.pifpouf.quidditchmod.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    // Items
    public static Item itemBatte;
    public static Item itemSouafle;
    public static Item itemCognard;
    public static Item itemVifDor;
    public static Item itemGant;
    public static Item itemBalais;
    
    // Creative Tabs
    public static CreativeTabs quidditchModCreativeTabs = new QuidditchModCreativeTabs("quidditch_mod_creative_tabs");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        itemBatte = new ItemBatte().setTextureName("quidditchmod:item_batte").setUnlocalizedName("itemBatte").setCreativeTab(QuidditchMod.quidditchModCreativeTabs);
        itemSouafle = new ItemSouafle().setTextureName("quidditchmod:item_souafle").setUnlocalizedName("itemSouafle").setCreativeTab(QuidditchMod.quidditchModCreativeTabs);
        itemCognard = new ItemCognard().setTextureName("quidditchmod:item_cognard").setUnlocalizedName("itemCognard").setCreativeTab(QuidditchMod.quidditchModCreativeTabs);
        itemVifDor = new ItemVifDor().setTextureName("quidditchmod:item_vif_d_or").setUnlocalizedName("itemVifDor").setCreativeTab(QuidditchMod.quidditchModCreativeTabs);
        itemGant = new ItemGant().setTextureName("quidditchmod:item_gant").setUnlocalizedName("itemGant").setCreativeTab(QuidditchMod.quidditchModCreativeTabs);
        itemBalais = new ItemBalais().setTextureName("quidditchmod:item_balais").setUnlocalizedName("itemBalais").setCreativeTab(QuidditchMod.quidditchModCreativeTabs);
        
        GameRegistry.registerItem(itemBatte, "itemBatte");
        GameRegistry.registerItem(itemSouafle, "itemSouafle");
        GameRegistry.registerItem(itemCognard, "itemCognard");
        GameRegistry.registerItem(itemVifDor, "itemVifDor");
        GameRegistry.registerItem(itemGant, "itemGant");
        GameRegistry.registerItem(itemBalais, "itemBalais");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRender();
        
        EntityRegistry.registerGlobalEntityID(EntityBalais.class, "entityBalais", EntityRegistry.findGlobalUniqueEntityId(), new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
        EntityRegistry.registerModEntity(EntityBalais.class, "entityBalais", 420, this.instance, 40, 1, true);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}