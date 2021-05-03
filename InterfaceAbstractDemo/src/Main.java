import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();	
		customer.setId(1);
		customer.setFirstName("Yýldýray");
		customer.setLastName("Abdioðlu");
		customer.setDateOfBirth(new GregorianCalendar(2002, 11 , 26).getTime());
		customer.setNationalityId("19877104636");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.save(customer);
		
		
		
		

	}

}
