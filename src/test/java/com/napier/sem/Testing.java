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
    void printCityTestNull()
    {
        app.printCities9(null);
    }

    // Unit Testing for if the city is empty.
    @Test
    void printCityEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printCities9(cities);
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
}