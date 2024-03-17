package mmrevilium.theatermod;

import mmrevilium.theatermod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheaterMod implements ModInitializer {
	public static final String MOD_ID = "theatermod";
    public static final Logger LOGGER = LoggerFactory.getLogger("theatermod");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}