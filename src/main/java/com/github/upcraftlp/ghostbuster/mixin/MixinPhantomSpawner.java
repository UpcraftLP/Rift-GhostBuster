package com.github.upcraftlp.ghostbuster.mixin;

import net.minecraft.world.PhantomSpawner;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = PhantomSpawner.class, priority = 500)
public class MixinPhantomSpawner {

    @Inject(method = "spawnMobs", at = @At("HEAD"), cancellable = true)
    public void onSpawnMobs(CallbackInfoReturnable<Integer> callbackInfo, World world, boolean p_spawnMobs_2_, boolean p_spawnMobs_3_) {
        callbackInfo.setReturnValue(0);
    }

}
