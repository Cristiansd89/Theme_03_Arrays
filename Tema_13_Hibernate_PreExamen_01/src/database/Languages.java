package database;
// Generated 16 feb 2022 16:50:26 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Languages generated by hbm2java
 */
public class Languages implements java.io.Serializable {

	private Integer languageId;
	private String language;
	private Set countryLanguageses = new HashSet(0);

	public Languages() {
	}

	public Languages(String language) {
		this.language = language;
	}

	public Languages(String language, Set countryLanguageses) {
		this.language = language;
		this.countryLanguageses = countryLanguageses;
	}

	public Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Set getCountryLanguageses() {
		return this.countryLanguageses;
	}

	public void setCountryLanguageses(Set countryLanguageses) {
		this.countryLanguageses = countryLanguageses;
	}

}
