
import commands.*;
import devices.*;
import controllers.RemoteControl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command setThermostat = new ThermostatSetCommand(thermostat, 22);

        RemoteControl remote = new RemoteControl();

        // Individual commands
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(setThermostat);
        remote.pressButton();
        remote.pressUndo();

        // Macro Command
        MacroCommand morningRoutine = new MacroCommand(Arrays.asList(lightOn, setThermostat));
        remote.setCommand(morningRoutine);
        remote.pressButton();
        remote.pressUndo();
    }
}
