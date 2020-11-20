package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
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
        a.printCities11(city12);

        System.out.println("# 13. The top N populated cities in a continent where N is provided by the user. #\n");
        a.printAllCity13(city13);

        System.out.println("# 14. The top N populated cities in a region where N is provided by the user. #\n");
        a.printAllCity14(city14);

        System.out.println("# 15. The top N populated cities in a country where N is provided by the user. #\n");
        a.printAllCity15(city15);

        System.out.println("# 16. The top N populated cities in a district where N is provided by the user. #\n");
        a.printAllCity16(city16);

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
        for (City cty : getAllCity16())
        {
            String cty_string =
                    String.format("%-25s %-25s %-35s %25s",
                            cty.Name, cty.CountryCode, cty.District, cty.Population);
            System.out.println(cty_string);
        }
        System.out.println("*************************************************************************************************************************************************************************************************\n");
    }


}
