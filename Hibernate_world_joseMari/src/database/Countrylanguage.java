package database;
// Generated 20 ene 2022 10:51:37 by Hibernate Tools 5.5.7.Final

import java.math.BigDecimal;

/**
 * Countrylanguage generated by hbm2java
 */
public class Countrylanguage implements java.io.Serializable {

	private CountrylanguageId id;
	private Country country;
	private char isOfficial;
	private BigDecimal percentage;

	public Countrylanguage() {
	}

	public Countrylanguage(CountrylanguageId id, Country country, char isOfficial, BigDecimal percentage) {
		this.id = id;
		this.country = country;
		this.isOfficial = isOfficial;
		this.percentage = percentage;
	}

	public CountrylanguageId getId() {
		return this.id;
	}

	public void setId(CountrylanguageId id) {
		this.id = id;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public char getIsOfficial() {
		return this.isOfficial;
	}

	public void setIsOfficial(char isOfficial) {
		this.isOfficial = isOfficial;
	}

	public BigDecimal getPercentage() {
		return this.percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

}
