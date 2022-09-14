package br.com.fiap.stream.repository.novo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.stream.model.Product;
import br.com.fiap.stream.repository.Repository;

@SuppressWarnings("unused")
public class StreamProductRepository extends Repository {

	private List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();

		String sql = "SELECT * FROM DDD_PRODUCTS";
		try {
			ResultSet rs = getConnection().createStatement().executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Não foi possível consultar os produtos: " + e.getMessage());
		}
		return products;
	}

	public Product findById(long id) {
		return findAll().stream().filter(p -> p.getId() == id).findFirst().orElse(null);
	}
}
