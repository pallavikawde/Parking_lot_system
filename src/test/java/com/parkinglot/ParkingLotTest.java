package com.parkinglot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {
    @Test
    public void givenVehicle_whenParked_shouldReturnTrue() {
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        boolean isparked = parkingLotSystem.park(new Object());
        Assertions.assertTrue(isparked);
    }

    @Test
    void givenVehicle_whenUnpark_shouldReturnTrue() {
        Object vehicle = new Object();
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        parkingLotSystem.park(vehicle);
        boolean isunparked = parkingLotSystem.unpark(vehicle);
        Assertions.assertTrue(isunparked);
    }
}



