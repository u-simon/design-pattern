package com.simon.pattern.command;

/**
 * @author simon
 * @date 2020/11/22 10:06
 */
public class LightOffCommand implements Command {

    private LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
