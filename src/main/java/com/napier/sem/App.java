package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args) throws SQLException {
        // Create new Application
        App a = new App();

        // Connect to database
        if (args.length < 1)
        {
            a.connect("localhost:33060");
        }

        else
        {
            a.connect(args[0]);
        }

        // Extract Country information
        ArrayList<Country> country1= a.getAllCountries1();

        ArrayList<Country> country2 = a.getAllCountries2();

        ArrayList<Country> country3 = a.getAllCountries3();

        ArrayList<Country> country4 = a.getAllCountries4();

        ArrayList<Country> country5 = a.getAllCountries5();

        ArrayList<Country> country6 = a.getAllCountries6();

        ArrayList<City> city7 = a.getAllCity7();

        ArrayList<City> city8 = a.getAllCity8();

        ArrayList<City> city9 = a.getAllCity9();

        ArrayList<City> city10 = a.getAllCity10();

        ArrayList<City> city11 = a.getAllCity11();

        ArrayList<City> city12 = a.getAllCity12(10);

        ArrayList<City> city13 = a.getAllCity13();

        ArrayList<City> city14 = a.getAllCity14();

        ArrayList<City> city15 =a.getAllCity15();

        ArrayList<City> city16 =a.getAllCity16();

        ArrayList<City> city17 =a.getAllCapitalcity17();

        ArrayList<City> city18 =a.getAllCapitalcity18();

        ArrayList<City> city19 =a.getAllCapitalcity19();

        ArrayList<City> city20 =a.getTopPopulatedCaptialcity20(10);

        ArrayList<City> city21 =a.getTopPopulatedCaptialcity21(10);

        ArrayList<City> city22 =a.getTopPopulatedCaptialcity22(10);

        ArrayList<Population> percent_continent23 = a.getContinentPercentage23();

        ArrayList<Population> percent_region24 = a.getRegionPercentage24();

        ArrayList<Population> percent_country25 = a.getCountryPercentage25();

        Long world_population26 = a.getWorldPopulation();

        ArrayList<Country> continents27 = a.getContinentPopulation();

        ArrayList<Country> region28 = a.getRegionList();

        ArrayList<Country> country29 = a.getCountryList();

        ArrayList<City> district30 = a.getDistrictPopulation();

        ArrayList<City> city31 = a.getCityPopulation();



        // Print Headers
        System.out.println("# 1. All the countries in the world organised by largest population to smallest #\n");
        a.printCountries(country1);

        System.out.println("# 2. All the countries in a continent organised by largest population to smallest. #\n");
        a.printCountries(country2);

        System.out.println("# 3. All the countries in a region organised by largest population to smallest. #\n");
        a.printCountries(country3);

        System.out.println("# 4. The top N populated countries in the world where N is provided by the user. #\n");
        a.printCountries(country4);

        System.out.println("# 5. The top N populated countries in a continent where N is provided by the user. #\n");
        a.printCountries(country5);

        System.out.println("# 6. The top N populated countries in a region where N is provided by the user. #\n");
        a.printCountries(country6);

        System.out.println("# 7. All the cities in the world organised by largest population to smallest. #\n");
        a.printCities7(city7);

        System.out.println("# 8. All the cities in a continent organised by largest population to smallest. #\n");
        a.printCities8(city8);

        System.out.println(("# 9. All the cities in a region organised by largest population to smallest. #\n"));
        a.printCities9(city9);

        System.out.println(("# 10. All the cities in a country organised by largest population to smallest. #\n"));
        a.printCities10(city10);

        System.out.println(("# 11. All the cities in a district organised by largest population to smallest. #\n"));
        a.printCities11(city11);

        System.out.println(("# 12. The top N populated cities in the world where N is provided by the user. #\n"));
        a.printCities12(city12);

        System.out.println("# 13. The top N populated cities in a continent where N is provided by the user. #\n");
        a.printAllCity13(city13);

        System.out.println("# 14. The top N populated cities in a region where N is provided by the user. #\n");
        a.printAllCity14(city14);

        System.out.println("# 15. The top N populated cities in a country where N is provided by the user. #\n");
        a.printAllCity15(city15);

        System.out.println("# 16. The top N populated cities in a district where N is provided by the user. #\n");
        a.printAllCity16(city16);

        System.out.println("# 17. All the capital cities in the world organised by largest population to smallest. #\n");
        a.printAllCity17(city17);

        System.out.println("# 18. All the capital cities in a continent organised by largest population to smallest. #\n");
        a.printAllCity18(city18);

        System.out.println("# 19. All the capital cities in a region organised by largest to smallest. #\n");
        a.printAllCity19(city19);

        System.out.println("# 20. The top N populated capital cities in the world where N is provided by the user. #\n");
        a.printTopPopulatedCapitalCity20(city20);

        System.out.println("# 21. The top N populated capital cities in a continent where N is provided by the user. #\n");
        a.printTopPopulatedCapitalCity21(city21);

        System.out.println("# 22. The top N populated capital cities in a region where N is provided by the user. #\n");
        a.printTopPopulatedCapitalCity22(city22);

        System.out.println("# 23. The population of people, people living in cities, and people not living in cities in each continent. #\n");
        a.printContinentPercentage23(percent_continent23);

        System.out.println("\n # 24. The population of people, people living in cities, and people not living in cities in each region. #\n");
        a.printRegionPercentage24(percent_region24);

        System.out.println("\n # 25. The population of people, people living in cities, and people not living in cities in each country. #\n");
        a.printRegionPercentage24(percent_country25);

        System.out.println("\n# 26. The population of the world. #\n");
        a.printWorldPopulation(world_population26);

        System.out.println("\n# 27. The population of a continent. #\n");
        a.printAllContinents(continents27);

        System.out.println("\n# 28. The population of a region. #\n");
        a.printAllRegion(region28);

        System.out.println("\n# 29. The population of a country. #\n");
        a.printAllCountries(country29);

        System.out.println("\n# 30. The population of a district. #\n");
        a.printDistrictPopulation(district30);

        System.out.println("\n# 31. The population of a city. #\n");
        a.printCityPopulation(city31);

        System.out.println("\n# 32. Languages #\n");
        a.getLanguages();

        // Disconnect from database
        a.disconnect();
    }
    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect(String location)
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://" + location + "/world?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
                System.out.println("Successfully connected !!!");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<Country> getAllCountries1()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT *"
                            + "FROM country "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();
                emp.Name = rset.getString("Name");
                emp.Code = rset.getString("Code");
                emp.Continent = rset.getString("Continent");
                emp.Region = rset.getString("Region");
                emp.Population = rset.getInt("Population");
                country.add(emp);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<Country> getAllCountries2()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Code, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Continent = 'Asia'"
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();
                emp.Name = rset.getString("Name");
                emp.Code = rset.getString("Code");
                emp.Continent = rset.getString("Continent");
                emp.Region = rset.getString("Region");
                emp.Population = rset.getInt("Population");
                emp.Capital = rset.getInt("Capital");
                country.add(emp);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<Country> getAllCountries3()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Code, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Region = 'Southeast Asia'"
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();
                emp.Name = rset.getString("Name");
                emp.Code = rset.getString("Code");
                emp.Continent = rset.getString("Continent");
                emp.Region = rset.getString("Region");
                emp.Population = rset.getInt("Population");
                emp.Capital = rset.getInt("Capital");
                country.add(emp);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }
    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<Country> getAllCountries4()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Code, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC limit 10 ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();
                emp.Name = rset.getString("Name");
                emp.Code = rset.getString("Code");
                emp.Continent = rset.getString("Continent");
                emp.Region = rset.getString("Region");
                emp.Population = rset.getInt("Population");
                emp.Capital = rset.getInt("Capital");
                country.add(emp);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<Country> getAllCountries5()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Code, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Continent = 'Asia'"
                            + "ORDER BY Population DESC limit 10 ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();
                emp.Name = rset.getString("Name");
                emp.Code = rset.getString("Code");
                emp.Continent = rset.getString("Continent");
                emp.Region = rset.getString("Region");
                emp.Population = rset.getInt("Population");
                emp.Capital = rset.getInt("Capital");
                country.add(emp);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<Country> getAllCountries6()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Code, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Region = 'Southeast Asia'"
                            + "ORDER BY Population DESC limit 10 ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country emp = new Country();
                emp.Name = rset.getString("Name");
                emp.Code = rset.getString("Code");
                emp.Continent = rset.getString("Continent");
                emp.Region = rset.getString("Region");
                emp.Population = rset.getInt("Population");
                emp.Capital = rset.getInt("Capital");
                country.add(emp);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public void printCountries(ArrayList<Country> countries)
    {
        if (countries == null) {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-40s %-30s %-38s %-30s %-40s","Code", "NAME", "CONTINENT", "REGION", "POPULATION", "CAPITAL"));
        // Lines for table
        System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
        // Loop over all countries in the list
        for (Country emp : countries)
        {
            String emp_string = String.format("%-10s %-40s %-30s %-38s %-30s %-40s", emp.Code, emp.Name, emp.Continent, emp.Region, emp.Population, emp.Capital);
            System.out.println(emp_string);
        }
        // Closing line
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }


    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<City> getAllCity7()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * "
                            + "FROM city "
                            + "ORDER BY Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City emp = new City();
                emp.Name = rset.getString("Name");
                emp.CountryCode = rset.getString("CountryCode");
                emp.District = rset.getString("District");
                emp.Population = rset.getInt("Population");
                city.add(emp);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public void printCities7(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-50s %-50s %-50s ","NAME", "COUNTRY", "DISTRICT", "POPULATION"));
        // Lines for table
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        // Loop over all countries in the list
        for (City emp : cities)
        {
            String emp_string = String.format("%-50s %-50s %-50s %-50s", emp.Name, emp.CountryCode, emp.District, emp.Population);
            System.out.println(emp_string);
        }
        // Closing line
        System.out.println("*****************************************************************************************************************************************************************************************************\n");
    }

    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<City> getAllCity8()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code "
                            + "AND country.Continent = 'Asia' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City emp = new City();
                emp.Name = rset.getString("city.Name");
                emp.CountryCode = rset.getString("city.CountryCode");
                emp.District = rset.getString("city.District");
                emp.Population = rset.getInt("city.Population");
                city.add(emp);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public void printCities8(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-50s %-50s %-50s ","NAME", "COUNTRY", "DISTRICT", "POPULATION"));
        // Lines for table
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        // Loop over all countries in the list
        for (City emp : cities)
        {
            String emp_string = String.format("%-50s %-50s %-50s %-50s", emp.Name, emp.CountryCode, emp.District, emp.Population);
            System.out.println(emp_string);
        }
        // Closing line
        System.out.println("*****************************************************************************************************************************************************************************************************\n");
    }


    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<City> getAllCity9()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code "
                            + "AND country.Region = 'Eastern Europe' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City emp = new City();
                emp.Name = rset.getString("city.Name");
                emp.CountryCode = rset.getString("city.CountryCode");
                emp.District = rset.getString("city.District");
                emp.Population = rset.getInt("city.Population");
                city.add(emp);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public void printCities9(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-50s %-50s %-50s ","NAME", "COUNTRY", "DISTRICT", "POPULATION"));
        // Lines for table
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        // Loop over all countries in the list
        for (City emp : cities)
        {
            if (emp == null)
                continue;
            String emp_string = String.format("%-50s %-50s %-50s %-50s", emp.Name, emp.CountryCode, emp.District, emp.Population);
            System.out.println(emp_string);
        }
        // Closing line
        System.out.println("*****************************************************************************************************************************************************************************************************\n");
    }

    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<City> getAllCity10()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code "
                            + "AND country.Name = 'Myanmar' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City emp = new City();
                emp.Name = rset.getString("city.Name");
                emp.CountryCode = rset.getString("city.CountryCode");
                emp.District = rset.getString("city.District");
                emp.Population = rset.getInt("city.Population");
                city.add(emp);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public void printCities10(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-50s %-50s %-50s ","NAME", "COUNTRY", "DISTRICT", "POPULATION"));
        // Lines for table
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        // Loop over all countries in the list
        for (City emp : cities)
        {
            if (emp == null)
                continue;
            String emp_string = String.format("%-50s %-50s %-50s %-50s", emp.Name, emp.CountryCode, emp.District, emp.Population);
            System.out.println(emp_string);
        }
        // Closing line
        System.out.println("*****************************************************************************************************************************************************************************************************\n");
    }
    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<City> getAllCity11()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code "
                            + "AND city.District = 'Texas' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City emp = new City();
                emp.Name = rset.getString("city.Name");
                emp.CountryCode = rset.getString("city.CountryCode");
                emp.District = rset.getString("city.District");
                emp.Population = rset.getInt("city.Population");
                city.add(emp);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }

    /**
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public void printCities11(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-50s %-50s %-50s ","NAME", "COUNTRY", "DISTRICT", "POPULATION"));
        // Lines for table
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        // Loop over all countries in the list
        for (City emp : cities)
        {
            if (emp == null)
                continue;
            String emp_string = String.format("%-50s %-50s %-50s %-50s", emp.Name, emp.CountryCode, emp.District, emp.Population);
            System.out.println(emp_string);
        }
        // Closing line
        System.out.println("*****************************************************************************************************************************************************************************************************\n");
    }
    /**
     * Gets all the country data.
     * @return taking data from the mysql data.
     */
    public ArrayList<City> getAllCity12(int no)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * "
                            + "FROM city "
                            + "ORDER BY Population DESC LIMIT " + no;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City emp = new City();
                emp.Name = rset.getString("Name");
                emp.CountryCode = rset.getString("CountryCode");
                emp.District = rset.getString("District");
                emp.Population = rset.getInt("Population");
                city.add(emp);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get Country details");
            return null;
        }
    }
    /**
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public void printCities12(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-50s %-50s %-50s ","NAME", "COUNTRY", "DISTRICT", "POPULATION"));
        // Lines for table
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        // Loop over all countries in the list
        for (City emp : cities)
        {
            String emp_string = String.format("%-50s %-50s %-50s %-50s", emp.Name, emp.CountryCode, emp.District, emp.Population);
            System.out.println(emp_string);
        }
        // Closing line
        System.out.println("*****************************************************************************************************************************************************************************************************\n");
    }

    /**
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public ArrayList<City> getAllCity13()
    {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<City> city13 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city13.add(cty);
            }
            return city13;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city continent details");
            return null;
        }


    }

    public void printAllCity13(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all city in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : getAllCity13())
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }


    //Top 10 populated cities in a region
    public ArrayList<City> getAllCity14()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Region = 'Eastern Asia'"
                            + "ORDER BY city.Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city14 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city14.add(cty);
            }
            return city14;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }
    public void printAllCity14(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : getAllCity14())
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }

    public ArrayList<City> getAllCity15()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND country.Name = 'China'"
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city15 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city15.add(cty);
            }
            return city15;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }
    public void printAllCity15(ArrayList<City> cities)
    {
        if (cities == null) {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : getAllCity15())
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }

    //Top 10 populated cities in a district
    public ArrayList<City> getAllCity16()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.CountryCode = country.Code AND city.District = 'Kabol'"
                            + "ORDER BY city.Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city16 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city16.add(cty);
            }
            return city16;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }
    public void printAllCity16(ArrayList<City> citydistrictlimit10)
    {
        if (citydistrictlimit10 == null)
        {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : citydistrictlimit10)
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }
    public void printAllCity17(ArrayList<City> citydistrictlimit10)
    {
        if (citydistrictlimit10 == null)
        {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : getAllCapitalcity17())
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }
    public ArrayList<City> getAllCapitalcity17()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.ID = country.Capital "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city16 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city16.add(cty);
            }
            return city16;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }
    public void printAllCity18(ArrayList<City> citydistrictlimit10)
    {
        if (citydistrictlimit10 == null)
        {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : getAllCapitalcity18())
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }
    public ArrayList<City> getAllCapitalcity18()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.ID = country.Capital AND country.Continent = 'Asia' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city16 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city16.add(cty);
            }
            return city16;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }
    public void printAllCity19(ArrayList<City> citydistrictlimit10)
    {
        if (citydistrictlimit10 == null)
        {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : getAllCapitalcity19())
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }
    public ArrayList<City> getAllCapitalcity19()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.ID = country.Capital AND country.Region = 'Southeast Asia' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city16 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city16.add(cty);
            }
            return city16;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }
    public void printTopPopulatedCapitalCity20(ArrayList<City> citydistrictlimit10)
    {
        if (citydistrictlimit10 == null)
        {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : citydistrictlimit10 )
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }

    public ArrayList<City> getTopPopulatedCaptialcity20(int num)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.ID = country.Capital "
                            + "ORDER BY city.Population DESC LIMIT " + num ;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city16 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city16.add(cty);
            }
            return city16;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printTopPopulatedCapitalCity21(ArrayList<City> citydistrictlimit10)
    {
        if (citydistrictlimit10 == null)
        {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : citydistrictlimit10 )
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }

    public ArrayList<City> getTopPopulatedCaptialcity21(int num)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.ID = country.Capital AND country.Continent = 'Asia'"
                            + "ORDER BY city.Population DESC LIMIT " + num ;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city21 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city21.add(cty);
            }
            return city21;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printTopPopulatedCapitalCity22(ArrayList<City> citydistrictlimit10)
    {
        if (citydistrictlimit10 == null)
        {
            System.out.println("There is no data!");
            return;
        }
        // Print header
        System.out.println(String.format("%-25s %-25s %-35s %25s" , "Name", "CountryCode", "District", "Population"));
        // Loop over all cities in the list
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
        for (City cty : citydistrictlimit10 )
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }

    public ArrayList<City> getTopPopulatedCaptialcity22(int num)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.District, city.District, city.Population, country.Code, country.Continent  "
                            + "FROM city, country WHERE city.ID = country.Capital AND country.Region = 'Southeast Asia'"
                            + "ORDER BY city.Population DESC LIMIT " + num ;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city22 = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.Name = rset.getString("Name");
                cty.CountryCode = rset.getString("CountryCode");
                cty.District = rset.getString("District");
                cty.Population = rset.getInt("Population");
                city22.add(cty);
            }
            return city22;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public Long getWorldPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population) FROM country";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            Long population = new Long(0);
            while (rset.next())
            {
                population = rset.getLong("SUM(Population)");
            }
            return population;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    // Get the All City Population to calculate the percentage

    public Long getAllCityPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(city.Population),city.CountryCode, country.Code, country.Continent FROM city,country " +
                            "WHERE city.CountryCode = country.Code GROUP BY country.Continent";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            Long population = new Long(0);
            while (rset.next())
            {
                population = rset.getLong("SUM(city.Population)");
            }
            return population;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printWorldPopulation(Long population)
    {
        if (population == null)
        {
            System.out.println("No data!!");
            return;
        }
            System.out.println("The population of the world" + ": " + population);
    }

    public ArrayList<Country> getRegionList()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population), Region FROM country GROUP BY Region ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<Country> regions = new ArrayList<Country>();
            while (rset.next())
            {
                Country regs = new Country();
                regs.Region = rset.getString("Region");
                regs.Population= rset.getLong("SUM(Population)");
                regions.add(regs);
            }
            return regions;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printAllRegion(ArrayList<Country> regions)
    {
        if (regions == null)
        {
            System.out.println("No data!!");
            return;
        }
        for (Country reg : regions)
        {
            System.out.println("The population of Region=>" +reg.Region+ ": " + reg.Population);
        }
    }

    public ArrayList<Country> getCountryList()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Population, Name FROM country";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country cunts = new Country();
                cunts.Name = rset.getString("Name");
                cunts.Population = rset.getLong("Population");
                countries.add(cunts);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printAllCountries(ArrayList<Country> countries)
    {
        if (countries == null)
        {
            System.out.println("No data!!");
            return;
        }
        for (Country cunt : countries)
        {
            System.out.println("The population of Country=>" +cunt.Name+ ": "+ cunt.Population);
        }
    }

    public ArrayList<Country> getContinentPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population),Continent FROM country GROUP BY Continent";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<Country> continents = new ArrayList<Country>();
            while (rset.next())
            {
                Country cont = new Country();
                cont.Continent = rset.getString("Continent");
                cont.Population = rset.getLong("SUM(Population)");
                continents.add(cont);
            }
            return continents;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printAllContinents(ArrayList<Country> continents)
    {
        if (continents == null)
        {
            System.out.println("No data!!");
            return;
        }
        for (Country cont : continents)
        {
            System.out.println("The population of Continent=>" +cont.Continent+ ": " + cont.Population);
        }
    }

    public ArrayList<City> getDistrictPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(Population),District FROM city GROUP BY District";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> dpop = new ArrayList<City>();
            while (rset.next())
            {
                City cont = new City();
                cont.District = rset.getString("District");
                cont.Population = rset.getLong("SUM(Population)");
                dpop.add(cont);
            }
            return dpop;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printDistrictPopulation(ArrayList<City> dpop)
    {
        if (dpop == null)
        {
            System.out.println("No data!!");
            return;
        }
        for (City cont : dpop)
        {
            System.out.println("The population of a District=>" +cont.District+ ": " + cont.Population);
        }
    }

    public ArrayList<City> getCityPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Population,Name FROM city";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> cpop = new ArrayList<City>();
            while (rset.next())
            {
                City cont = new City();
                cont.Name = rset.getString("Name");
                cont.Population = rset.getLong("Population");
                cpop.add(cont);
            }
            return cpop;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printCityPopulation(ArrayList<City> cpop)
    {
        if (cpop == null)
        {
            System.out.println("No data!!");
            return;
        }
        for (City cont : cpop)
        {
            System.out.println("The population of a City=>" +cont.Name+ ": " + cont.Population);
        }
    }

    public ArrayList<Population> getContinentPercentage23() throws SQLException {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT COUNT(Name), Continent FROM country GROUP BY Continent ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Languages information
            ArrayList<Population> percentcont = new ArrayList<Population>();
            ArrayList<String> name = new ArrayList<String>();
            while (rset.next()) {
                name.add(rset.getString("Continent"));
            }
            for(String continent_detail:name){
                Population contpopu =  new Population();
                ArrayList<String> contname = new ArrayList<String>();
                Long total = new Long (0);
                Long popcity = new Long (0);
                contpopu.Name = continent_detail;
                String totalpop = "SELECT Code, Population FROM country WHERE Continent = '" + continent_detail +"'";
                ResultSet rset1 = stmt.executeQuery(totalpop);
                while (rset1.next())
                {
                    contname.add(rset1.getString("Code"));
                    Long total1 = rset1.getLong("Population");
                    total = Long.sum(total,total1);
                }
                for(String country_code: contname){
                    String strSelect1 = "SELECT sum(Population) as popcity FROM city WHERE CountryCode = '"+ country_code + "' Group By CountryCode";
                    Long cccity = getCityPopulation(strSelect1);
                    popcity = Long.sum(popcity,cccity);
                }
                contpopu.Total = total;
                contpopu.CityPopulation = popcity;
                percentcont.add(contpopu);
            }
            return percentcont;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get detail");
            return null;
        }
    }

    public ArrayList<Population> getRegionPercentage24() throws SQLException {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT COUNT(Name), Region FROM country GROUP BY Region ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Languages information
            ArrayList<Population> percentcont = new ArrayList<Population>();
            ArrayList<String> name = new ArrayList<String>();
            while (rset.next()) {
                name.add(rset.getString("Region"));
            }
            for(String region_detail:name){
                Population contpopu =  new Population();
                ArrayList<String> contname = new ArrayList<String>();
                Long total = new Long (0);
                Long popcity = new Long (0);
                contpopu.Name = region_detail;
                String strSelect1 = "SELECT Code, Population FROM country WHERE Region = '" + region_detail +"'";
                ResultSet rset1 = stmt.executeQuery(strSelect1);
                while (rset1.next())
                {
                    contname.add(rset1.getString("Code"));
                    Long total1 = rset1.getLong("Population");
                    total = Long.sum(total,total1);
                }
                for(String country_code: contname){
                    String strSelect2 = "SELECT sum(Population) as popcity FROM city WHERE CountryCode = '"+ country_code + "' Group By CountryCode";
                    Long cccity = getCityPopulation(strSelect2);
                    popcity = Long.sum(popcity,cccity);
                }
                contpopu.Total = total;
                contpopu.CityPopulation = popcity;
                percentcont.add(contpopu);
            }
            return percentcont;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get detail");
            return null;
        }
    }

    public ArrayList<Population> getCountryPercentage25()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Name, country.Population, sum(city.Population) FROM country, city WHERE country.Code = city.CountryCode Group By country.Code";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<Population> country_popu = new ArrayList<Population>();
            while (rset.next())
            {
                Population cont = new Population();
                cont.Name = rset.getString("country.Name");
                cont.CityPopulation = rset.getLong("sum(city.Population)");
                cont.Total = rset.getLong("country.Population");
                country_popu.add(cont);
            }
            return country_popu;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

    public void printCountryPercentage(ArrayList<Population> country_pop)
    {
        if (country_pop == null)
        {
            System.out.println("No data!!");
            return;
        }
        for (Population cont : country_pop)
        {
            Long percent_calculation = cont.CityPopulation*100/cont.Total;
            Long not_living_percentage = 100 - percent_calculation;
            System.out.println("The total population of " +cont.Name+ " living in cities is " + percent_calculation+ "%" + " and not living in cities is " + not_living_percentage + "%.");
        }
    }

    public Long getCityPopulation(String city_popu)
    {
        try {
            Long city_popus = new Long (0);
            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery(city_popu);
            while (rset.next())
            {
                Long Population = rset.getLong("popcity");
                city_popus = Long.sum(city_popus, Population);
            }
            return city_popus;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to total Population of people who living in city or not.");
            return null;
        }
    }

    public void printContinentPercentage23(ArrayList<Population> contpercent)
    {
        if (contpercent == null)
        {
            System.out.println("No data!!");
            return;
        }
        for (Population cont : contpercent)
        {
            if (cont.Total != 0)
            {
                Long percent_calculation = cont.CityPopulation*100/cont.Total;
                Long not_living_percentage = 100 - percent_calculation;
                System.out.println("The total population of " +cont.Name+ " living in cities is " + percent_calculation+ "%" + " and not living in cities is " + not_living_percentage + "%.");
            }
        }
    }

    public void printRegionPercentage24(ArrayList<Population> regpercent)
    {
    if (regpercent == null)
    {
        System.out.println("No data!!");
        return;
    }
    for (Population cont : regpercent)
    {
        if (cont.Total != 0)
        {
            Long percent_calculation = cont.CityPopulation*100/cont.Total;
            Long not_living_percentage = 100 - percent_calculation;
            System.out.println("The total population of " +cont.Name+ " living in cities is " + percent_calculation+ "%" + " and not living in cities is " + not_living_percentage + "%.");
        }
    }
    }

    public Long getLanguages()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String[] language = {"English", "Chinese" , "Hindi", "Spanish", "Arabic" };
            for (String percent: language)
            {
                String strSelect =
                        "SELECT countrylanguage.Language,ANY_VALUE(countrylanguage.Percentage),SUM(countrylanguage.Percentage*country.Population/100) as rs,ANY_VALUE(country.Population), ANY_VALUE(countrylanguage.CountryCode), SUM(country.Population) as total,ANY_VALUE(country.Name) FROM country,countrylanguage " +
                                "WHERE countrylanguage.CountryCode = country.Code AND countrylanguage.Language = '" + percent + "'";
                // Execute SQL statement
                ResultSet rset = stmt.executeQuery(strSelect);
                Long real_speaker = new Long(0);
                while (rset.next()) {
                    real_speaker = rset.getLong("rs");
                }
                Long calculation = real_speaker * 100 / getWorldPopulation();
                System.out.println("The world percentage of speaking " + percent + " is " + calculation + "%.");
            }
            return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city region details");
            return null;
        }
    }

}
