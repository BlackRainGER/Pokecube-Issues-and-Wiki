package pokecube.core.database.stats;

import java.util.Map;
import java.util.UUID;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.common.util.FakePlayer;
import pokecube.core.database.Database;
import pokecube.core.database.PokedexEntry;
import pokecube.core.handlers.playerdata.PokecubePlayerStats;
import pokecube.core.handlers.playerdata.advancements.triggers.Triggers;
import pokecube.core.interfaces.IPokemob;
import pokecube.core.items.pokemobeggs.EntityPokemobEgg;
import pokecube.core.network.packets.PacketDataSync;
import thut.core.common.handlers.PlayerDataHandler;

/** @author Thutmose */
public class StatsCollector
{
    public static void addCapture(IPokemob captured)
    {
        String owner;
        if (captured.getOwner() instanceof ServerPlayerEntity && !(captured
                .getOwner() instanceof FakePlayer))
        {
            final ServerPlayerEntity player = (ServerPlayerEntity) captured.getOwner();
            owner = captured.getOwner().getCachedUniqueIdString();
            final PokedexEntry dbe = Database.getEntry(captured);
            final PokecubePlayerStats stats = PlayerDataHandler.getInstance().getPlayerData(owner).getData(
                    PokecubePlayerStats.class);
            stats.addCapture(dbe);
            if (!stats.hasFirst()) stats.setHasFirst(player);
            Triggers.CATCHPOKEMOB.trigger(player, captured);
            PacketDataSync.sendInitPacket(player, stats.getIdentifier());
        }
    }

    public static void addHatched(EntityPokemobEgg hatched)
    {
        String owner;
        IPokemob mob = null;
        if (hatched.getEggOwner() instanceof PlayerEntity && !(hatched.getEggOwner() instanceof FakePlayer))
        {
            owner = hatched.getEggOwner().getCachedUniqueIdString();
            mob = hatched.getPokemob(true);
            if (mob == null)
            {
                new Exception().printStackTrace();
                return;
            }
            final PokedexEntry dbe = Database.getEntry(mob);
            final PokecubePlayerStats stats = PlayerDataHandler.getInstance().getPlayerData(owner).getData(
                    PokecubePlayerStats.class);
            stats.addHatch(dbe);
            Triggers.HATCHPOKEMOB.trigger((ServerPlayerEntity) hatched.getEggOwner(), mob);
            PacketDataSync.sendInitPacket((ServerPlayerEntity) hatched.getEggOwner(), stats.getIdentifier());
        }
    }

    public static void addKill(IPokemob killed, IPokemob killer)
    {
        if (killer == null || killed == null || killer.getOwner() instanceof FakePlayer) return;
        String owner;
        if (killer.getOwner() instanceof PlayerEntity)
        {
            owner = killer.getOwner().getCachedUniqueIdString();
            final PokedexEntry dbe = Database.getEntry(killed);
            final PokecubePlayerStats stats = PlayerDataHandler.getInstance().getPlayerData(owner).getData(
                    PokecubePlayerStats.class);
            stats.addKill(dbe);
            Triggers.KILLPOKEMOB.trigger((ServerPlayerEntity) killer.getOwner(), killed);
            PacketDataSync.sendInitPacket((ServerPlayerEntity) killer.getOwner(), stats.getIdentifier());
        }
    }

    public static int getCaptured(PokedexEntry dbe, PlayerEntity player)
    {
        final Integer n = PlayerDataHandler.getInstance().getPlayerData(player).getData(PokecubePlayerStats.class)
                .getCaptures().get(dbe);
        return n == null ? 0 : n;
    }

    public static Map<PokedexEntry, Integer> getCaptures(UUID uuid)
    {
        return PlayerDataHandler.getInstance().getPlayerData(uuid).getData(PokecubePlayerStats.class).getCaptures();
    }

    public static int getHatched(PokedexEntry dbe, PlayerEntity player)
    {
        final Integer n = PlayerDataHandler.getInstance().getPlayerData(player).getData(PokecubePlayerStats.class)
                .getHatches().get(dbe);
        return n == null ? 0 : n;
    }

    public static Map<PokedexEntry, Integer> getHatches(UUID uuid)
    {
        return PlayerDataHandler.getInstance().getPlayerData(uuid).getData(PokecubePlayerStats.class).getHatches();
    }

    public static int getKilled(PokedexEntry dbe, PlayerEntity player)
    {
        final Integer n = PlayerDataHandler.getInstance().getPlayerData(player).getData(PokecubePlayerStats.class)
                .getKills().get(dbe);
        return n == null ? 0 : n;
    }

    public static Map<PokedexEntry, Integer> getKills(UUID uuid)
    {
        return PlayerDataHandler.getInstance().getPlayerData(uuid).getData(PokecubePlayerStats.class).getKills();
    }

    public StatsCollector()
    {
    }

}
