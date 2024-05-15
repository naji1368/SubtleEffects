package einstein.ambient_sleep.util;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

@FunctionalInterface
public interface BlockProvider {

    void apply(BlockState state, Level level, BlockPos pos, RandomSource random);
}
