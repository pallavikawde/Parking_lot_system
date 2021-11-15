package com.parkinglot;

import org.junit.jupiter.api.*;

public class ParkingLotSystemTest {
    ParkingLotSystem parkingLotSystem = null;
    Vehicle vehicle = null;
    ParkingLotSystemOwner owner = null;
    AirportSecurity airportSecurity = null;
    ParkingLotAttendant attendant = null;

    @BeforeEach
    void setUp() {
        parkingLotSystem = new ParkingLotSystem(3);
        owner = new ParkingLotSystemOwner();
        airportSecurity = new AirportSecurity();
        attendant = new ParkingLotAttendant();
    }
    @BeforeAll
     static void beforeAll(){
        System.out.println("****************** welcome to parking lot system *******************************");
    }
    @AfterEach
    void afterEach(){
        System.out.println("cleaning up.............");
    }
    @AfterAll
     static void afterAll(){
        System.out.println("********************** End of programme ******************************");
    }

    @Test
    @Disabled
    void givenMessage_ShouldPrintWelcomeMessage() {
        parkingLotSystem.printWelcomeMessage();
    }
//uc1
    @Test
    void givenAVehicle_WhenParked_ShouldReturnTrue() throws ParkingLotSystemException {
        vehicle = new Vehicle("PORSCHE", "WB-10KL2356", "6:30");
        parkingLotSystem.park(vehicle);
        boolean isParked = parkingLotSystem.isVehicleParked(vehicle);
        Assertions.assertTrue(isParked);
    }

    @Test
    void givenAVehicle_WhenAlreadyParkedAndCheckIfUnpark_ShouldReturnFalse() throws ParkingLotSystemException {
        vehicle = new Vehicle("TOYOTA", "WB-KL4789", "10:30");
        parkingLotSystem.park(vehicle);
        boolean isUnParked = parkingLotSystem.isVehicleUnParked(vehicle);
        Assertions.assertFalse(isUnParked);
    }

//    @Test
//    void givenAVehicle_WhenParkedAnotherVehicle_ShouldReturnFalse() {
//        Vehicle vehicle1 = new Vehicle("HYUNDAI", "WB-P98754", "9:30");
//        Vehicle vehicle2 = new Vehicle("FORD", "IN-658941", "7:00");
//        try {
//            parkingLotSystem.park(vehicle1);
//            parkingLotSystem.park(vehicle2);
//        } catch (ParkingLotSystemException exception) {
//            Assertions.assertEquals(ParkingLotSystemException.ExceptionType.PARKING_LOT_IS_FULL,
//                    exception.exceptionType);
//        }
//    }
//uc2
    @Test
    void givenANullVehicle_WhenUnParked_ShouldThrowException() {
        Assertions.assertThrows(ParkingLotSystemException.class, () -> parkingLotSystem.unPark(vehicle));
    }
//uc3
    @Test
    void givenAVehicle_WhenCheckingIfParkingLotIsFull_ShouldReturnFalse() throws ParkingLotSystemException {
        vehicle = new Vehicle("HYUNDAI", "WB-P98754", "11:00");
        parkingLotSystem.park(vehicle);
        boolean checkingIfFull = parkingLotSystem.isParkingLotFull();
        Assertions.assertFalse(checkingIfFull);
    }
//uc4
    @Test
    void givenAVehicle_WhenParkingLotIsFull_ShouldRedirectToAirportSecurityStaff() {
        vehicle = new Vehicle("ROLLS ROYCE", "WB-KL2695", "14:45");
        try {
            parkingLotSystem.park(vehicle);
        } catch (ParkingLotSystemException exception) {
            if (parkingLotSystem.isParkingLotFull())
                Assertions.assertEquals(ParkingLotSystemException.ExceptionType.PARKING_LOT_IS_FULL,
                        exception.exceptionType);
        }
    }

