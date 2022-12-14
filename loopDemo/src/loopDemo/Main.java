package loopDemo;

public class Main {

	public static void main(String[] args) {

		// For Döngüsü

		// Döngüyü kurma formülü : for (değişken/sayaç tanımı ; şart bloğun ; değişkeni
		// değiştir)
		// Şart sağlandığı sürece for içindeki kod bloğu çalışır.

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");
		// ÖRNEK ALGORİTMA ADIMLAMASI.
		// 1. dönüm : i=1 ve i 10dan küçük mü ? evet. o zaman i'yi 1 arttır ve aşağıdaki
		// koda göre ekrana i (1) yazdır.
		// 2. dönüm : i 10dan küçük mü ? evet. o zaman i'yi 1 arttır ve aşağıdaki koda
		// göre ekrana i (2) yazdır.
		// 3. dönüm : i 10dan küçük mü ? evet. o zaman i'yi 1 arttır ve aşağıdaki koda
		// göre ekrana i (3) yazdır.
		// ..
		// ..
		// son Dönüm : i 10'dan küçük mü? hayır. o zaman döngüyü bitir ve döngüden çık.
		// DÖNGÜDEKİ İLK DEĞİŞKEN TANIMINDAN SONRA O KOD BİR DAHA ÇALIŞMAZ.
		// YANİ i = 1 dedikten sonra birdahaki adımlarda i'yi 1'e eşitlemez sadece başta
		// i'yi tanır ve bidaha o kod çalışmaz.

		// i+=2 >>>> i=i+2; demektir. Art arda toplama. i++ = i'yi 1 arttır demektir.

		// While
		int i = 1; // Yukarıdaki i blok içinde tanımlandığı için sadece o blokta kullanılabilir.
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");
		// infinite lopop sonsuz döngü.

		// Do- While Döngüsü
		int j = 1;
		do {

			System.out.println(j);
			j += 2;

		} while (j < 10); // j =1 J<10 olduğu sürece bu kod çalışır.
		System.out.println("Do-While Döngüsü Bitti");
		
		//DO-WHILE vs WHILE
		// While döngüsünde şart sağlanmazsa döngüye hiçbir şekilde girmez.
		//Do'da ise şart uymasa bile döngü 1 kere çalışır.

	}

}
