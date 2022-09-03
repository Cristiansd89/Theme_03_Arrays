package database;
// Generated 28 ene 2022 12:58:48 by Hibernate Tools 5.5.7.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Countries generated by hbm2java
 */
public class Countries implements java.io.Serializable {

	private Integer countryId;
	private Regions regions;
	private String name;
	private BigDecimal area;
	private Date nationalDay;
	private String countryCode2;
	private String countryCode3;
	private Set countryStatses = new HashSet(0);
	private Set countryLanguageses = new HashSet(0);

	public Countries() {
	}

	public Countries(Regions regions, BigDecimal area, String countryCode2, String countryCode3) {
		this.regions = regions;
		this.area = area;
		this.countryCode2 = countryCode2;
		this.countryCode3 = countryCode3;
	}

	public Countries(Regions regions, String name, BigDecimal area, Date nationalDay, String countryCode2,
			String countryCode3, Set countryStatses, Set countryLanguageses) {
		this.regions = regions;
		this.name = name;
		this.area = area;
		this.nationalDay = nationalDay;
		this.countryCode2 = countryCode2;
		this.countryCode3 = countryCode3;
		this.countryStatses = countryStatses;
		this.countryLanguageses = countryLanguageses;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Regions getRegions() {
		return this.regions;
	}

	public void setRegions(Regions regions) {
		this.regions = regions;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getArea() {
		return this.area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public Date getNationalDay() {
		return this.nationalDay;
	}

	public void setNationalDay(Date nationalDay) {
		this.nationalDay = nationalDay;
	}

	public String getCountryCode2() {
		return this.countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	public String getCountryCode3() {
		return this.countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public Set getCountryStatses() {
		return this.countryStatses;
	}

	public void setCountryStatses(Set countryStatses) {
		this.countryStatses = countryStatses;
	}

	public Set getCountryLanguageses() {
		return this.countryLanguageses;
	}

	public void setCountryLanguageses(Set countryLanguageses) {
		this.countryLanguageses = countryLanguageses;
	}

}
