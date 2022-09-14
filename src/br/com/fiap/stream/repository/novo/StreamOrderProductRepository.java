package br.com.fiap.stream.repository.novo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.stream.model.Order;
import br.com.fiap.stream.model.Product;
import br.com.fiap.stream.repository.Repository;

public class StreamOrderProductRepository extends Repository {

//	private static List<OrderProduct> ops;
//
//	private StreamOrderRepository str;
//
//	private StreamProductRepository spr;
//
	public StreamOrderProductRepository() {
//
//		this.str = new StreamOrderRepository();
//
//		this.spr = new StreamProductRepository();
//
//		ops = new ArrayList<>();
//		ops.add(new OrderProduct(str.findById(1), spr.findById(19)));
//		ops.add(new OrderProduct(str.findById(1), spr.findById(21)));
//		ops.add(new OrderProduct(str.findById(1), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(2), spr.findById(17)));
//		ops.add(new OrderProduct(str.findById(2), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(2), spr.findById(14)));
//		ops.add(new OrderProduct(str.findById(2), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(3), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(3), spr.findById(3)));
//		ops.add(new OrderProduct(str.findById(3), spr.findById(19)));
//		ops.add(new OrderProduct(str.findById(3), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(3), spr.findById(15)));
//		ops.add(new OrderProduct(str.findById(4), spr.findById(22)));
//		ops.add(new OrderProduct(str.findById(4), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(4), spr.findById(12)));
//		ops.add(new OrderProduct(str.findById(5), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(6), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(6), spr.findById(12)));
//		ops.add(new OrderProduct(str.findById(7), spr.findById(8)));
//		ops.add(new OrderProduct(str.findById(7), spr.findById(25)));
//		ops.add(new OrderProduct(str.findById(7), spr.findById(21)));
//		ops.add(new OrderProduct(str.findById(7), spr.findById(1)));
//		ops.add(new OrderProduct(str.findById(7), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(7), spr.findById(10)));
//		ops.add(new OrderProduct(str.findById(8), spr.findById(12)));
//		ops.add(new OrderProduct(str.findById(8), spr.findById(8)));
//		ops.add(new OrderProduct(str.findById(9), spr.findById(8)));
//		ops.add(new OrderProduct(str.findById(10), spr.findById(14)));
//		ops.add(new OrderProduct(str.findById(10), spr.findById(8)));
//		ops.add(new OrderProduct(str.findById(11), spr.findById(12)));
//		ops.add(new OrderProduct(str.findById(11), spr.findById(6)));
//		ops.add(new OrderProduct(str.findById(11), spr.findById(21)));
//		ops.add(new OrderProduct(str.findById(11), spr.findById(22)));
//		ops.add(new OrderProduct(str.findById(11), spr.findById(27)));
//		ops.add(new OrderProduct(str.findById(11), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(12), spr.findById(19)));
//		ops.add(new OrderProduct(str.findById(12), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(12), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(12), spr.findById(6)));
//		ops.add(new OrderProduct(str.findById(13), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(13), spr.findById(24)));
//		ops.add(new OrderProduct(str.findById(13), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(13), spr.findById(23)));
//		ops.add(new OrderProduct(str.findById(14), spr.findById(18)));
//		ops.add(new OrderProduct(str.findById(15), spr.findById(16)));
//		ops.add(new OrderProduct(str.findById(15), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(15), spr.findById(7)));
//		ops.add(new OrderProduct(str.findById(16), spr.findById(23)));
//		ops.add(new OrderProduct(str.findById(16), spr.findById(29)));
//		ops.add(new OrderProduct(str.findById(16), spr.findById(18)));
//		ops.add(new OrderProduct(str.findById(16), spr.findById(16)));
//		ops.add(new OrderProduct(str.findById(16), spr.findById(22)));
//		ops.add(new OrderProduct(str.findById(16), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(17), spr.findById(18)));
//		ops.add(new OrderProduct(str.findById(17), spr.findById(4)));
//		ops.add(new OrderProduct(str.findById(18), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(18), spr.findById(3)));
//		ops.add(new OrderProduct(str.findById(18), spr.findById(27)));
//		ops.add(new OrderProduct(str.findById(18), spr.findById(2)));
//		ops.add(new OrderProduct(str.findById(19), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(19), spr.findById(22)));
//		ops.add(new OrderProduct(str.findById(19), spr.findById(18)));
//		ops.add(new OrderProduct(str.findById(19), spr.findById(14)));
//		ops.add(new OrderProduct(str.findById(19), spr.findById(15)));
//		ops.add(new OrderProduct(str.findById(19), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(20), spr.findById(22)));
//		ops.add(new OrderProduct(str.findById(21), spr.findById(21)));
//		ops.add(new OrderProduct(str.findById(21), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(22), spr.findById(7)));
//		ops.add(new OrderProduct(str.findById(22), spr.findById(6)));
//		ops.add(new OrderProduct(str.findById(23), spr.findById(27)));
//		ops.add(new OrderProduct(str.findById(23), spr.findById(7)));
//		ops.add(new OrderProduct(str.findById(23), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(23), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(24), spr.findById(24)));
//		ops.add(new OrderProduct(str.findById(24), spr.findById(2)));
//		ops.add(new OrderProduct(str.findById(24), spr.findById(6)));
//		ops.add(new OrderProduct(str.findById(24), spr.findById(28)));
//		ops.add(new OrderProduct(str.findById(24), spr.findById(4)));
//		ops.add(new OrderProduct(str.findById(25), spr.findById(28)));
//		ops.add(new OrderProduct(str.findById(25), spr.findById(17)));
//		ops.add(new OrderProduct(str.findById(25), spr.findById(2)));
//		ops.add(new OrderProduct(str.findById(25), spr.findById(29)));
//		ops.add(new OrderProduct(str.findById(25), spr.findById(19)));
//		ops.add(new OrderProduct(str.findById(26), spr.findById(4)));
//		ops.add(new OrderProduct(str.findById(27), spr.findById(6)));
//		ops.add(new OrderProduct(str.findById(27), spr.findById(15)));
//		ops.add(new OrderProduct(str.findById(27), spr.findById(24)));
//		ops.add(new OrderProduct(str.findById(28), spr.findById(22)));
//		ops.add(new OrderProduct(str.findById(28), spr.findById(9)));
//		ops.add(new OrderProduct(str.findById(29), spr.findById(22)));
//		ops.add(new OrderProduct(str.findById(30), spr.findById(29)));
//		ops.add(new OrderProduct(str.findById(30), spr.findById(6)));
//		ops.add(new OrderProduct(str.findById(30), spr.findById(8)));
//		ops.add(new OrderProduct(str.findById(31), spr.findById(16)));
//		ops.add(new OrderProduct(str.findById(31), spr.findById(12)));
//		ops.add(new OrderProduct(str.findById(31), spr.findById(28)));
//		ops.add(new OrderProduct(str.findById(32), spr.findById(8)));
//		ops.add(new OrderProduct(str.findById(32), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(33), spr.findById(12)));
//		ops.add(new OrderProduct(str.findById(33), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(33), spr.findById(21)));
//		ops.add(new OrderProduct(str.findById(33), spr.findById(23)));
//		ops.add(new OrderProduct(str.findById(33), spr.findById(29)));
//		ops.add(new OrderProduct(str.findById(33), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(34), spr.findById(1)));
//		ops.add(new OrderProduct(str.findById(34), spr.findById(6)));
//		ops.add(new OrderProduct(str.findById(34), spr.findById(22)));
//		ops.add(new OrderProduct(str.findById(34), spr.findById(19)));
//		ops.add(new OrderProduct(str.findById(34), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(34), spr.findById(27)));
//		ops.add(new OrderProduct(str.findById(35), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(35), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(35), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(35), spr.findById(9)));
//		ops.add(new OrderProduct(str.findById(36), spr.findById(28)));
//		ops.add(new OrderProduct(str.findById(36), spr.findById(7)));
//		ops.add(new OrderProduct(str.findById(37), spr.findById(15)));
//		ops.add(new OrderProduct(str.findById(37), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(38), spr.findById(18)));
//		ops.add(new OrderProduct(str.findById(38), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(38), spr.findById(14)));
//		ops.add(new OrderProduct(str.findById(38), spr.findById(20)));
//		ops.add(new OrderProduct(str.findById(38), spr.findById(7)));
//		ops.add(new OrderProduct(str.findById(39), spr.findById(1)));
//		ops.add(new OrderProduct(str.findById(39), spr.findById(21)));
//		ops.add(new OrderProduct(str.findById(40), spr.findById(12)));
//		ops.add(new OrderProduct(str.findById(40), spr.findById(10)));
//		ops.add(new OrderProduct(str.findById(40), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(40), spr.findById(29)));
//		ops.add(new OrderProduct(str.findById(40), spr.findById(1)));
//		ops.add(new OrderProduct(str.findById(41), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(41), spr.findById(19)));
//		ops.add(new OrderProduct(str.findById(41), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(41), spr.findById(29)));
//		ops.add(new OrderProduct(str.findById(41), spr.findById(14)));
//		ops.add(new OrderProduct(str.findById(41), spr.findById(4)));
//		ops.add(new OrderProduct(str.findById(42), spr.findById(2)));
//		ops.add(new OrderProduct(str.findById(43), spr.findById(6)));
//		ops.add(new OrderProduct(str.findById(44), spr.findById(20)));
//		ops.add(new OrderProduct(str.findById(44), spr.findById(18)));
//		ops.add(new OrderProduct(str.findById(44), spr.findById(8)));
//		ops.add(new OrderProduct(str.findById(44), spr.findById(24)));
//		ops.add(new OrderProduct(str.findById(44), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(44), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(45), spr.findById(23)));
//		ops.add(new OrderProduct(str.findById(45), spr.findById(1)));
//		ops.add(new OrderProduct(str.findById(45), spr.findById(25)));
//		ops.add(new OrderProduct(str.findById(45), spr.findById(15)));
//		ops.add(new OrderProduct(str.findById(46), spr.findById(16)));
//		ops.add(new OrderProduct(str.findById(46), spr.findById(24)));
//		ops.add(new OrderProduct(str.findById(46), spr.findById(19)));
//		ops.add(new OrderProduct(str.findById(46), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(46), spr.findById(11)));
//		ops.add(new OrderProduct(str.findById(47), spr.findById(23)));
//		ops.add(new OrderProduct(str.findById(47), spr.findById(28)));
//		ops.add(new OrderProduct(str.findById(47), spr.findById(20)));
//		ops.add(new OrderProduct(str.findById(47), spr.findById(21)));
//		ops.add(new OrderProduct(str.findById(48), spr.findById(15)));
//		ops.add(new OrderProduct(str.findById(48), spr.findById(3)));
//		ops.add(new OrderProduct(str.findById(48), spr.findById(26)));
//		ops.add(new OrderProduct(str.findById(48), spr.findById(7)));
//		ops.add(new OrderProduct(str.findById(48), spr.findById(19)));
//		ops.add(new OrderProduct(str.findById(48), spr.findById(10)));
//		ops.add(new OrderProduct(str.findById(49), spr.findById(5)));
//		ops.add(new OrderProduct(str.findById(49), spr.findById(13)));
//		ops.add(new OrderProduct(str.findById(49), spr.findById(29)));
//		ops.add(new OrderProduct(str.findById(49), spr.findById(3)));
//		ops.add(new OrderProduct(str.findById(49), spr.findById(12)));
//		ops.add(new OrderProduct(str.findById(49), spr.findById(17)));
//		ops.add(new OrderProduct(str.findById(50), spr.findById(15)));
//		ops.add(new OrderProduct(str.findById(50), spr.findById(16)));
	}

