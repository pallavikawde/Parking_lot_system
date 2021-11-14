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
     void setup() {
        System.out.println("welcome to parking lot system");
    }
    @AfterEach
     void afterEach(){
        System.out.println("cleaning up........");
    }

    @AfterAll
     void afterAll() {
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
       Assertions.assertThrows(Exception.class, () -> {
           parkingLotSystem.park(vehicle);
           parkingLotSystem.park(new Object());
       });
       boolean checkingCapacity =  parkingLotOwner.isCapacityFull();
       Assertions.assertTrue(checkingCapacity);
    }

    @Test
    void givenCapacityIs2_shouldBeAbleToPark2Vehicles() {
        Object vehicle2 = new Object();
        parkingLotSystem.setCapacity(2);
        Assertions.assertThrows(Exception.class, () -> {
            parkingLotSystem.park(vehicle);
            parkingLotSystem.park(vehicle2);
        });
        boolean isParked1 = parkingLotSystem.isVehicleparked(vehicle);
        boolean isParked2 = parkingLotSystem.isVehicleparked(vehicle2);
        Assertions.assertTrue(isParked1 && isParked2);
    }
}
    




