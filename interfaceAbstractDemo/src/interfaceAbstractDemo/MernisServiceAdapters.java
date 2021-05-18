package interfaceAbstractDemo;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerChecksService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client =new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long. parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	
	
}
