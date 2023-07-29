package net.lenny.mccourse;

import net.fabricmc.api.ModInitializer;
import net.lenny.mccourse.block.ModBlocks;
import net.lenny.mccourse.item.ModItemGroup;
import net.lenny.mccourse.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}