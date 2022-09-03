package database;
// Generated 7 mar 2022 11:41:15 by Hibernate Tools 5.6.3.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Products generated by hbm2java
 */
public class Products implements java.io.Serializable {

	private String productCode;
	private Productlines productlines;
	private String productName;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private short quantityInStock;
	private BigDecimal buyPrice;
	private BigDecimal msrp;
	private Set orderdetailses = new HashSet(0);

	public Products() {
	}

	public Products(String productCode, Productlines productlines, String productName, String productScale,
			String productVendor, String productDescription, short quantityInStock, BigDecimal buyPrice,
			BigDecimal msrp) {
		this.productCode = productCode;
		this.productlines = productlines;
		this.productName = productName;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
	}

	public Products(String productCode, Productlines productlines, String productName, String productScale,
			String productVendor, String productDescription, short quantityInStock, BigDecimal buyPrice,
			BigDecimal msrp, Set orderdetailses) {
		this.productCode = productCode;
		this.productlines = productlines;
		this.productName = productName;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
		this.orderdetailses = orderdetailses;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Productlines getProductlines() {
		return this.productlines;
	}

	public void setProductlines(Productlines productlines) {
		this.productlines = productlines;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductScale() {
		return this.productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return this.productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public short getQuantityInStock() {
		return this.quantityInStock;
	}

	public void setQuantityInStock(short quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public BigDecimal getBuyPrice() {
		return this.buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public BigDecimal getMsrp() {
		return this.msrp;
	}

	public void setMsrp(BigDecimal msrp) {
		this.msrp = msrp;
	}

	public Set getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

}
