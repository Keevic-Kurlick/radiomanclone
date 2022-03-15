package ru.netology.radioman;

public class Radio {

    public int nextStation(int currentStation) {
        if (currentStation < 9 && currentStation >= 0) {
            currentStation++;
        } else {
            currentStation = 0;
        }

        return currentStation;
    }

    public int prevStation(int currentStation) {
        if (currentStation > 0 && currentStation < 10) {
            currentStation--;
        } else {
            currentStation = 9;
        }

        return currentStation;
    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
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
