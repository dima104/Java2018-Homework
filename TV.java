package lv.javaguru.demo.java;

import java.util.Objects;

public class TV {
    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private int screenSize;
    private boolean turnedOn;

    public TV() {
    }

    public TV(boolean turnedOn, int currentChannel) {
        this.turnedOn = turnedOn;
        this.currentChannel = currentChannel;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void turnOn() {
        turnedOn = true;
    }

    public void turnOff() {
        turnedOn = false;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void nextChannel() {
        if (isTurnedOn()) {
            currentChannel++;
        }
    }

    public void previousChannel() {
        if (isTurnedOn()) {
            currentChannel--;
        }
    }

    public void increaseVolumeLevel() {
        if (isTurnedOn()) {
            currentVolumeLevel++;
        }
    }

    public void decreaseVolumeLevel() {
        if (isTurnedOn()) {
            currentVolumeLevel--;
        }
    }

    public void setManufacturer() {
        this.manufacturer = manufacturer;
    }

    public void setScreenSize() {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return
                "Current Channel: " + currentChannel +
                        ", turnedOn: " + turnedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVolumeLevel == tv.currentVolumeLevel &&
                screenSize == tv.screenSize &&
                turnedOn == tv.turnedOn &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolumeLevel, manufacturer, screenSize, turnedOn);
    }
}
