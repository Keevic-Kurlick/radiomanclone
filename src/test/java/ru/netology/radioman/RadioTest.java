package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private int maxVolume = 100;
    private int amountOfStaions = 10;
    private int lastStation = amountOfStaions - 1;
    private Radio radio = new Radio(amountOfStaions);

    @Test
    public void shouldSetStationsLessMin() {
        Radio radio = new Radio(-1);

        int expected = 10;
        int actual = radio.getAmountOfStations();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsMin() {
        Radio radio = new Radio(0);

        int expected = 0;
        int actual = radio.getAmountOfStations();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsNormal() {
        Radio radio = new Radio(1);

        int expected = 1;
        int actual = radio.getAmountOfStations();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfUnderMin() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfMin() {
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfMax() {
        radio.setCurrentVolume(maxVolume);

        int expected = maxVolume;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfAboveMax() {
        radio.setCurrentVolume(maxVolume + 1);

        int expected = maxVolume;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfNormalParam() {
        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfUnderZero() {
        radio.setCurrentStation(-1);

        int expected = lastStation;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfAboveMax() {
        radio.setCurrentStation(amountOfStaions + 1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfMin() {
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfMax() {
        radio.setCurrentStation(lastStation);

        int expected = lastStation;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfNormalParam() {
        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationCurrentBelowMin() {
        radio.setCurrentStation(-1);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationCurrentMax() {
        radio.setCurrentStation(lastStation);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationCurrentAboveMax() {
        radio.setCurrentStation(amountOfStaions + 1);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationCurrentBelowMin() {
        radio.setCurrentStation(-1);
        radio.prevStation();

        int expected = lastStation - 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = lastStation;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterPreMin() {
        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfMaxVolume() {
        radio.setCurrentVolume(maxVolume);
        radio.increaseVolume();

        int expected = maxVolume;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfAboveMaxVolume() {
        radio.setCurrentVolume(maxVolume + 1);
        radio.increaseVolume();

        int expected = maxVolume;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}