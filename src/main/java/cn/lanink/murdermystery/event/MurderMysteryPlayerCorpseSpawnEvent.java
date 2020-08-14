package cn.lanink.murdermystery.event;

import cn.lanink.murdermystery.room.BaseRoom;
import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;

public class MurderMysteryPlayerCorpseSpawnEvent extends MurderMysteryRoomPlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

    public MurderMysteryPlayerCorpseSpawnEvent(BaseRoom room, Player player) {
        this.room = room;
        this.player = player;
    }

}
