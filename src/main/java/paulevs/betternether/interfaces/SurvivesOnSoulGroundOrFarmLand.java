package paulevs.betternether.interfaces;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import paulevs.betternether.registry.NetherBlocks;
import paulevs.betternether.registry.NetherTags;
import ru.bclib.api.tag.CommonBlockTags;
import ru.bclib.interfaces.SurvivesOnTags;

import java.util.List;

public interface SurvivesOnSoulGroundOrFarmLand extends SurvivesOnTags {
    List<TagKey<Block>> TAGS = List.of( CommonBlockTags.SOUL_GROUND, NetherTags.NETHER_FARMLAND);

    @Override
    default List<TagKey<Block>> getSurvivableTags(){
        return TAGS;
    }
}
