package com.zzx.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Staff
 * @Description
 * @Author zhangzx
 * @Date 2019/5/7 17:43
 * Version 1.0
 **/
public class Staff {
    private List<Command> commandList = new ArrayList<Command>();
    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

}
