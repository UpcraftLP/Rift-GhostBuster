package com.github.upcraftlp.ghostbuster;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dimdev.rift.listener.MinecraftStartListener;

@SuppressWarnings("unused")
public class GhostBuster implements MinecraftStartListener {

    private static final Logger log = LogManager.getLogger("GhostBuster");

    @Override
    public void onMinecraftStart() {
        log.info("If there's something strange in you neighborhood,");
        log.info("who you gonna call? Ghostbusters!");
    }
}
