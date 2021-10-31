package com.company;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void main(String[] args) {


        Atm atm=new Atm();
        Hesap hesap=new Hesap("mustafa dağ","12345",6000.0);
        atm.calis(hesap);
        System.out.println("programdan çıkılıyor!!");



    }
}
