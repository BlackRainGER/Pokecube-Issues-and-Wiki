package pokecube.nbtedit.packets;

import org.apache.logging.log4j.Level;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import pokecube.nbtedit.NBTEdit;
import thut.core.common.network.Packet;

public class CustomRequestPacket extends Packet
{
    /** The id of the entity being requested. */
    private int    entityID;
    /** the custom data type being requested */
    private String customName;

    /** Required default constructor. */
    public CustomRequestPacket()
    {
    }

    public CustomRequestPacket(int entityID, String customName)
    {
        this.entityID = entityID;
        this.customName = customName;
    }

    public CustomRequestPacket(PacketBuffer buf)
    {
        this.entityID = buf.readInt();
        this.customName = new PacketBuffer(buf).readString(30);
    }

    @Override
    public void handleServer(ServerPlayerEntity player)
    {
        NBTEdit.log(Level.TRACE, player.getName() + " requested entity with Id #" + this.entityID);
        PacketHandler.sendCustomTag(player, this.entityID, this.customName);
    }

    @Override
    public void write(PacketBuffer buf)
    {
        buf.writeInt(this.entityID);
        new PacketBuffer(buf).writeString(this.customName);
    }
}
