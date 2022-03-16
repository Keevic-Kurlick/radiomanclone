package ru.netology.radioman;

public class Radio {
    private int amountOfStations = 10;

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
    }

    public Radio() {

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
        if (currentVolume < 100) {
            currentVolume++;
        }

        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume--;
        }

        return currentVolume;
    }
}
