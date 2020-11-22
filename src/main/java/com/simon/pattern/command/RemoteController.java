package com.simon.pattern.command;

/**
 * @author simon
 * @date 2020/11/22 10:07
 */
public class RemoteController {

    private Command[] commands;

    private Command undoCommand;

    public RemoteController(int n) {
        commands = new Command[n];
        for (int i = 0; i < n; i++) {
            commands[i] = new NoCommand();
        }
    }

    public void setCommands(int no, Command command) {
        commands[no] = command;
    }

    public void executeCommand(int no) {
        commands[no].execute();
        undoCommand = commands[no];
    }

    public void undoCommand() {
        undoCommand.undo();
    }
}
