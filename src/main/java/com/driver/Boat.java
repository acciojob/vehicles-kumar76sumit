package com.driver;

public class Boat implements WaterVehicle{
    String name="Titanic";
    int capacity=2000;

    public String getVehicleName()
    {
        return name;
    }
    public int getVehicleCapacity()
    {
        return capacity;
    }
}
