package Command;

import Command.Command.*;
import Command.RemoteControl.SimpleRemoteControl;

public class Simulator {
    public static void main(String[] args) {
        SimpleRemoteControl remoteOn = new SimpleRemoteControl();
        SimpleRemoteControl remoteOff = new SimpleRemoteControl();

        Light light = new Light("salotto");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remoteOn.setCommand(lightOn);
        remoteOn.buttonWasPressed();

        remoteOff.setCommand(lightOff);
        remoteOff.buttonWasPressed();
    }
}
