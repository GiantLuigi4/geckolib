package software.bernie.example.client.model.item;

import net.minecraft.util.ResourceLocation;
import software.bernie.example.item.JackInTheBoxItem;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.AnimatedGeoModel;

public class JackInTheBoxModel extends AnimatedGeoModel<JackInTheBoxItem>
{
	@Override
	public ResourceLocation getModelLocation(JackInTheBoxItem object)
	{
		return new ResourceLocation(GeckoLib.ModID, "geo/jack.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(JackInTheBoxItem object)
	{
		return new ResourceLocation(GeckoLib.ModID, "textures/item/jack.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(JackInTheBoxItem animatable)
	{
		return new ResourceLocation(GeckoLib.ModID, "animations/jackinthebox.animation.json");
	}
}
