package cn.lanink.murdermystery.tasks.game;

import cn.lanink.murdermystery.MurderMystery;
import cn.lanink.murdermystery.room.BaseRoom;
import cn.nukkit.scheduler.PluginTask;

/**
 * 游戏时间计算
 * @author lt_name
 */
public class TimeTask extends PluginTask<MurderMystery> {

    private final BaseRoom room;

    public TimeTask(MurderMystery owner, BaseRoom room) {
        super(owner);
        owner.taskList.add(this.getTaskId());
        this.room = room;
    }

    @Override
    public void onRun(int i) {
        if (this.room.getStatus() != BaseRoom.ROOM_STATUS_GAME) {
            this.cancel();
            return;
        }
        this.room.asyncTimeTask();
    }

    @Override
    public void cancel() {
        while (owner.taskList.contains(this.getTaskId())) {
            owner.taskList.remove(this.getTaskId());
        }
        super.cancel();
    }

}
