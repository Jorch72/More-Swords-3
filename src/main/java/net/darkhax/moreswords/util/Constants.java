package net.darkhax.moreswords.util;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {
    
    public static final String MOD_ID = "MSM3";
    public static final String MOD_NAME = "More Swords 3";
    public static final String VERSION_NUMBER = "3.0.1";
    public static final String CLIENT_PROXY_CLASS = "net.darkhax.moreswords.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.darkhax.moreswords.proxy.CommonProxy";
    public static final String TEXTURE_DOMAIN = "moreswords:";
    public static final String FACTORY = "net.darkhax.moreswords.gui.MoreSwordsGuiFactory";
    public static final Random RANDOM = new Random();
    public static final Logger LOGGER = LogManager.getLogger("MoreSwords");
}
