package br.com.fiap.stream.repository.novo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.stream.model.Employee;

/**
 * Maneira de se manipular dados antes da API Stream
 * 
 * @author Francis
 * @author Gavin Fong
 * 
 * @see "https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82"
 *
 */
public class OldEmployeeRepository {

	private static List<Employee> employeeList;

	static {
		employeeList = new ArrayList<Employee>();
		// @formatter:off
 		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "Psychologist", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Seller", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Computer technician", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Marketing Director", "Product Development",2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "Psychologist", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Accountant", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Marketing Director", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Seller", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Computer technician", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Marketing Director", "Product Development", 2016,28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Accountant", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Seller", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Computer technician", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Marketing Director", "Product Development",2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Marketing Director", "Product Development",2012, 35700.0));
		// @formatter:on

	}

	/**
	 * Agrupando empregados pelo cargo
	 * 
	 * @param employeeList
	 * @return
	 */
	public static Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
		Map<String, List<Employee>> resultMap = new HashMap<>();
		for (int i = 0; i < employeeList.size(); i++) {
			Employee employee = employeeList.get(i);
			List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
			employeeSubList.add(employee);
			resultMap.put(employee.getTitle(), employeeSubList);
		}
		return resultMap;
	}

	/**
	 * Calcula a média salarial
	 * 
	 * @param employeeList
	 * @return
	 */
	public double calculateAverage(List<Employee> employeeList) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < employeeList.size(); i++) {
			Employee employee = employeeList.get(i);
			sum += employee.getSalary();
			count++;
		}
		return (double) sum / count;
	}

	/**
	 * Listagem de todos os empregados
	 * 
	 * @return
	 */
	public static List<Employee> findAll() {
		return employeeList;
	}

}
