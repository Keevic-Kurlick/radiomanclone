package ru.netology.radioman;

public class Radio {
    private int amountOfStations = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
    }

    public Radio() {
    }

    public int getAmountOfStations() {
        return amountOfStations;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setAmountOfStations(int amountOfStations) {
        if (amountOfStations >= 0) {
            this.amountOfStations = amountOfStations;
        }
    }

    public void setMinVolume(int minVolume) {
        if (minVolume >= 0) {
            this.minVolume = minVolume;
        }
    }

    public void setMaxVolume(int maxVolume) {
        if (maxVolume >= 0) {
            this.maxVolume = maxVolume;
        }
    }

    public int nextStation(int currentStation) {
        if (currentStation < (amountOfStations - 1) && currentStation >= 0) {
            currentStation++;
        } else {
            currentStation = 0;
        }

        return currentStation;
    }

    public int prevStation(int currentStation) {
        if (currentStation > 0 && currentStation < amountOfStations) {
            currentStation--;
        } else {
            currentStation = 9;
        }

        return currentStation;
    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }

        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            currentVolume--;
        }

        return currentVolume;
    }
}
