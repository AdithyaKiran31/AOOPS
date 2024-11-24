package tests;


import commands.*;
import devices.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmartHomeAutomationTest {

    @Test
    void testLightOnCommand() {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);

        lightOn.execute();
        assertTrue(light.isOn());

        lightOn.undo();
        assertFalse(light.isOn());
    }

    @Test
    void testThermostatSetCommand() {
        Thermostat thermostat = new Thermostat();
        Command setThermostat = new ThermostatSetCommand(thermostat, 25);

        setThermostat.execute();
        assertEquals(25, thermostat.getTemperature());

        setThermostat.undo();
        assertEquals(0, thermostat.getTemperature()); // Default initial temperature assumed 0
    }

    @Test
    void testMacroCommand() {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        Command lightOn = new LightOnCommand(light);
        Command setThermostat = new ThermostatSetCommand(thermostat, 22);

        MacroCommand macro = new MacroCommand(Arrays.asList(lightOn, setThermostat));
        macro.execute();

        assertTrue(light.isOn());
        assertEquals(22, thermostat.getTemperature());

        macro.undo();
        assertFalse(light.isOn());
        assertEquals(0, thermostat.getTemperature());
    }
}
