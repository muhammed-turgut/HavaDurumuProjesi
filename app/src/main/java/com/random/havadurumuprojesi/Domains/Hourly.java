package com.random.havadurumuprojesi.Domains;

public class Hourly {
    private String Hour;
    private int temp;
    private String pitPath;

    public String getHour() {
        return Hour;
    }

    public void setHour(String hour) {
        Hour = hour;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getPitPath() {
        return pitPath;
    }

    public void setPitPath(String pitPath) {
        this.pitPath = pitPath;
    }

    public Hourly(String hour, int temp, String pitPath) {
        Hour = hour;
        this.temp = temp;
        this.pitPath = pitPath;
    }
}
