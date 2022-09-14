package br.com.fiap.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.fiap.stream.model.Customer;
import br.com.fiap.stream.model.Employee;
import br.com.fiap.stream.repository.StreamEmployeeRepository;
import br.com.fiap.stream.repository.novo.OldEmployeeRepository;
import br.com.fiap.stream.repository.novo.StreamCustomerRepository;

@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {

		// @formatter:off
 		Collection<Employee> empregados = StreamEmployeeRepository.findAll()
				.stream()
				.filter(e -> e.getAge() >= 25 && e.getAge() <= 30)
				.collect(Collectors.toList());
 		// @formatter:on

		for (Employee e : empregados) {
			System.out.println(e);
		}
	}

	/**
	 * Imprime dados dos funcionários com idade entre
	 * 
	 * @param idadeInicial
	 * @param idadeFinal
	 * @author Francis
	 */
	private static void printByAgeBetween(int idadeInicial, int idadeFinal) {
		// todos os funcionarios com idades entre 35 e 40 anos de idade;
		// @formatter:off
 		StreamEmployeeRepository.findAll()
		.stream()
		.filter(e-> e.getAge()>=idadeInicial&&e.getAge()<=idadeFinal)
		.forEach(System.out::println);
 		// @formatter:on
	}

	/**
	 * Print da média salarial por Genero
	 */
	private static void printMediaSalarialPorGenero() {
		// @formatter:off
		Map<String,List<Employee>> mapEmps =	 StreamEmployeeRepository
		.findAll()
		.stream()	
		.collect(Collectors.groupingBy(Employee::getGender));
		
		for(String genero: mapEmps.keySet()) {
			System.out.printf("%s: R$ %.2f\n",  genero, 	mapEmps.get(genero)
					.stream()
					.mapToDouble(e->e.getSalary())
					.average()
					.orElse(0.0d));
		}
		// @formatter:on
	}

	private static void printEmpregadosFemininosDoRh() {
		// @formatter:off
 		 StreamEmployeeRepository.findAll()
				.stream()
				.filter(e -> e.getGender().equals("Female"))
				.filter(e -> e.getDepartment().equals("HR"))
				.filter(e -> e.getAge()>=30)
				.forEach(System.out::println);
 		// @formatter:on
	}

	private static long getQuantidade() {
		// @formatter:off
	 	return	StreamEmployeeRepository.findAll().stream().count();
	 	// @formatter:on
	}

	private static void findByGender(String gender) {
		// @formatter:off
 		StreamEmployeeRepository.findAll()
 		  	.stream()
 		  	.filter(e -> e.getGender().equals(gender))
 		  	.forEach(System.out::println);
 		// @formatter:on
	}

	private static void findAllCostumers() {
		for (Customer c : StreamCustomerRepository.findAll()) {
			System.out.println(c);
		}
	}

	private static void imprimeEmpregadosPorCargo() {
		Map<String, List<Employee>> empregados = OldEmployeeRepository.groupByJobTitle(OldEmployeeRepository.findAll());

		for (String title : empregados.keySet()) {
			System.out.println("CARGO: " + title + "--------------------------------");
			for (Employee e : empregados.get(title)) {

				System.out.println(e);

			}
		}
	}
}
