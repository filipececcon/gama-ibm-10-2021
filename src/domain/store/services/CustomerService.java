package domain.store.services;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

import domain.shared.interfaces.IService;
import domain.store.entities.Customer;

public class CustomerService implements IService<Customer> {

	@Override
	public Customer getOnly(Predicate<Customer> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getMany(Predicate<Customer> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Customer entity) {
		// TODO Auto-generated method stub
		
	}

}
