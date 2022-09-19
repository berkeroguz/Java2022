package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number =-5;
		boolean isPrime=true;
		
		if(number==1)  //Eğer 1 değeri girildiyse bu programın amacına göre özel bir durumdur ve sayının asal olmadığnıı belirtip programı sonlandırırız.
		{
			System.out.println("Sayi Asal Degildir.");
			return;
		}
		
		if(number<1) //Asal Sayı pozitif sayılardır ve 1'den küçük sayılar için hata verdirip programı bitiririz.
		{
			System.out.println("Geçersiz sayi");
			return;
		}
		
		for(int i=2;i<number;i++) { 
			if(number%i==0)  //Number'i 2'den kendisine kadar olan sayılara böldürüyoruz ... +
			{
				isPrime=false;  // Eğer kendisine gelene kadar 0'a bölünen bir sayı olursa asal değildir.
			}
		}
		if(isPrime) //Asal mi ? 
		{
			System.out.println("Sayi asaldir.");
		}
		else //değilse...
		{
			System.out.println("sayi asal degildir.");
		}
		
		
		
		
		
		
		/*for (int i=2;i<sayi;i++)
		{
			int sonuc = sayi %i;
			if (sonuc==0)
			{
				asalMi=false;
				break;
			}
			
		}
		if(asalMi==true)
		{
			System.out.println("Sayı asaldır.");
		}
		else
		{
			System.out.println("sayı asal değildir.");
		}
		*/

	}

}
