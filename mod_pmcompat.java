package net.malrix.mc.pmcompat;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod( modid = "pmcompat", name = "pmcompat", version = "0.0.2" )
@NetworkMod( clientSideRequired = true, serverSideRequired = true, packetHandler = PacketHandler.class )
public class mod_pmcompat {
	@PreInit
	public void PreLoad( FMLPreInitializationEvent event ) {
		
	}
	
	@Init
	public void Load( FMLInitializationEvent event ) {
		GameRegistry.addRecipe( new ItemStack( 15258, 1, 0 ), "  s", "ii ", 's', Item.stick, 'i', Item.ingotIron );
	}
}
