package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manavProjesi {
	static List<String> urunListesi =new ArrayList<>();
	static List<Double> urunFiyatlari =new ArrayList<>();
	static List<Integer> eklenenUrun =new ArrayList<>();
	static List<Double> kacKg =new ArrayList<>();
	static double odenecekTutar;
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */

List<String> list= new ArrayList<>();
list.add("elma- urun kodu:0");
list.add("armut- urun kodu:1");
list.add("limon- urun kodu: 2");
list.add("şeftali- urun kodu: 3:");
list.add("kiraz- urun kodu:4");

List<Double> urunFiyatlari= new ArrayList<>();

urunFiyatlari.add(5.0);
urunFiyatlari.add(7.5);
urunFiyatlari.add(11.5);
urunFiyatlari.add(8.7);
urunFiyatlari.add(9.2);

String secim="";
do {
System.out.println(list);
System.out.println("Lütfen almak istediğiniz ürünü seçiniz");
int urun=scan.nextInt();
if(urun>=0 &&urun<5) {
	eklenenUrun.add(urun);
} else {
	System.out.println("Geçersiz sayi girdiniz");
	break;
}
System.out.println("Kaç kg almak istediğinizi seçiniz");
double kg=scan.nextDouble();
kacKg.add(kg);
System.out.println("Devam edecekseniz E etmeyecekseniz H basınız");
secim=scan.next();
}
while(secim.equalsIgnoreCase("e"));

for(int i=0; i<eklenenUrun.size(); i++) {
	odenecekTutar+= urunFiyatlari.get(eklenenUrun.get(i))*kacKg.get(i);
}
System.out.println("Toplam ödemeniz gereken tuttar: " + odenecekTutar);


	}
}
