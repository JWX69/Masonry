package jwx.masonry.core;

import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("masonry")
public class Masonry
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "masonry";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public Masonry() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRY_HELPER.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

}
