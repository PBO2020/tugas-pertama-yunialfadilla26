
package kalkulator;

public class Main {
      public static void main(String[] args) {

        Kalkulator yun = new Kalkulator();
        yun.setangka1(256);
        yun.setangka2(92);
        yun.setHasil(yun.getangka1() + yun.getangka2());
        System.out.println("Angka 1  = " +yun.getangka1());
        System.out.println("Angka 2  = " +yun.getangka2());
        System.out.println("Hasil Tambah = "+yun.getHasil());
        System.out.println("");
        
        yun.setangka1(17);
        yun.setangka2(2);
        yun.setHasilkali(yun.getangka1() * yun.getangka2());

        System.out.println("Angka 1  = " +yun.getangka1());
        System.out.println("Angka 2  = " +yun.getangka2());
        System.out.println("Hasil Kali = "+yun.getHasilkali());
        System.out.println("");

        yun.setangka1(93);
        yun.setangka2(88);
        yun.setHasilkurang(yun.getangka1() - yun.getangka2());
        System.out.println("Angka 1  = " +yun.getangka1());
        System.out.println("Angka 2  = " +yun.getangka2());
        System.out.println("Hasil Kurang = "+yun.getHasilkurang());
        System.out.println("");
        
        yun.setangka1(26);
        yun.setangka2(6);
        yun.setHasilbagi(yun.getangka1() / yun.getangka2());

        System.out.println("Angka 1  = " +yun.getangka1());
        System.out.println("Angka 2  = " +yun.getangka2());
        System.out.println("Hasil Bagi = "+yun.getHasilbagi());
        System.out.println("");
    
    }
}
