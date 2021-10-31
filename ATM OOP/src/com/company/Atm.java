package com.company;

import java.util.Scanner;

public class Atm {

    public void calis(Hesap hesap){

        Login login=new Login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("bankaya hoşgeldiniz");

        System.out.println("-----------");
        System.out.println("kullanıcı girişi");
        System.out.println("-----------");
        int giris_hakkı=3;

        while (true)
        {
            if(login.login(hesap)){
                System.out.println("giriş başarılı");
                break;
            }
            else
            {
                System.out.println("gitiş başarısız");
                giris_hakkı--;
                System.out.println("kala giriş hakkı: "+giris_hakkı);
            }
            if(giris_hakkı==0)
            {
                System.out.println("giriş hakkınız bitti");
                return;
            }



        }

        System.out.println("********");
        String islemler="1.bakiye öğrenme" +
                "2.para yatırma\n" +
                "3.para çekme\n" +
                "çıkış için q ya basın";
        System.out.println("*******");
        System.out.println(islemler);

        while (true)
        {
            System.out.println("işlem seçiniz");
            String islem=scanner.nextLine();
            if (islem.equals("q"))
            {
                System.out.println("programfan çıkılıyor");
                break;
            }
            else if(islem.equals("1"))
            {
                System.out.println("bakiyeniz: "+hesap.getBakiye());
            }
            else if (islem.equals("2"))
            {
                System.out.println("yatırmak istediğiniz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.parayatır(tutar);
            }
            else if (islem.equals("3"))
            {
                System.out.println("çekmek istedğiniz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paracek(tutar);
            }
            else
            {
                System.out.println("geçeriz islem");

            }
        }




    }


}
