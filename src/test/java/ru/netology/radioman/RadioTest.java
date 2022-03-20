package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private int maxVolume = 100;
    private int maxStations = 10;
    private Radio radio = new Radio(maxStations);

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

        int expected = maxStations;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfAboveMax() {
        radio.setCurrentStation(maxStations + 1);

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
        radio.setCurrentStation(maxStations);

        int expected = maxStations;
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
        radio.setCurrentStation(maxStations);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationCurrentAboveMax() {
        radio.setCurrentStation(maxStations + 1);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationCurrentBelowMin() {
        radio.setCurrentStation(-1);
        radio.prevStation();

        int expected = maxStations - 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = maxStations;
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