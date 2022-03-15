package ru.netology.radioman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvSource(value = {"0", "1", "2", "3", "4", "5", "6", "7", "8"})
    public void nextStationNormalParams(int currentStation) {
        Radio radio = new Radio();

        int expected = currentStation + 1;
        int actual = radio.nextStation(currentStation);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"1", "2", "3", "4", "5", "6", "7", "8", "9"})
    public void prevStationNormalParams(int currentStation) {
        Radio radio = new Radio();

        int expected = currentStation - 1;
        int actual = radio.prevStation(currentStation);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"})
    public void shouldIncreaseVolumeNormalParams(int currentVolume) {
        Radio radio = new Radio();

        int expected = currentVolume + 1;
        int actual = radio.increaseVolume(currentVolume);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"})
    public void shouldDecreaseVolumeNormalParams(int currentVolume) {
        Radio radio = new Radio();

        int expected = currentVolume - 1;
        int actual = radio.decreaseVolume(currentVolume);

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterLast() {
        Radio radio = new Radio();

        int currentStation = 9;
        int expected = 0;

        int actual = radio.nextStation(currentStation);
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterLeast() {
        Radio radio = new Radio();

        int currentStation = 0;
        int expected = 9;

        int actual = radio.prevStation(currentStation);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfMaxVolume() {
        Radio radio = new Radio();

        int currentVolume = 10;
        int expected = 10;

        int actual = radio.increaseVolume(currentVolume);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfMinVolume() {
        Radio radio = new Radio();

        int currentVolume = 0;
        int expected = 0;

        int actual = radio.decreaseVolume(currentVolume);
        assertEquals(expected, actual);
    }
}