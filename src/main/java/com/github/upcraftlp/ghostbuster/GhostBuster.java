package com.github.upcraftlp.ghostbuster;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dimdev.riftloader.listener.InitializationListener;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

@SuppressWarnings("unused")
public class GhostBuster implements InitializationListener {

    private static final Logger log = LogManager.getLogger("GhostBuster");

    @Override
    public void onInitialization() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.ghostbuster.json");
        log.info("If there's something strange in you neighborhood,");
        log.info("who you gonna call? Ghostbusters!");
    }
}
