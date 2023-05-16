package phao.inworlddrying.compat.jei;

import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import phao.inworlddrying.recipes.DryingRecipes;

public class DryingRecipe implements IRecipeWrapper
{
	private final List<ItemStack> inputs;
	private final ItemStack output;
	
	public DryingRecipe(List<ItemStack> inputs, ItemStack output)
	{
		this.inputs = inputs;
		this.output = output;
	}

	@Override
	public void getIngredients(IIngredients ingredients) 
	{
		ingredients.setInputs(ItemStack.class,  inputs);
		ingredients.setOutput(ItemStack.class, output);
		
	}

	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY)
	{
		DryingRecipes recipes = DryingRecipes.getInstance();
	}
	
	
}
