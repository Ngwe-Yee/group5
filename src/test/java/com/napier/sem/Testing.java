package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Testing
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    // Unit Testing for if the city is null.
    @Test
    void printCityTestNull1()
    {
        app.printCountries(null);
        app.printCities7(null);
        app.printCities8(null);
        app.printCities9(null);
        app.printCities10(null);
        app.printCities11(null);
        app.printCities12(null);
        app.printAllCity13(null);
        app.printAllCity14(null);
        app.printAllCity15(null);
        app.printAllCity16(null);
        app.printAllCity17(null);
        app.printAllCity18(null);
        app.printAllCity19(null);
        app.printTopPopulatedCapitalCity20(null);
        app.printTopPopulatedCapitalCity21(null);
        app.printTopPopulatedCapitalCity22(null);
        app.printContinentPercentage23(null);
        app.printRegionPercentage24(null);
        app.printCountryPercentage(null);
    }

    // Unit Testing for if the city is empty.
    @Test
    void printCityEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printCities7(cities);
        app.printCities9(cities);
        app.printCities10(cities);
        app.printCities11(cities);
        app.printCities12(cities);
    }

    // Data are manually input for unit testing
    @Test
    void printCity()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City emp = new City();
        emp.Name = "Rangoon";
        emp.CountryCode = "MMR";
        emp.District = "Rangoon";
        emp.Population = 3361700;
        cities.add(emp);
        app.printCities9(cities);
    }

    // Unit Testing for if the city is null.
    @Test
    void printCountryTestNull()
    {
        app.printCountries(null);
    }

    // Unit Testing for if the city is empty.
    @Test
    void printCountryEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountries(countries);
    }

    // Data are manually input for unit testing
    @Test
    void printCountry()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country emp = new Country();
        emp.Code = "MMR";
        emp.Name = "Myanmar";
        emp.Continent = "Rangoon";
        emp.Region = "Asia";
        emp.Population = 45611000;
        emp.Capital = 2710;
        countries.add(emp);
        app.printCountries(countries);
    }
}