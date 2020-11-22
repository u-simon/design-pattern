package com.simon.pattern.command;

/**
 * @author simon
 * @date 2020/11/22 10:05
 */
public class LightOnCommand implements Command {

    private LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
