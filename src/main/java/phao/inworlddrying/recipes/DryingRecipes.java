package phao.inworlddrying.recipes;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class DryingRecipes {

	private static final DryingRecipes INSTANCE = new DryingRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	//private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	
	public DryingRecipes()
	{
		// where you will input a recipe
		addDryingRecipe(new ItemStack(Blocks.BEDROCK), new ItemStack(Blocks.GOLD_BLOCK), new ItemStack(Blocks.EMERALD_BLOCK));
		addDryingRecipe(new ItemStack(Blocks.ANVIL), new ItemStack(Blocks.BEETROOTS), new ItemStack(Blocks.CAKE));
		addDryingRecipe(new ItemStack(Blocks.TNT), new ItemStack(Blocks.TRAPDOOR), new ItemStack(Blocks.CLAY));
		addDryingRecipe(new ItemStack(Blocks.REDSTONE_TORCH), new ItemStack(Blocks.SOUL_SAND), new ItemStack(Blocks.COBBLESTONE));
		addDryingRecipe(new ItemStack(Blocks.QUARTZ_STAIRS), new ItemStack(Blocks.SANDSTONE), new ItemStack(Blocks.END_BRICKS));
		addDryingRecipe(new ItemStack(Blocks.MELON_BLOCK), new ItemStack(Blocks.REDSTONE_ORE), new ItemStack(Blocks.FURNACE));
	}
	
	public static DryingRecipes getInstance()
	{
		return INSTANCE;
	}
	
	public void addDryingRecipe(ItemStack input1, ItemStack input2, ItemStack result)
	{
		if(getDryingResult(input1, input2) != ItemStack.EMPTY) return; 
		this.smeltingList.put(input1, input2, result);
		//this.experienceList.put(result,  Float.valueOf(experience));
	}
	
	public ItemStack getDryingResult(ItemStack input1, ItemStack input2)
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet())
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
				{
					if(this.compareItemStacks(input2,  (ItemStack)ent.getKey()))
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}

	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) 
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
	{
		return this.smeltingList;
	}	
}
