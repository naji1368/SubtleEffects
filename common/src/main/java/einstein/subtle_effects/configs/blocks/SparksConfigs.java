package einstein.subtle_effects.configs.blocks;

import einstein.subtle_effects.init.ModConfigs;
import me.fzzyhmstrs.fzzy_config.config.ConfigSection;
import me.fzzyhmstrs.fzzy_config.util.EnumTranslatable;
import org.jetbrains.annotations.NotNull;

public class SparksConfigs extends ConfigSection {

    public boolean removeVanillaCampfireSparks = true;
    public boolean candleSparks = true;
    public boolean furnaceSparks = true;
    public boolean fireSparks = true;
    public boolean campfireSparks = true;
    public boolean torchSparks = true;
    public boolean lanternSparks = true;
    public boolean lavaCauldronSparks = true;
    public LavaSparksSpawnType lavaSparks = LavaSparksSpawnType.ON;

    public enum LavaSparksSpawnType implements EnumTranslatable {
        OFF,
        ON,
        NOT_NETHER;

        @NotNull
        @Override
        public String prefix() {
            return ModConfigs.BASE_KEY + "blocks.sparks.lavaSparks";
        }
    }
}