	public List<OrderProduct> findAll() {

		StreamOrderRepository orderRepo = new StreamOrderRepository();
		StreamProductRepository prodRepo = new StreamProductRepository();

		List<OrderProduct> ops = new ArrayList<OrderProduct>();

		String sql = "SELECT *  FROM  ddd_order_product_relationship";
		ResultSet rs = null;
		Statement st = null;
		try {

			st = getConnection().createStatement();
			rs = st.executeQuery(sql);
			if (rs.isBeforeFirst()) {
			while (rs.next()) {
				Order o = orderRepo.findById(rs.getLong("order_id"));
				Product p = prodRepo.findById(rs.getLong("product_id"));
				ops.add(new OrderProduct(o, p));
				}
			}

		} catch (SQLException e) {
			System.out.println("Não foi possível consultar os order product relationship : " + e.getMessage());
		} finally {
			try {
				if (rs != null && !rs.isClosed())
					rs.close();
				if (st != null && !st.isClosed())
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return ops;
	}

	public List<Product> findByOrderId(Long id) {

		List<Product> ret = new ArrayList<Product>();
		List<OrderProduct> op = findAll();
		op.stream().filter(opx -> opx.getOrder().getId() == id).toList().forEach(opy -> {

			ret.add(opy.getProduct());

		});

		return ret;

	}
}

class OrderProduct {
	Order order;
	Product product;

	public OrderProduct(Order order, Product product) {
		super();
		this.order = order;
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderProduct [order=" + order + ", product=" + product + "]";
	}

}