package com.parkinglot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {
    ParkingLotSystem parkingLotSystem = null;
    Object vehicle = null;

    @BeforeEach
    public void setUp() {
        vehicle = new Object();
        parkingLotSystem = new ParkingLotSystem();
    }

    @Test
    public void givenVehicle_whenParked_shouldReturnTrue() {
        boolean isparked = parkingLotSystem.park(new Object());
        Assertions.assertTrue(isparked);
    }

    @Test
    public void givenVehicle_whenUnpark_shouldReturnTrue() {
        parkingLotSystem.park(vehicle);
        boolean isunparked = parkingLotSystem.unpark(vehicle);
        Assertions.assertTrue(isunparked);
    }

    @Test
    public void givenAvehicle_whenAlreadyPark_shouldNotBeAbleToPark_shouldReturnFalse() {
        parkingLotSystem.park(vehicle);
        boolean isparked = parkingLotSystem.park(new Object());
        Assertions.assertFalse(isparked);
    }
}



