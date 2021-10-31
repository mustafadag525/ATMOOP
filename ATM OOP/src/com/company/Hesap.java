package com.company;

public class Hesap {



    private String kullanıcıadı;
    private String parola;
    private double bakiye;

    public Hesap(String kullanıcıadı, String parola, double bakiye) {
        this.kullanıcıadı = kullanıcıadı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanıcıadı() {
        return kullanıcıadı;
    }

    public void setKullanıcıadı(String kullanıcıadı) {
        this.kullanıcıadı = kullanıcıadı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }


    public  void parayatır(double tutar)
    {
        bakiye+=tutar;

        System.out.println("yeni bakiyeniz: "+bakiye);

    }

    public void paracek(double miktar)
    {
        if(bakiye-miktar<0)
        {
            System.out.println("yetersiz bakiye , bakiyeniz: "+bakiye);
        }
        else
        {
            bakiye-=miktar;
            System.out.println("yeni bakiyeniz: "+bakiye);
        }
    }
}
