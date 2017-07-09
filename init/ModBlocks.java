package soulv3.improvements.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import soulv3.improvements.blocks.BlockCheese;
import soulv3.improvements.items.ItemCheese;
import soulv3.improvements.items.ItemCracker;

public class ModBlocks {
	
	public static Block cheese;

	public static void init(){
		cheese = new BlockCheese();
	}
	
	public static void register(){
		registerBlock(cheese);
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders(){
		registerRender(cheese);
	}
	
	private static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
