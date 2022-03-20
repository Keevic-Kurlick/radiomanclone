package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setFirstStation() {
        currentStation = 0;
    }

    public void setLastStation() {
        currentStation = 9;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            setMaxVolume();
        } else if (currentVolume < 0) {
            setMinVolume();
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            setFirstStation();
        } else if (currentStation < 0) {
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
}
