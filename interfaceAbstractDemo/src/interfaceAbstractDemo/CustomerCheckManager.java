package interfaceAbstractDemo;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerChecksService{

	@Override
	public boolean  CheckIfRealPerson(Customer customer) {
	return true;
		
	}

}
