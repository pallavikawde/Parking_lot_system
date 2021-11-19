package com.parkinglot;

public class Owner implements Observer {
    private boolean isParkingLotFull;

    @Override
    public void update(boolean isParkingLotFull) {
        this.setParkingLotStatus(isParkingLotFull);
    }

    public boolean getParkinglotStatusIfFull() {
        return isParkingLotFull;
    }

    public void setParkingLotStatus(boolean isParkingLotFull) {
        this.isParkingLotFull = isParkingLotFull;
    }
}
