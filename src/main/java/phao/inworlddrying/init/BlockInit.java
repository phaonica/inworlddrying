package phao.inworlddrying.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import phao.inworlddrying.objects.blocks.BlockBase;
import phao.inworlddrying.objects.blocks.OBA;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_TUTORIAL = new BlockBase("ore_tutorial", Material.IRON);
	
	public static final Block OBSIDIAN = new OBA("obsidian");
	
	
	
}
