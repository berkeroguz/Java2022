package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager()); // BaseKrediManager öğretmenkredimanager'in annesi olduğu için yazabiliyoruz.
		
		

	}

}
