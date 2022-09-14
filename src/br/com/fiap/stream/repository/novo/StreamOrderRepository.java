package br.com.fiap.stream.repository.novo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.stream.model.Order;
import br.com.fiap.stream.model.Product;
import br.com.fiap.stream.repository.Repository;

public class StreamOrderRepository extends Repository {
//	private static List<Order> orders;

	public StreamOrderRepository() {

//		 sopr = new StreamOrderProductRepository();
//		
//		orders = new ArrayList<>();
//		// @formatter:off
// 		orders.add(new Order(1, ZonedDateTime.of(2021, 02, 28, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 8, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 5 ,sopr.findByOrderId(1L)));
//		orders.add(new Order(2, ZonedDateTime.of(2021, 02, 28, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 05, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 3,sopr.findByOrderId(2L)));
//		orders.add(new Order(3, ZonedDateTime.of(2021, 04, 10, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 18, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 5,sopr.findByOrderId(3L)));
//		orders.add(new Order(4, ZonedDateTime.of(2021, 03, 22, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 27, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 3,sopr.findByOrderId(4L)));
//		orders.add(new Order(5, ZonedDateTime.of(2021, 03, 04, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 12, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 1,sopr.findByOrderId(5L)));
//		orders.add(new Order(6, ZonedDateTime.of(2021, 03, 30, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 07, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 9,sopr.findByOrderId(6L)));
//		orders.add(new Order(7, ZonedDateTime.of(2021, 03, 05, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 9, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 8,sopr.findByOrderId(7L)));
//		orders.add(new Order(8, ZonedDateTime.of(2021, 03, 27, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 05, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 4,sopr.findByOrderId(8L)));
//		orders.add(new Order(9, ZonedDateTime.of(2021, 04, 14, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 18, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 10,sopr.findByOrderId(9L)));
//		orders.add(new Order(10, ZonedDateTime.of(2021, 03, 10, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 19, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 8,sopr.findByOrderId(10L)));
//		orders.add(new Order(11, ZonedDateTime.of(2021, 04, 01, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 04, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 1,sopr.findByOrderId(11L)));
//		orders.add(new Order(12, ZonedDateTime.of(2021, 02, 24, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 02, 28, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 5,sopr.findByOrderId(12L)));
//		orders.add(new Order(13, ZonedDateTime.of(2021, 03, 15, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 21, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 5,sopr.findByOrderId(13L)));
//		orders.add(new Order(14, ZonedDateTime.of(2021, 03, 30, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 07, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 4,sopr.findByOrderId(14L)));
//		orders.add(new Order(15, ZonedDateTime.of(2021, 03, 13, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 14, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 5,sopr.findByOrderId(15L)));
//		orders.add(new Order(16, ZonedDateTime.of(2021, 03, 13, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 21, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 1,sopr.findByOrderId(16L)));
//		orders.add(new Order(17, ZonedDateTime.of(2021, 03, 31, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 31, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 6,sopr.findByOrderId(17L)));
//		orders.add(new Order(18, ZonedDateTime.of(2021, 03, 25, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 31, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 9,sopr.findByOrderId(18L)));
//		orders.add(new Order(19, ZonedDateTime.of(2021, 02, 28, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 9, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 9,sopr.findByOrderId(19L)));
//		orders.add(new Order(20, ZonedDateTime.of(2021, 03, 23, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 30, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 5,sopr.findByOrderId(20L)));
//		orders.add(new Order(21, ZonedDateTime.of(2021, 03, 19, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 24, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 9,sopr.findByOrderId(21L)));
//		orders.add(new Order(22, ZonedDateTime.of(2021, 02, 27, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 01, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 5,sopr.findByOrderId(22L)));
//		orders.add(new Order(23, ZonedDateTime.of(2021, 04, 19, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 24, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 4,sopr.findByOrderId(23L)));
//		orders.add(new Order(24, ZonedDateTime.of(2021, 03, 24, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 24, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 1,sopr.findByOrderId(24L)));
//		orders.add(new Order(25, ZonedDateTime.of(2021, 03, 03, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 10, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 1,sopr.findByOrderId(25L)));
//		orders.add(new Order(26, ZonedDateTime.of(2021, 03, 17, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 26, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 10,sopr.findByOrderId(26L)));
//		orders.add(new Order(27, ZonedDateTime.of(2021, 03, 20, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 25, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 1,sopr.findByOrderId(27L)));
//		orders.add(new Order(28, ZonedDateTime.of(2021, 04, 9, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 16, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 2,sopr.findByOrderId(28L)));
//		orders.add(new Order(29, ZonedDateTime.of(2021, 04, 06, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 8, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 1,sopr.findByOrderId(29L)));
//		orders.add(new Order(30, ZonedDateTime.of(2021, 04, 19, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 20, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 1,sopr.findByOrderId(30L)));
//		orders.add(new Order(31, ZonedDateTime.of(2021, 03, 03, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 04, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 3,sopr.findByOrderId(31L)));
//		orders.add(new Order(32, ZonedDateTime.of(2021, 03, 15, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 24, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 2,sopr.findByOrderId(32L)));
//		orders.add(new Order(33, ZonedDateTime.of(2021, 04, 18, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 24, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 1,sopr.findByOrderId(33L)));
//		orders.add(new Order(34, ZonedDateTime.of(2021, 03, 28, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 28, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 6,sopr.findByOrderId(34L)));
//		orders.add(new Order(35, ZonedDateTime.of(2021, 03, 15, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 17, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 1,sopr.findByOrderId(35L)));
//		orders.add(new Order(36, ZonedDateTime.of(2021, 03, 04, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 8, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 2,sopr.findByOrderId(36L)));
//		orders.add(new Order(37, ZonedDateTime.of(2021, 03, 18, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 25, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 8,sopr.findByOrderId(37L)));
//		orders.add(new Order(38, ZonedDateTime.of(2021, 04, 11, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 20, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 8,sopr.findByOrderId(38L)));
//		orders.add(new Order(39, ZonedDateTime.of(2021, 04, 12, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 17, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 9,sopr.findByOrderId(39L)));
//		orders.add(new Order(40, ZonedDateTime.of(2021, 03, 12, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 12, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 3,sopr.findByOrderId(40L)));
//		orders.add(new Order(41, ZonedDateTime.of(2021, 02, 24, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 02, 26, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 5,sopr.findByOrderId(41L)));
//		orders.add(new Order(42, ZonedDateTime.of(2021, 04, 8, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 14, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 9,sopr.findByOrderId(42L)));
//		orders.add(new Order(43, ZonedDateTime.of(2021, 03, 03, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 11, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 3,sopr.findByOrderId(43L)));
//		orders.add(new Order(44, ZonedDateTime.of(2021, 03, 12, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 14, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 4,sopr.findByOrderId(44L)));
//		orders.add(new Order(45, ZonedDateTime.of(2021, 04, 01, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 06, 0, 0, 0, 0, ZoneId.systemDefault()), "DELIVERED", 1,sopr.findByOrderId(45L)));
//		orders.add(new Order(46, ZonedDateTime.of(2021, 03, 16, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 22, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 10,sopr.findByOrderId(46L)));
//		orders.add(new Order(47, ZonedDateTime.of(2021, 04, 07, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 12, 0, 0, 0, 0, ZoneId.systemDefault()), "PENDING", 2,sopr.findByOrderId(47L)));
//		orders.add(new Order(48, ZonedDateTime.of(2021, 04, 05, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 06, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 2,sopr.findByOrderId(48L)));
//		orders.add(new Order(49, ZonedDateTime.of(2021, 04, 10, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 04, 13, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 7,sopr.findByOrderId(49L)));
//		orders.add(new Order(50, ZonedDateTime.of(2021, 03, 18, 0, 0, 0, 0, ZoneId.systemDefault()),ZonedDateTime.of(2021, 03, 21, 0, 0, 0, 0, ZoneId.systemDefault()), "NEW", 9,sopr.findByOrderId(50L)));
//		// @formatter:on

	}

