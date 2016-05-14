package com.sandvoxel.generitech.tileentities.machines;

import com.sandvoxel.generitech.api.registries.PulverizerRegistry;
import com.sandvoxel.generitech.tileentities.TileEntityMachineBase;
import net.minecraft.item.ItemStack;

public class TileEntityPulverizer extends TileEntityMachineBase {

    public TileEntityPulverizer()
    {
        super(3);
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemStack) {
        if(i == 0  && PulverizerRegistry.containsInput(itemStack))
            return true;

        return false;
    }

}