package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetVolumeIfUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeIfMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfNormalParam() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfUnderZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationIfMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationIfNormalParam() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationCurrentBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationCurrentMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationCurrentAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void prevStationCurrentBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void prevStationAfterPreMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfAboveMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}