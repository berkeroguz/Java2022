package arrayDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("-----------------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		
		for(int i=0;i<ogrenciler.length;i++) // i öğrenciler dizisindeki eleman sayısından küçük olduğu sürece döngü çalışır
		{
			System.out.println(ogrenciler[i]); //i 1'er 1'er arttığı için index numarasına göre sıra sıra elamanlar yazılır.
			
		}
		
		//dizilerin index'leri 0'dan başlar.
		
		for (String ogrenci : ogrenciler) // Ogrenciler dizisindeki tüm elemanları gez ve anlık olarak ogrenci degiskeninde her bir elemanı tut.
		{
			
		}
		
		
		
		

	}

}
