package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
		
	
		

	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5};
		int aranacak = 5;
		boolean varMi=false;
		
		for (int sayi:sayilar) {
			if (sayi==aranacak)
			{
				varMi=true;
				break;
			}
		}
		if (varMi)
		{
			System.out.println("Sayi mevcuttur");
		}
		else
		{
			System.out.println("Sayi mevcut degildir.");
		}
		
		
		System.out.println("------------------------");
		System.out.println("Her yigidin yogurt yiyisi farklidir vol2 :) ....");
		System.out.println("------------------------");
		
		
		for (int aranan:sayilar)
		{
			if (aranacak==aranan)
			{
				System.out.println("sayi bulundu.");
				return;
			}
		}
		System.out.println("sayi bulunamadı.");
		
		
		
	}
	
	public static void mesajVer() {
		
		
		
	}
	

}
