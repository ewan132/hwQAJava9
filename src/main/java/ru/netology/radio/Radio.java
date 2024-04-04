package ru.netology.radio;

public class Radio {

    private int stationNumber;
    private int volumeSound;
    private int maxStation;

    public Radio (int stationCount){
        maxStation = stationCount - 1;
    }

    public Radio(){
        maxStation = 9;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getVolumeSound() {
        return volumeSound;
    }

    public void setCurrentStation(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > maxStation) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public void setCurrentVolume(int volumeSound) {
        if (volumeSound < 0) {
            return;
        }
        if (volumeSound > 100) {
            return;
        }
        this.volumeSound = volumeSound;
    }

    public void setNextStation() {
        if (stationNumber == maxStation) {
            stationNumber = 0;
            return;
        } else {
            stationNumber++;
            return;
        }
    }

    public void setPrevStation() {
        if (stationNumber == 0) {
            stationNumber = 9;
            return;
        } else {
            stationNumber--;
        }
    }


    public void setAddingSoundVolume() {
        if (volumeSound < 100) {
            volumeSound++;
        } else {
            volumeSound = 100;
            return;
        }
    }


    public void setReductionVolume() {
        if (volumeSound > 0) {
            volumeSound--;
        }
        if (volumeSound == 0) {
            volumeSound = 0;
            return;
        }

    }
}
