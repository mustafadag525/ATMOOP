package com.company;

import com.company.Hesap;

import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap)
    {
        Scanner scanner=new Scanner(System.in);
        String kullanıcı_adı;
        String parola;
        System.out.println("kullanıcı adı: ");
        kullanıcı_adı=scanner.nextLine();
        System.out.println("parola: ");
        parola=scanner.nextLine();

        if(hesap.getKullanıcıadı().equals(kullanıcı_adı) && hesap.getParola().equals(parola))
        {
            return true;
        }
        else
        {
            return false;
        }
    }



}