    @Test
    void givenVehicles_WhenParkingLotIsFull_ShouldInformTheOwner() {
        parkingLotSystem.addObserver(owner);
        Vehicle vehicle1 = new Vehicle("AUDI", "WB-L98754", "7:50");
        Vehicle vehicle2 = new Vehicle("TOYOTA", "IN-65821", "12:30");
        Vehicle vehicle3 = new Vehicle("ASTON MARTIN", "UK-0096", "15:30");
        Vehicle vehicle4 = new Vehicle("VOLKSWAGEN", "JPN-1587", "11:00");
        try {
            parkingLotSystem.park(vehicle1);
            parkingLotSystem.park(vehicle2);
            parkingLotSystem.park(vehicle3);
            parkingLotSystem.park(vehicle4);
            boolean capacityFull = owner.getParkingLotStatusIfCapacityFull();
            Assertions.assertTrue(capacityFull);
        } catch (ParkingLotSystemException exception) {
            Assertions.assertEquals(ParkingLotSystemException.ExceptionType.PARKING_LOT_IS_FULL,
                    exception.exceptionType);
        }
    }
//uc4
    @Test
    void givenVehicles_WhenParkingLotIsFull_ShouldInformTheAirportSecurity() {
        parkingLotSystem.addObserver(airportSecurity);
        Vehicle vehicle1 = new Vehicle("BUGATTI", "WB-K96523", "17:40");
        Vehicle vehicle2 = new Vehicle("LEXUS", "IN-49821", "9:45");
        Vehicle vehicle3 = new Vehicle("FIAT", "UK-1159", "15:46");
        Vehicle vehicle4 = new Vehicle("MITSUBISHI", "JPN-2689", "19:30");
        try {
            parkingLotSystem.park(vehicle1);
            parkingLotSystem.park(vehicle2);
            parkingLotSystem.park(vehicle3);
            parkingLotSystem.park(vehicle4);
            boolean capacityFull = owner.getParkingLotStatusIfCapacityFull();
            Assertions.assertTrue(capacityFull);
        } catch (ParkingLotSystemException exception) {
            Assertions.assertEquals(ParkingLotSystemException.ExceptionType.PARKING_LOT_IS_FULL,
                    exception.exceptionType);
        }
    }
//uc5
    @Test
    void givenVehicles_WhenParkingLotHasSpaceAgain_ShouldInformTheOwner() throws ParkingLotSystemException {
        parkingLotSystem.addObserver(owner);
        Vehicle vehicle1 = new Vehicle("FORD", "IN-MH2546", "6:30");
        Vehicle vehicle2 = new Vehicle("CHEVROLET", "IN-MP0023", "9:30");
        Vehicle vehicle3 = new Vehicle("TATA MOTORS", "WB-2698", "11:30");
        parkingLotSystem.park(vehicle1);
        parkingLotSystem.park(vehicle2);
        parkingLotSystem.park(vehicle3);
        Assertions.assertTrue(parkingLotSystem.isParkingLotFull());
        Assertions.assertThrows(ParkingLotSystemException.class, () -> parkingLotSystem.unPark(vehicle3));
        Assertions.assertFalse(owner.getParkingLotStatusIfCapacityFull());
    }
//uc6
    @Test
    void givenAVehicleToAttendant_WhenParked_ThenCheckIfParked_ShouldReturnTrue() throws ParkingLotSystemException {
        Vehicle vehicle = new Vehicle("FORD", "IN-MH2546", "15:20");
        attendant.parkedByAttendant(vehicle);
        Assertions.assertTrue(parkingLotSystem.isVehicleParked(vehicle));
    }
//uc7
    @Test
    void givenAVehicle_WhenParked_ThenCheckForPosition_ShouldReturnPosition() throws ParkingLotSystemException {
        Vehicle vehicle1 = new Vehicle("CHEVROLET", "IN-MP0023", "11:00");
        Vehicle vehicle2 = new Vehicle("AUDI", "IN-KL003", "9:00");
        parkingLotSystem.park(vehicle1);
        parkingLotSystem.park(vehicle2);
        int vehiclePositionForVehicle1 = parkingLotSystem.getVehiclePosition(vehicle1);
        int vehiclePositionForVehicle2 = parkingLotSystem.getVehiclePosition(vehicle2);
        Assertions.assertEquals(0, vehiclePositionForVehicle1);
        Assertions.assertEquals(1, vehiclePositionForVehicle2);
    }
////uc8
//    @Test
//    void givenAVehicle_WhenParked_ThenCheckTimeOfParking_ShouldReturnParkingTime() throws ParkingLotSystemException {
//        Vehicle vehicle = new Vehicle("TOYOTA", "KL-MH25698", "11:00");
//        parkingLotSystem.park(vehicle);
//        String vehicleParkingTime = parkingLotSystem.getVehicleParkingTime(vehicle);
//        Assertions.assertEquals("11:00", vehicleParkingTime);
//    }
//}


