package com.github.lucky44x.luckyutil.chat.versions;


import com.github.lucky44x.luckyutil.chat.abstraction.NMSChatProvider;
import net.minecraft.server.v1_13_R2.ItemStack;
import net.minecraft.server.v1_13_R2.NBTTagCompound;
import org.bukkit.craftbukkit.v1_13_R2.inventory.CraftItemStack;

public class NMSChatProvider_1_13_R2 extends NMSChatProvider {
    @Override
    protected String convertItemToChatString(org.bukkit.inventory.ItemStack originalItem) {
        ItemStack nmsItem = CraftItemStack.asNMSCopy(originalItem);
        NBTTagCompound compound = new NBTTagCompound();
        compound = nmsItem.b(compound.toString());
        assert compound != null;
        return compound.toString();
    }
}
