package fr.pifpouf.quidditchmod.common;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityBalais extends EntityLiving
{
    public EntityBalais(World world)
    {
        super(world);
    }
    
    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
    }
}
