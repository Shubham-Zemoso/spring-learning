package com.zemoso.springdemo.mvc;


import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String Country;

    private LinkedHashMap<String, String> countryOptions;

    private String favoriteLanguage;

    private String[] operatingSystems;

    public Student() {
        // populate country options
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("IN", "India");
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favouriteLanguage) {
        this.favoriteLanguage = favouriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
