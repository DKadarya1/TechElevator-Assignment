package com.techelevator.country;

import java.util.List;

public interface CountryDAO {
	
	// Create
	public boolean save(Country newCountry);

	// Retrieve
	public Country findCountryByCode(String countryCode);
	public List<Country> findCountryByContinent(String continent);
	public List<Country> findCountryByCountryCode(String[] countryCodes);

	// Update
	public boolean update(Country changedCountry);

	// Delete
	public boolean delete(String countryCode);

}
