package soulv3.improvements.proxy;

import soulv3.improvements.init.ModBlocks;
import soulv3.improvements.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
