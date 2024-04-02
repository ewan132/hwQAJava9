package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void minFirstStationMustMine() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void zerotStationMustMine() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void firstStationMustMine() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void eighttStationMustMine() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nineStationMustMine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void tenStationMustMine() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNexZerotStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setNextStation();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNexNinetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.setNextStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNexFirsttStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setNextStation();

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevtStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setPrevStation();

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevZerotStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minusOneVolumeSound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        ;

        int expected = 0;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void zeroVolumeSound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        ;

        int expected = 0;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void oneVolumeSound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        ;

        int expected = 1;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ninetyNineVolumeSound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        ;

        int expected = 99;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void hundredVolumeSound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        ;

        int expected = 100;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void overHundredVolumeSound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        ;

        int expected = 0;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldAddingSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(80);

        radio.setAddingSoundVolume();

        int expected = 81;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreHundredAddingSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.setAddingSoundVolume();

        int expected = 100;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReductionVolumeSound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(81);

        radio.setReductionVolume();

        int expected = 80;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReductionZeroVolumeSound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.setReductionVolume();

        int expected = 0;
        int actual = radio.getVolumeSound();

        Assertions.assertEquals(expected, actual);

    }

}
