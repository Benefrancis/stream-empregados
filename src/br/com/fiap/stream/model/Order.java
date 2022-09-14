package br.com.fiap.stream.model;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private long id;
	private ZonedDateTime orderDate;
	private ZonedDateTime deliveryDate;
	private String status;
	private long customer;
	private List<Product> products = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ZonedDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(ZonedDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public ZonedDateTime getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(ZonedDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getCustomer() {
		return customer;
	}

	public void setCustomer(long customer) {
		this.customer = customer;
	}

	public List<Product> getProducts() {
		return products;
	}

	public Order() {
		super();
	}

	public Order(long id, ZonedDateTime orderDate, ZonedDateTime deliveryDate, String status, long customer,
			List<Product> products) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.customer = customer;
		this.products = products;
	}

	public Order(long id, ZonedDateTime orderDate, ZonedDateTime deliveryDate, String status, long customer) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) + ", deliveryDate=" + deliveryDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) + ", status=" + status
				+ ", customer=" + customer + ", products=" + products + "]";
	}

}
