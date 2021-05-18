package interfaceAbstractDemo;

public class CustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : "+customer.getFirstName());
		
	}

}
