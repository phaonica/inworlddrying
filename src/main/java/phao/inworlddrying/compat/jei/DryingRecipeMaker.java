package phao.inworlddrying.compat.jei;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Lists;
import com.google.common.collect.Table;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;
import phao.inworlddrying.recipes.DryingRecipes;

public class DryingRecipeMaker 
{
	public static List<DryingRecipe> getRecipes(IJeiHelpers helpers)
	{
		IStackHelper stackHelper = helpers.getStackHelper();
		DryingRecipes instance = DryingRecipes.getInstance();
		Table<ItemStack, ItemStack, ItemStack> recipes = instance.getDualSmeltingList();
		List<DryingRecipe> jeiRecipes = Lists.newArrayList();
		
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : recipes.columnMap().entrySet())
		{
			for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
			{
				ItemStack input1 = entry.getKey();
				ItemStack input2 = ent.getKey();
				ItemStack output = ent.getValue();
				List<ItemStack> inputs = Lists.newArrayList(input1, input2);
				DryingRecipe recipe = new DryingRecipe(inputs, output);
				jeiRecipes.add(recipe);
			}
		}
		return jeiRecipes;
		
	}
}
