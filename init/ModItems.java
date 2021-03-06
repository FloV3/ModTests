package soulv3.improvements.init;

import soulv3.improvements.Reference;
import soulv3.improvements.items.ItemCheese;
import soulv3.improvements.items.ItemCracker;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheese;
	public static Item cracker;
	
	public static void init(){
		cheese = new ItemCheese();
		cracker = new ItemCracker();
	}
	
	public static void register(){
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
	}
	
	public static void registerRenders(){
		registerRender(cheese);
		registerRender(cracker);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
