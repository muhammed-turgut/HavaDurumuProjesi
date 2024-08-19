package com.random.havadurumuprojesi.Domains;

public class TommorowDomain {
    private String day;
    private String status;
    private String picPath;
    private int highTemp;
    private int lowTemp;

    public TommorowDomain(String day, String status, String picPath, int highTemp, int lowTemp) {
        this.day = day;
        this.status = status;
        this.picPath = picPath;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
    }

    public String getDay() {
        return day;
    }

    public String getStatus() {
        return status;
    }

    public String getPicPath() {
        return picPath;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }
}
