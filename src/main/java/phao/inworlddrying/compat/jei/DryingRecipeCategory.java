package phao.inworlddrying.compat.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import net.minecraft.client.Minecraft;
import phao.inworlddrying.util.Reference;

public class DryingRecipeCategory extends AbstractDryingRecipeCategory<DryingRecipe>
{
	private final IDrawable background;
	private final String name;
	
	public DryingRecipeCategory(IGuiHelper helper)
	{
		super(helper);
		background = helper.createDrawable(TEXTURES, 4, 12, 150, 60);
		name = "Drying";
	}
	
	@Override
	public IDrawable getBackground() {
		return background;
	}
	
	@Override
	public void drawExtras(Minecraft minecraft)
	{
		animatedArrow.draw(minecraft, 40, 23);
	}
	
	
	@Override
	public String getTitle() 
	{
		return name;
	}

	@Override
	public String getModName() 
	{
		return Reference.NAME;
	}	
	
	@Override
	public String getUid() 
	{
		return RecipeCategories.DRYING;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, DryingRecipe recipeWrapper, IIngredients ingredients) 
	{
		IGuiItemStackGroup stacks = recipeLayout.getItemStacks();
		stacks.init(input1, true, 21, 2);
		stacks.init(input2, true, 21, 42);
		stacks.init(output, false, 76, 23);
		stacks.set(ingredients);
	}
	
	
}
