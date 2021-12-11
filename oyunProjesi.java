package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class oyunProjesi {

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        //kagit >tas
    	 /*
    	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    	While dongumuzun icerisinde kullanicidan aldigimiz degiskene atiyoruz.
    	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
    	 */

    	Scanner scan=new Scanner(System.in);
    	List<String> list=new ArrayList<>(Arrays.asList("0-Taş", "1-Kağıt", "2-Makas"));
    	
    	String cevap="";
    	int oyuncu=0;
    	int bilgisayarSkor=0;
    	do {
    	System.out.println(list);
    	
    	System.out.println("Lütfen listedeki numaralardan birini seçiniz");
    	
    	int sayi=scan.nextInt();
    	
    	if(sayi>2 || sayi<0) {
    		System.out.println("Hatalı sayı girdiniz");
    		break;
    	}
    	
    	int bilgisayar = (int) (Math.random() * 3);
    	 
    	System.out.println(bilgisayar);
    	
    	if((sayi==0 && bilgisayar==1) || (sayi==1 && bilgisayar==2 ) || (sayi==2 && bilgisayar==0 )) {
    		bilgisayarSkor++; 
    	}else if((sayi==1 && bilgisayar==0) || (sayi==2 && bilgisayar==1 ) || (sayi==0 && bilgisayar==2 ))  {
    		
    		oyuncu++;
    	}
    		
    	System.out.println("Devam etmek istiyorsanız E ye tıklayınız");
    	cevap=scan.next();
    	}while(cevap.equalsIgnoreCase("e"));
    	
    	if(oyuncu>bilgisayarSkor) {
    		System.out.println("Oyuncu kazandı." + " Oyuncu " + oyuncu + " bilgisayar: "+ bilgisayarSkor);
    	} else if(oyuncu<bilgisayarSkor) {
    		System.out.println("Bilgisayar kazandı." + " Oyuncu: " +oyuncu + " bilgisayar: "+ bilgisayarSkor);
    	}else {
    		System.out.println("Sonuç berabere." + "Oyuncu: " +oyuncu + " Bilgisayar: "+ bilgisayarSkor);
    	}
    }

}

