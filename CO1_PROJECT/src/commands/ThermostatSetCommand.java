package commands;

import devices.Thermostat;

public class ThermostatSetCommand implements Command {
    private final Thermostat thermostat;
    private int previousTemperature;
    private final int newTemperature;

    public ThermostatSetCommand(Thermostat thermostat, int newTemperature) {
        this.thermostat = thermostat;
        this.newTemperature = newTemperature;
    }

    @Override
    public void execute() {
        previousTemperature = thermostat.getTemperature();
        thermostat.setTemperature(newTemperature);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(previousTemperature);
    }
}
