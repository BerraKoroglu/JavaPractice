	package JavaPractice;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;


	public class marketProjesi {
		/*
		 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
		 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
		 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
		 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
		 *
		 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
		 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
		 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
		 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
		 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
		 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
		 * 			 ortalama kazançtan yüksekse o günleri return yap.
		 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
		 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
		 * 			 ortalama kazançtan aşağıysa o günleri return yap.
		 * */


	static String arr[]= {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
	static List<Double> gunlukKazanc= new ArrayList<>();
	static double ortalamaKazanc;

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	double girilenKazanc=0;
		int i=0;
		while(i<arr.length) {
			
			System.out.println(arr[i] + " günkü kazancınızı giriniz");
			girilenKazanc= scan.nextDouble();
			gunlukKazanc.add(girilenKazanc);
			i++;
		}
		getOrtalamaKazanc();
	System.out.println("\n----------------");
		getOrtalamaninUstundeKazancGünleri();
		System.out.println("\n----------------");
		getOrtalamaninAltindaKazancGünleri();

		}

	private static void getOrtalamaninAltindaKazancGünleri() {
		System.out.print("Ortalamanın altında kazanan günler: ");
		for(int i=0; i<gunlukKazanc.size(); i++) {
			if(gunlukKazanc.get(i)<ortalamaKazanc) {
				System.out.print(arr[i]+ " ");
			}
		}
		
	}

	private static void getOrtalamaninUstundeKazancGünleri() {
		System.out.print("Ortalamanın üstünde kazanan günler: ");
		for(int i=0; i<gunlukKazanc.size(); i++) {
			
			if(gunlukKazanc.get(i)>ortalamaKazanc) {
				System.out.print(arr[i]+ " ");
				
			}
		}
		
	}

	private static void getOrtalamaKazanc() {
		for(int i=0; i<gunlukKazanc.size(); i++) {
			ortalamaKazanc+=gunlukKazanc.get(i);
		}
		ortalamaKazanc/=7;
		System.out.println("Ortalama kazanç: " + ortalamaKazanc + " 'tır");
		
	}
	}