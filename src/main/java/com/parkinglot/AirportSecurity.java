package com.parkinglot;

//import java.util.Observer;
    public class AirportSecurity implements Observer {

        private boolean isParkingLotFull;

        @Override
        public void update(boolean isParkingLotFull) {
            this.setParkingLotStatus(isParkingLotFull);
        }

        public boolean getParkingLotStatusIfFull() {
            return isParkingLotFull;
        }

        public void setParkingLotStatus(boolean isParkingLotFull) {
            this.isParkingLotFull = isParkingLotFull;
        }
    }

