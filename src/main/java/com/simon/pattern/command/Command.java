package com.simon.pattern.command;

/**
 * @author simon
 * @date 2020/11/22 10:04
 */
public interface Command {

    public void execute();

    public void undo();
}
