package interfaceAbstractDemo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdapters());
	    customerManager.save(new Customer (1,"Elifnur","Aydin",(new Date(2000, 10, 12)),"01234567899"));
	

	}

}
