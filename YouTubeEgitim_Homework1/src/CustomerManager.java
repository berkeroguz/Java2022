
public class CustomerManager {
	
	private ICreditManager creditManager;
	private Customer customer;
	
	public CustomerManager(Customer customer,ICreditManager creditManager)
	{
		this.customer=customer;
		this.creditManager=creditManager;
	}
	
	public void Save()
	{
		System.out.println("Müşteri Kayededildi.");
	}
	
	public void GiveCredit() {
		creditManager.Calculate();
		
	}
	
}
