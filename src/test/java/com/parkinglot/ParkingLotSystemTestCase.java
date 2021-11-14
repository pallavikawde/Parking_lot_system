package com.parkinglot;

import org.junit.jupiter.api.*;

public class ParkingLotSystemTestCase {
    ParkingLotSystem parkingLotSystem = null;
    Object vehicle = null;

    @BeforeEach
    public void setUp() {
        vehicle = new Object();
        parkingLotSystem = new ParkingLotSystem(1);
    }

    @BeforeAll
    static void setup() {
        System.out.println("welcome to parking lot system");
    }
    @AfterEach
     void afterEach(){
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
    public void givenVehicle_whenUnParked_shouldReturnTrue() {
        Assertions.assertThrows(Exception.class, () -> parkingLotSystem.unPark(vehicle));
    }

//    @Test
//    public void givenAVehicle_whenAlreadyPark_shouldNotBeAbleToPark_shouldReturnFalse()


    @Test
    void givenWhenParkingLotIsFull_ShouldInformTheOwner() {
       ParkingLotOwner parkingLotOwner =  new ParkingLotOwner();
       parkingLotSystem.registerOwner(parkingLotOwner);
       Assertions.assertThrows(Exception.class, () -> parkingLotSystem.park(vehicle));
       Assertions.assertThrows(Exception.class, () -> parkingLotSystem.park(new Object()));
       boolean checkingCapacity =  parkingLotOwner.isCapacityFull();
       Assertions.assertTrue(checkingCapacity);
    }
}
    




