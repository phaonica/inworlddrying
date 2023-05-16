package phao.inworlddrying.compat.jei;

import java.util.IllegalFormatException;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.util.text.translation.I18n;

@JEIPlugin
public class JEICompat implements IModPlugin
{
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry)
	{
		final IJeiHelpers helpers = registry.getJeiHelpers();
		final IGuiHelper gui = helpers.getGuiHelper();
		IRecipeCategory recipeCategories = new DryingRecipeCategory(gui);
		registry.addRecipeCategories(recipeCategories);
	}
	
	@Override
	public void register(IModRegistry registry) 
	{
		final IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		final IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		IRecipeTransferRegistry recipeTransfer = registry.getRecipeTransferRegistry();
		
		registry.addRecipes(DryingRecipeMaker.getRecipes(jeiHelpers), RecipeCategories.DRYING);
		//registry.addRecipeClickArea(Gui, xPos, yPos, width, height, recipeCategoryUids);
		//recipeTransfer.addRecipeTransferHandler(recipeTransferInfo);
	}
	
	public static String translateToLocal(String key)
	{
		if(I18n.canTranslate(key)) return I18n.translateToLocal(key);
		else return I18n.translateToFallback(key);
	}
	
	public static String translateToLocalFormatted(String key, Object... format)
	{
		String s = translateToLocal(key);
		try
		{
			return String.format(s, format);
		}
		catch(IllegalFormatException e)
		{
			return "Format error: " + s;
		}
	}
}
