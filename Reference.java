package soulv3.improvements;

public class Reference {
	
	public static final String MOD_ID = "soulimprovement";
	public static final String NAME = "Soul's Improvements";
	public static final String VERSION = "1.0-alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "soulv3.improvements.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "soulv3.improvements.proxy.ServerProxy";
	
	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese"),
		CRACKER("cracker", "ItemCracker");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName= registryName;
			
		}
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum TutorialBlocks{
		CHEESE("cheese", "BlockCheese");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName= registryName;
			
		}
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
