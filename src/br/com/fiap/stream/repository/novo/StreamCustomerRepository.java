package br.com.fiap.stream.repository.novo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.stream.model.Customer;

@SuppressWarnings("unused")
public class StreamCustomerRepository {

	static private List<Customer> customers;

	static {
		customers = new ArrayList<>();
		customers.add(new Customer(1, "Stefan Walker", 1));
		customers.add(new Customer(2, "Daija Von", 1));
		customers.add(new Customer(3, "Ariane Rodriguez", 1));
		customers.add(new Customer(4, "Marques Nikolaus", 2));
		customers.add(new Customer(5, "Rachelle Greenfelder", 0));
		customers.add(new Customer(6, "Larissa White", 2));
		customers.add(new Customer(7, "Fae Heidenreich", 1));
		customers.add(new Customer(8, "Dino Will", 2));
		customers.add(new Customer(9, "Eloy Stroman", 1));
		customers.add(new Customer(10, "Brisa O' Connell", 1));
	}

	public static List<Customer> findAll() {
		return customers;
	}
}
