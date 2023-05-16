package phao.inworlddrying.compat.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;
import phao.inworlddrying.util.Reference;

public abstract class AbstractDryingRecipeCategory<T extends IRecipeWrapper> implements IRecipeCategory<T>
{
	protected static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/gui/drying.png");
	
	protected static final int input1 = 0;
	protected static final int input2 = 1;
	protected static final int fuel = 2;
	protected static final int output = 3;
	
	protected IDrawableAnimated animatedArrow;

	public AbstractDryingRecipeCategory(IGuiHelper helper)
	{
		IDrawableStatic staticArrow = helper.createDrawable(TEXTURES, 176, 14, 24, 17);
		animatedArrow = helper.createAnimatedDrawable(staticArrow, 200, IDrawableAnimated.StartDirection.LEFT, false);
	}
	
}
