package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='A';
		
		switch(harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println(harf + "  harfi bir kalin sesli harftir..");
		break;
		case 'E':
		case 'Ü':
		case 'Ö':
		case 'İ':
		System.out.println(harf + "  harfi bir ince sesli harftir.");
		default:
			System.out.println("Lutfen kalin ya da ince sesli bir harf giriniz.");
		}
		
		
		System.out.println("HER YİĞİDİN YOĞURT YİYİŞİ FARKLIDIR... :) ");
		
		System.out.println("-----------------------------------");
		
		System.out.println("Hocanın süre verdiği anda yazdığım kod");
		
		
		if (harf == 'A' || harf == 'O' || harf == 'U' || harf == 'I') {  // || Ya da fonksyionu if içerisindeki şartlardan herhangi biri sağlandığında o kodu çalıştırır.
			System.out.println(harf + "   harfi  kalin seslidir.");
		}
		else if (harf == 'E' || harf == 'Ö' || harf == 'Ü' || harf == 'İ') {
			System.out.println(harf + "  harfi ince seslidir");
			
		}
		else 
		{
			System.out.println("lUtfen kalİn ya da sesli bir harf giriniz.");
		}
	}

}
