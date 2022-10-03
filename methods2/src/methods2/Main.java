package methods2;

public class Main {

	public static void main(String[] args) {
		
	//void operasyonlar = paramteresiz emir kipinde bir işi yap demektir.
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5);
		System.out.println("toplam =" + toplam);
		
		
	}
	public static void ekle() {
		System.out.println("Eklendi");
		
	}
	public static void sil() {
		System.out.println("Silindi.");
		
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
		
	}
	public static String sehirVer() {
		return "Ankara";
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	//toplu değer göndermek
	
	public static int topla2 (int... sayilar) //variable arguments.... 
	{
		int toplam = 0;
		for (int sayi:sayilar) //integer dizisindeki tüm elemanları gezer.
		{
			toplam+=sayi;
		}
		
		return toplam;
		
	}

}
