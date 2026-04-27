package com.jju;

public class SmartThermostat extends SmartDevice {
    public SmartThermostat(String name) {
        super(name);
    }

    @Override
    public void activate() {
        System.out.println(getName() + " is now set to 72 degrees.");
    
}
}