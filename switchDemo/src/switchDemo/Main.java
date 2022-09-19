package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {

		case 'A':		 //CASE DİYEREK DURUMUMUZU OLUŞTURUYORUZ. ÖRN. NOT EĞER A İSE GİBİ.
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("iyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız.");
			break;
		default:    // CASE'LERİN DIŞINDA FARKLI BİR DURUM GİRİLİRSE...
			System.out.println("Geçersiz not girdiniz.");

		}
		
		//Eclipste ctrl+shift+f yapınca kodlar düzenlenir.
		
		

	}

}
