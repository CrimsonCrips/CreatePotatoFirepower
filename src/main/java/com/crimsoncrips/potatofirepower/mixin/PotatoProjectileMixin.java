package com.crimsoncrips.potatofirepower.mixin;

import com.simibubi.create.content.equipment.potatoCannon.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(PotatoCannonProjectileType.class)
public class PotatoProjectileMixin {


    @Inject(method = "getReloadTicks", at = @At("HEAD"), cancellable = true,remap = false)
    private void injected(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(doSomething4());
    }


    private int doSomething4() {
        int reload = 0;
            return reload;
    }
}

