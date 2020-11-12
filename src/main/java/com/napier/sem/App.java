package com.napier.sem;

import com.mysql.jdbc.StringUtils;

import java.sql.*;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Extract employee salary information
        ArrayList<Country> country1= a.getAllCountries1();

        ArrayList<Country> country2 = a.getAllCountries2();

        ArrayList<Country> country3 = a.getAllCountries3();

        System.out.println("# All the countries in the world organised by largest population to smallest #\n");
        a.printCountries(country1);

        System.out.println("# All the countries in a continent organised by largest population to smallest. #\n");
        a.printCountries(country2);

        System.out.println("# All the countries in a region organised by largest population to smallest. #\n");
        a.printCountries(country3);

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
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 100;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected!!\n");
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
                    "SELECT Name, Continent, Region, Population "
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
     * Prints a list of All the countries in the world organised by largest population to smallest.
     */
    public void printCountries(ArrayList<Country> countries)
    {
        // Print header
        System.out.println(String.format("%-50s %-50s %-50s %-50s", "POPULATION", "NAME", "REGION", "CONTINENT"));
        // Lines for table
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________");
        // Loop over all countries in the list
        for (Country emp : countries)
        {
            String emp_string = String.format("%-50s %-50s %-50s %-50s", emp.Population, emp.Name, emp.Region, emp.Continent);
            System.out.println(emp_string);
        }
        // Closing line
        System.out.println("*************************************************************************************************************************************************************************************************\n");
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
                    "SELECT Name, Continent, Region, Population "
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
    public ArrayList<Country> getAllCountries3()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Name, Continent, Region, Population "
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


}
