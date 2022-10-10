
public abstract class BaseCreditManager implements ICreditManager {
	
	public abstract void Calculate(); //impelemente eden tüm sınıflar bunu kendisine göre kullanır
	
	public void Save() {
		System.out.println("Kaydedildi.");
	}
}
