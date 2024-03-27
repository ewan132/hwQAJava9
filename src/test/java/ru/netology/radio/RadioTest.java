package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldThisStation() {
        Radio radio = new Radio();

        radio.stationNumber = 5;

        int expected = 5;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.setNextStation(1);

        int expected = 2;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNexZerotStation() {
        Radio radio = new Radio();

        radio.setNextStation(9);

        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevtStation() {
        Radio radio = new Radio();

        radio.setPrevStation(9);

        int expected = 8;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevZerotStation() {
        Radio radio = new Radio();

        radio.setPrevStation(0);

        int expected = 9;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAddingSound() {
        Radio radio = new Radio();

        radio.setAddingSoundVolume(100);

        int expected = 100;
        int actual = radio.volumeSound;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAddingOverMaxSound() {
        Radio radio = new Radio();

        radio.setAddingSoundVolume(80);

        int expected = 81;
        int actual = radio.volumeSound;

        Assertions.assertEquals(expected, actual);

    }



    @Test
    public void shouldAddingZeroOverMaxSound() {
        Radio radio = new Radio();

        radio.setAddingSoundVolume(0);

        int expected = 1;
        int actual = radio.volumeSound;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldReducingTheSoundVolume() {
        Radio radio = new Radio();

        radio.setReductionVolume(100);

        int expected = 99;
        int actual = radio.volumeSound;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReducingOverMinVolume() {
        Radio radio = new Radio();

        radio.setReductionVolume(0);

        int expected = 0;
        int actual = radio.volumeSound;

        Assertions.assertEquals(expected, actual);

    }

}
