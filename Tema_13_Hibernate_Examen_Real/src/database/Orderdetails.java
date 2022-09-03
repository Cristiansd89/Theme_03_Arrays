package database;
// Generated 7 mar 2022 11:41:15 by Hibernate Tools 5.6.3.Final

import java.math.BigDecimal;

/**
 * Orderdetails generated by hbm2java
 */
public class Orderdetails implements java.io.Serializable {

	private OrderdetailsId id;
	private Orders orders;
	private Products products;
	private int quantityOrdered;
	private BigDecimal priceEach;
	private short orderLineNumber;

	public Orderdetails() {
	}

	public Orderdetails(OrderdetailsId id, Orders orders, Products products, int quantityOrdered, BigDecimal priceEach,
			short orderLineNumber) {
		this.id = id;
		this.orders = orders;
		this.products = products;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public OrderdetailsId getId() {
		return this.id;
	}

	public void setId(OrderdetailsId id) {
		this.id = id;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public int getQuantityOrdered() {
		return this.quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public BigDecimal getPriceEach() {
		return this.priceEach;
	}

	public void setPriceEach(BigDecimal priceEach) {
		this.priceEach = priceEach;
	}

	public short getOrderLineNumber() {
		return this.orderLineNumber;
	}

	public void setOrderLineNumber(short orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

}
