package naturix.divinerpg.bases.dimensions;

import naturix.divinerpg.registry.ModDimensions;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderMod extends WorldProvider {


	@Override
    public DimensionType getDimensionType() {
        return ModDimensions.edenDimension;
    }

    @Override
    public String getSaveFolder() {
        return "eden";
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new ChunkGenerator(world);
    }
}