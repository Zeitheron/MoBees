package com.noodlepfp.mobees.genetics.effect;

import forestry.api.apiculture.IBeeHousing;
import forestry.api.genetics.*;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class LibrarianEffect
		extends ThrottledBeeEffect
{
	public LibrarianEffect()
	{
		super(false, 6000, true, true);
	}
	
	@Override
	public IEffectData doEffectThrottled(IGenome genome, IEffectData storedData, IBeeHousing housing)
	{
		Level level = housing.getWorldObj();
		Vec3i area = new Vec3i(6, 1, 6);
		
		return storedData;
	}
	
	private static ItemStack generateEnchantedBook(Level world)
	{
		if(world.random.nextInt(3) < 2)
		{ // 75% chance of regular book
			return new ItemStack(Items.BOOK);
		}
		
		List<Enchantment> allEnchantments = ForgeRegistries.ENCHANTMENTS.getValues().stream().toList();
		
		List<Enchantment> regularEnchantments = allEnchantments
				.stream()
				.filter(enchantment -> !enchantment.isTreasureOnly()) // Exclude treasure enchantments
				.toList();
		
		List<Enchantment> treasureEnchantments = allEnchantments
				.stream()
				.filter(Enchantment::isTreasureOnly) // Only treasure enchantments
				.toList();
		
		// 80% chance of non-treasure enchantment
		int bookType = world.random.nextInt(100);
		Enchantment randomEnchantment;
		if(bookType < 10)
		{
			return generateBeeBook();
		} else if(bookType < 21)
		{
			randomEnchantment = treasureEnchantments.get(world.random.nextInt(treasureEnchantments.size()));
		} else
		{
			randomEnchantment = regularEnchantments.get(world.random.nextInt(regularEnchantments.size()));
		}
		
		// Ensure the enchantment is valid
		if(randomEnchantment == null)
		{
			return new ItemStack(Items.BOOK); // Fallback to a regular book if no enchantments exist
		}
		
		// Determine a random valid level within the enchantment's range
		int level = world.random.nextInt(randomEnchantment.getMaxLevel() - randomEnchantment.getMinLevel() + 1) + randomEnchantment.getMinLevel();
		
		// Create the enchanted book and apply the enchantment
		ItemStack enchantedBook = new ItemStack(Items.ENCHANTED_BOOK);
		EnchantmentHelper.setEnchantments(
				java.util.Map.of(randomEnchantment, level),
				enchantedBook
		);
		
		return enchantedBook;
	}
	
	private static ItemStack generateBeeBook()
	{
		ItemStack book = new ItemStack(Items.WRITTEN_BOOK);
		CompoundTag tag = new CompoundTag();
		
		tag.putString("title", "Mysterious Book");
		tag.putString("author", "Bee");
		tag.putInt("generation", 0); // 0 = original, 1 = copy, etc.
		
		ListTag pages = new ListTag();
		pages.add(StringTag.valueOf(Component.Serializer.toJson(Component.literal("bzzz bzz bzz..."))));
		pages.add(StringTag.valueOf(Component.Serializer.toJson(Component.literal("bzzzzzZZZzz!..."))));
		pages.add(StringTag.valueOf(Component.Serializer.toJson(Component.literal(""))));
		pages.add(StringTag.valueOf(Component.Serializer.toJson(Component.literal("bz!"))));
		
		tag.put("pages", pages);
		book.setTag(tag);
		
		return book;
	}
}
