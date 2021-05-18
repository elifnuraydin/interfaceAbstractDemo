package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerChecksService customerCheckService;

	public StarbucksCustomerManager(ICustomerChecksService customerChecksService) {
		this.customerCheckService = customerChecksService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Exection not a valid person....");
		}
		
	
	}

}