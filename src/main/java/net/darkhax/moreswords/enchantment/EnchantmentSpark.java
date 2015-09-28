package net.darkhax.moreswords.enchantment;

import net.darkhax.moreswords.handler.ConfigurationHandler;
import net.darkhax.moreswords.util.Utils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;

public class EnchantmentSpark extends EnchantmentBase {
    
    protected EnchantmentSpark(int id, int weight, String unlocalizedName, int minLevel, int maxLevel, Item item) {
        
        super(id, weight, unlocalizedName, minLevel, maxLevel, item);
    }
    
    @Override
    public void onEntityDamaged (EntityLivingBase user, Entity target, int level) {
        
        if (isValidUser(user)) {
            
            EntityLiving living = (EntityLiving) target;
            
            for (int i = 0; i < living.worldObj.loadedEntityList.size(); i++)
                if (living.worldObj.loadedEntityList.get(i) != living && living.worldObj.loadedEntityList.get(i) instanceof EntityLiving && Utils.isEntityWithinRange(living, (EntityLiving) living.worldObj.loadedEntityList.get(i), ConfigurationHandler.sparkRange))
                    ((EntityLiving) (EntityLiving) living.worldObj.loadedEntityList.get(i)).setFire(ConfigurationHandler.sparkDamage);
        }
    }
}