package phao.inworlddrying.compat.crafttweaker;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import phao.inworlddrying.recipes.DryingRecipes;
import phao.inworlddrying.recipes.RecipeHelper;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;


// REFERENCES:
// https://darkhax.net/2018/10/tutorial-crafttweaker
// https://github.com/BlakeBr0/MysticalAgriculture/blob/1.19.4/src/main/java/com/blakebr0/mysticalagriculture/compat/crafttweaker/AwakeningCrafting.java
// https://github.com/Mrthomas20121-Mods/tfctweaker/blob/master/src/main/java/mrthomas20121/tfctweaker/crafttweaker/Fluids.java

@ZenRegister
@ZenClass("mods.inworlddrying.Drying")
public class Drying {

	@ZenMethod
    public static void addRecipe(String id, IItemStack output, IItemStack  input1, IItemStack  input2) {
        CraftTweakerAPI.apply(new IAction() {
            @Override
            public void apply() {

            	
            	
            	
            DryingRecipes.getInstance().addDryingRecipe((ItemStack)input1.getInternal(), (ItemStack)input2.getInternal(), (ItemStack)output.getInternal());

                
            }

            @Override
            public String describe() {
                return "Adding Infusion Crafting recipe for " + output.toString();
            }
        });
    }


	
}
