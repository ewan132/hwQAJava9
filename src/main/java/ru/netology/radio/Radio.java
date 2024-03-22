package ru.netology.radio;
public class Radio {

    public int stationNumber;

   public int getStationNumber(){return stationNumber;}
    public void setNextStation(int next){
        if (next == 9){
            return;
        }else if (next < 9){
            next ++;
        }
        stationNumber = next;
    }

    public void setPrevStation(int prev){
        if (prev == 0){
            stationNumber = 9;
            return;
        } else if (prev > 0){
            prev --;
        }
        stationNumber = prev;
    }


    public int volumeSound;
    public int getVolumeSound(){return volumeSound;}

    public void setAddingSoundVolume(int adding){
        if (adding >= 0 && adding !=100){
            adding ++;
        } if (adding == 100){
            volumeSound = 100;
            return;
        }
        volumeSound = adding;
    }

    public void setReductionVolume(int reduct){
        if (reduct <=100 && reduct !=0){
            reduct --;
        } if (reduct == 0){
            volumeSound = 0;
            return;
        }
        volumeSound = reduct;
    }

}