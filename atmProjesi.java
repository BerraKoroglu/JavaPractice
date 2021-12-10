package JavaPractice;

import java.util.Scanner;

public class atmProjesi {
	
	
	static String kartNumara="1234123412341234";
	static String sifre="1234";
	static Scanner scan=new Scanner(System.in);
	static double bakiye=1000;

	public static void main(String[] args) {
		/*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */
		
		String kno="";
		String s="";
		int sayac=0;
		System.out.println("Ziraat banka hoş geldiniz");
		System.out.println("**************************");
		do {
			
			System.out.println("Kart numaranızı giriniz ?");
			kno=scan.nextLine();
			if(!kartNumara.equals(kno.replaceAll(" ", ""))) {
				System.out.println("Geçersiz bir kart numarası girdiniz Lütfen Tekrar deneyiniz");
			}
			
		}
		while(!kartNumara.equals(kno.replaceAll(" ", "")));
		
		do {
			
			System.out.println("Kart şifrenizi giriniz ?");
			s=scan.nextLine();
			
			if(!sifre.equals(s)) {
				sayac++;
				if(sayac>=3) {
					System.out.println("3 kere yanlış hak girdiniz.Kart bloke oldu");
					break;
				}else {
				System.out.println("Geçersiz bir şifre girdiniz.Lütfen tekrar deneyiniz. ");
			System.out.println(3-sayac+ " Hakkınız kaldı ");
				}
			
			}
		}
		
		while(!sifre.equals(s));
		
		int sayi=0;
		do {
			System.out.println("----------------------------------------");
		System.out.println("Bir işlem seçiniz.");
		System.out.println("\n 1- Bakiye sorgula, \n 2- Para yatırma, \n 3- Para çekme, \n 4- Para gönderme, \n 5-Şifre değiştirme, \n 6-Çıkış");
	    sayi= scan.nextInt();
		
		switch(sayi) {
		
		case 1:
			System.out.println("Bakiyeniz: " + bakiye);
			break;
		case 2:
			paraYatırma();
			break;
		case 3:
			paraCekme();
			break;
		case 4:
			paraGonderme();
			break;
		case 5:
			sıfreDegisme();
			break;
		case 6:
			break;
			default:
				System.out.println("Geçersiz bir sayi girdiniz");
		}
		}
		while(sayi!=6);
		
		}

	private static void sıfreDegisme() {
		System.out.println("Lütfen şifrenizi giriniz");
		String sifreYeni=scan.next();
		if(sifreYeni.equals(sifre)) {
			System.out.println("Şifre başarılı. Lütfen yeni şifrenizi giriniz");
			String yeni=scan.next();
			if(yeni.length()==4) {
				sifre=yeni;
				System.out.println("Şifre değiştirme başarılı.");
			}
		}
		
	}

	private static void paraGonderme() {
		System.out.println("Bakiyeniz: " +bakiye + " \nLütfen göndermek istediğiniz tutarı giriniz");
		double sayi=scan.nextDouble();
		if(sayi<=bakiye) {
		System.out.println("Lütfen göndermek istediğiniz kişinin ibanını giriniz");
		String iban=scan.next();
		if(iban.substring(0,1).equalsIgnoreCase("TR") || iban.length()==26) {
			System.out.println("İBAN başarılı para gönderiliyor");
			bakiye-=sayi;
			System.out.println("--------Para gönderildi--------");
			System.out.println("Güncel bakiyeniz: " +bakiye);
		} else{
			System.out.println("İBAN başarısız");
		}
		}else {
			System.out.println("bAKİYENİZ YETERSİZ");
		}
	}

	private static void paraCekme() {
		System.out.println("Bakiyeniz: " +bakiye + " \nLütfen çekmek istediğiniz tutarı giriniz");
		double sayi=scan.nextDouble();
		if (sayi>bakiye) {
			System.out.println("Hesabınızda bu kadar tutar bulunmamaktadır.");
		}else {
			bakiye-=sayi;
			System.out.println("İşlem başarılı \n1Güncel bakiyeniz: " +bakiye);
		}
		
	}

	private static void paraYatırma() {
		
		System.out.println("Mevcut bakiyeniz: " + bakiye + "\nLütfen Yatırmak istediğiniz tutarı giriniz.");
		double tutar=scan.nextDouble();
		bakiye+= tutar;
		System.out.println("..............");
		System.out.println("İşlem başarılı güncel bakiyeniz: "+ bakiye);
		
		
	}
	}

