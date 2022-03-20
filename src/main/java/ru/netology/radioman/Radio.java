package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int firstStation;
    private int amountOfStations = 10;
    private int minVolume;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int amountOfStations) {
        setAmountOfStations(amountOfStations);
        this.amountOfStations = getAmountOfStations();
    }

    public int getAmountOfStations() {
        return amountOfStations;
    }

    public void setAmountOfStations(int amountOfStations) {
        if (amountOfStations < 0) {
            return;
        } else {
            this.amountOfStations = amountOfStations;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public void setCurrentMaxVolume() {
        currentVolume = getMaxVolume();
    }

    public void setCurrentMinVolume() {
        currentVolume = getMinVolume();
    }

    public void setFirstStation() {
        currentStation = firstStation;
    }

    public void setLastStation() {
        currentStation = amountOfStations;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > getMaxVolume()) {
            setCurrentMaxVolume();
        } else if (currentVolume < getMinVolume()) {
            setCurrentMinVolume();
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > getAmountOfStations()) {
            setFirstStation();
        } else if (currentStation < getFirstStation()) {
            setLastStation();
        } else {
            this.currentStation = currentStation;
        }
    }

    public void nextStation() {
        setCurrentStation(currentStation + 1);
    }

    public void prevStation() {
        setCurrentStation(currentStation - 1);
    }

    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        setCurrentVolume(currentVolume - 1);
    }

    public void setFirstStation(int firstStation) {
        this.firstStation = firstStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
}
