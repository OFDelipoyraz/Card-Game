/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.game;

import static card.game.Oyuncu.kartListesi;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hasan
 */
public class Test {


    public static ArrayList<futbolcu> FutbolcuDestesiniKaristir(ArrayList<futbolcu> gelen) {
        ArrayList<futbolcu> yedek = new ArrayList<>();

        Random random = new Random();
        int randomYer;
        int yer = gelen.size();
        for (int i = 0; i < yer; i++) {
            randomYer = random.nextInt(gelen.size());
            yedek.add(gelen.get(randomYer));
            gelen.remove(randomYer);
        }
        return yedek;
    }

    public static ArrayList<basketbolcu> BasketbolcuDestesiniKaristir(ArrayList<basketbolcu> gelen) {
        ArrayList<basketbolcu> yedek = new ArrayList<>();

        Random random = new Random();
        int randomYer;
        int yer = gelen.size();
        for (int i = 0; i < yer; i++) {
            randomYer = random.nextInt(gelen.size());
            yedek.add(gelen.get(randomYer));
            gelen.remove(randomYer);
        }
        return yedek;
    }

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.setVisible(true);

        futbolcu HEP = new futbolcu(100, 100, 100, "Fenerbahçe", "Hasan Emre P.");
        futbolcu kruse = new futbolcu(90, 85, 80, "Fenerbahçe", "Max Kruse");
        futbolcu falcao = new futbolcu(95, 75, 90, "Galatasaray", "Radamel Falcao");
        futbolcu donk = new futbolcu(70, 80, 75, "Galatasaray", "Ryan Donk");
        futbolcu burak = new futbolcu(85, 80, 95, "Beşiktaş", "Burak Yılmaz");
        futbolcu q7 = new futbolcu(75, 95, 85, "Beşiktaş", "Ricardo Quaresma");
        futbolcu sorloth = new futbolcu(85, 90, 80, "Trabzonspor", "Alexander Sorloth");
        futbolcu visca = new futbolcu(80, 75, 95, "Basaksehir", "Edin Visca");

        basketbolcu OFD = new basketbolcu(70, 100, 100, "LA Lakers", "Ömer Faruk D.");
        basketbolcu hidayet = new basketbolcu(70, 95, 80, "LA Clippers", "Hidayet Türkoğlu");
        basketbolcu cedi = new basketbolcu(70, 75, 85, "Cleveland Cavaliers", "Cedi Osman");
        basketbolcu mehmet = new basketbolcu(70, 80, 95, "Utah Jazz", "Mehmet Okur");
        basketbolcu semih = new basketbolcu(70, 80, 90, "Boston Celtics", "Semih Erden");
        basketbolcu ibrahim = new basketbolcu(70, 85, 80, "Seattle Supersonics", "İbrahim Kutluay");
        basketbolcu ersan = new basketbolcu(70, 90, 75, "Oklohama City Thunder", "Ersan İlyasova");
        basketbolcu omer = new basketbolcu(70, 75, 95, "Chicago Bulls", "Ömer Aşık");


        ArrayList<futbolcu> futbolcukart = new ArrayList<>();
        ArrayList<basketbolcu> basketbolcukart = new ArrayList<>();
        ArrayList<futbolcu> KarismisFutbolcu = new ArrayList<>();
        ArrayList<basketbolcu> KarismisBasketbolcu = new ArrayList<>();
        ArrayList<futbolcu> KullaniciFutbol = new ArrayList<>();
        ArrayList<basketbolcu> KullaniciBasketbol = new ArrayList<>();
        ArrayList<futbolcu> BilgisayarFutbol = new ArrayList<>();
        ArrayList<basketbolcu> BilgisayarBasketbol = new ArrayList<>();

        futbolcukart.add(HEP);
        futbolcukart.add(kruse);
        futbolcukart.add(falcao);
        futbolcukart.add(donk);
        futbolcukart.add(burak);
        futbolcukart.add(q7);
        futbolcukart.add(sorloth);
        futbolcukart.add(visca);

        basketbolcukart.add(OFD);
        basketbolcukart.add(hidayet);
        basketbolcukart.add(cedi);
        basketbolcukart.add(mehmet);
        basketbolcukart.add(semih);
        basketbolcukart.add(ibrahim);
        basketbolcukart.add(ersan);
        basketbolcukart.add(omer);

        KarismisFutbolcu = FutbolcuDestesiniKaristir(futbolcukart);
        KarismisBasketbolcu = BasketbolcuDestesiniKaristir(basketbolcukart);
        

        for (int i = 0; i < 4; i++) {
            KullaniciFutbol.add(KarismisFutbolcu.get(i));
        }
        for (int i = 0; i < 4; i++) {
            KullaniciBasketbol.add(KarismisBasketbolcu.get(i));
        }
        for (int i = 4; i < 8; i++) {
            BilgisayarFutbol.add(KarismisFutbolcu.get(i));
        }
        for (int i = 4; i < 8; i++) {
            BilgisayarBasketbol.add(KarismisBasketbolcu.get(i));
        }


        while (true)
        {
            System.out.print(""); //While hata vermemesi için
            if (menu.control == 1) {
                menu.setVisible(false);
                break;
            }
        }
        
        
        OyunTahtasi ekran = new OyunTahtasi(KullaniciFutbol, KullaniciBasketbol, BilgisayarFutbol, BilgisayarBasketbol);
        kartListesi (KullaniciFutbol, KullaniciBasketbol, BilgisayarFutbol, BilgisayarBasketbol);
        ekran.setVisible(true);
        Oyuncu o1 = new Oyuncu(1,menu.kullanici,0);
        
        while (true)
        {
            System.out.print(""); //While hata vermemesi için
            if (OyunTahtasi.control == 1) {
                ekran.setVisible(false);
                break;
            }
        }
        String kaz = new String();
        if (Kullanıcı.Skor > Bilgisayar.Skor) {
            kaz=menu.kullanici;
            
        
            
        }else if(Kullanıcı.Skor < Bilgisayar.Skor){
           kaz="Bilgisayar";
        
        
        }else {Bitis Bitis = new Bitis("Berabere");
        kaz="Berabere";
         
        
        }
        Bitis Bitis =new Bitis(kaz);
        Bitis.setVisible(true);

       
    }
}