	public List<Order> findAll() {

		StreamOrderProductRepository sopr = new StreamOrderProductRepository();

		List<Order> orders = new ArrayList<Order>();

		String sql = "SELECT * FROM DDD_PRODUCT_ORDER ";

		ResultSet rs = null;

		try {
			rs = getConnection().createStatement().executeQuery(sql);

			if (rs.isBeforeFirst()) {
				while (rs.next()) {

					// @formatter:off
					int anoOrder = rs.getDate("ORDER_DATE").getYear()+1900;
					int mesOrder = rs.getDate("ORDER_DATE").getMonth()+1;
					int diaOrder = rs.getDate("ORDER_DATE").getDate();
					
					
					int anoDelivery = rs.getDate("delivery_date").getYear()+1900;
					int mesDelivery = rs.getDate("delivery_date").getMonth()+1;
					int diaDelivery = rs.getDate("delivery_date").getDate();
					
 					 ZonedDateTime dtOrder =  ZonedDateTime.of( anoOrder, mesOrder,   diaOrder, 0, 0, 0, 0, ZoneId.systemDefault()) ;
					 ZonedDateTime dtDelivery=  ZonedDateTime.of( anoDelivery, mesDelivery,    diaDelivery, 0, 0, 0, 0, ZoneId.systemDefault()) ;
					 // @formatter:on

					Order o = new Order(rs.getLong("ID"), dtOrder, dtDelivery, rs.getString("STATUS"),
							rs.getLong("customer_id"));

					List<Product> products = sopr.findByOrderId(rs.getLong("ID"));

					for (Product p : products) {
						o.getProducts().add(p);
					}

					orders.add(o);
				}
			}

		} catch (SQLException e) {
			System.out.println("Não foi possível consultar os produtos: " + e.getMessage());
		} finally {
			try {
				if (rs != null && !rs.isClosed())
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return orders;
	}

	public Order findById(long id) {
		return findAll().stream().filter(o -> o.getId() == id).findFirst().orElse(null);
	}
}
