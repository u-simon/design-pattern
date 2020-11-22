package com.simon.pattern.command;

/**
 * @author simon
 * @date 2020/11/22 10:36
 */
public class Main {

    public static void main(String[] args) {
        LightReceiver receiver = new LightReceiver();

        LightOnCommand onCommand = new LightOnCommand(receiver);
        LightOffCommand offCommand = new LightOffCommand(receiver);

        RemoteController controller = new RemoteController(5);

        controller.setCommands(0, onCommand);
        controller.setCommands(1, offCommand);
        System.out.println("执行电灯打开命令");
        controller.executeCommand(0);

        System.out.println("执行电灯关闭命令");
        controller.executeCommand(1);

        System.out.println("撤销执行的命令");
        controller.undoCommand();
    }
}
