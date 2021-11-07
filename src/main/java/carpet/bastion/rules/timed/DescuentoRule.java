package carpet.bastion.rules.timed;

import carpet.bastion.BastionCarpetSettings;
import carpet.bastion.utils.MCTime;
import net.minecraft.network.MessageType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Util;

public class DescuentoRule extends AbstractTimedRule {
    public DescuentoRule(int time, MCTime unit) {
        super(time, unit);
    }

    @Override
    public void execute(MinecraftServer server) {
        if (!BastionCarpetSettings.discountMessage) {
            return;
        }
        server.getPlayerManager().broadcastChatMessage(new LiteralText("20% de descuento con el código abaddon en averroeshosting"), MessageType.CHAT, Util.NIL_UUID);
    }
}
