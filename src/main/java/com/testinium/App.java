package com.testinium;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Objects;
import java.util.Scanner;
/**
 * Hello world!
 *
 */

public class App {


    public static void main(String[] args) {
        App app = new App();
        app.emre("emregorgulu", "198900");
    }

    public boolean emre(String userName, String password) {
        String result = userName + password;
        System.out.println(result);
        if (Objects.equals(result, "emregorgulu198900")) {
            System.out.println("Başarılı");

            System.out.println("emre");
            return true;
            //deneme emre
            //emre

        } else {
            System.out.println("Başarısız");
            //emre
            System.out.println("emre");
            return false;
        }
    }

   }

