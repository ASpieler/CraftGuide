package uristqwerty.CraftGuide.WIP_API_DoNotUse;

import net.minecraft.item.ItemStack;

public interface IItemFilter
{
	public boolean matches(Object item);

	public ItemStack getDisplayStack();
	public Object getItem();
}
