package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 7;
		int total=0;
		
		for (int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				total=total+i;  //Number'a tam bölünen sayıları burada topluyoruz.
			} 
		}
		 
		if(number==total)  //Toplam eğer number'ın kendisine eşitse.....
		{
			System.out.println("Mukemmel Sayidir."); 
		}
		else
		{
			System.out.println("Mukemmel sayi degildir.");
		}

	}

}
