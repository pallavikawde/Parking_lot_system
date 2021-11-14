package com.parkinglot;

import org.junit.jupiter.api.*;

public class ParkingLotSystemTestCase {
    ParkingLotSystem parkingLotSystem = null;
    Object vehicle = null;

    @BeforeEach
    public void setUp() {
        vehicle = new Object();
        parkingLotSystem = new ParkingLotSystem();
    }

    @BeforeAll
    static void setup() {
        System.out.println("welcome to parking lot system");
    }
    @AfterEach
    static void afterEach(){
        System.out.println("cleaning up........");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("######## end of programme############");
    }

    @Test
    public void givenVehicle_whenParked_shouldReturnTrue() {
        Assertions.assertThrows(Exception.class, () -> parkingLotSystem.park(vehicle));
    }

    @Test
    public void givenVehicle_whenUnparked_shouldReturnTrue() {
        Assertions.assertThrows(Exception.class, () -> parkingLotSystem.unPark(vehicle));
    }

    @Test
    public void givenAVehicle_whenAlreadyPark_shouldNotBeAbleToPark_shouldReturnFalse() {
        Assertions.assertThrows(Exception.class, () -> parkingLotSystem.isVehicleparked(vehicle));
    }
}

//    @Test
//    void givenWhenPrakingLotIsFull_ShoulInformTheOwner() {
//    }
//}
    




