package dao;

import data.City;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CityDAO extends PostgreSqlDao {

    public Collection<City> getAllCity() {
        try (Connection c = getConnection(); Statement st = c.createStatement();) {
            ResultSet rs = st.executeQuery("SELECT * FROM public.city");
            Collection<City> out = new ArrayList<>();
            while (rs.next()) {
                out.add(new City (
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getInt("language")
                     ));
            }
            return out;
        } catch (Exception e) {
            System.out.println("Error get all city;");
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

      private List<String> options;
    public List<? extends Serializable> getAllCityJsp() {
        options = new ArrayList<>();
        try (Connection c = getConnection(); Statement st = c.createStatement();) {
            ResultSet rs = st.executeQuery("SELECT * FROM public.city");
            Collection<City> out = new ArrayList<>();
            while (rs.next()) {
                options.add(rs.getString("name") );
//                        rs.getString("name"),
//                        rs.getInt("language")
//                );
            }
            return options;
        } catch (Exception e) {
            System.out.println("Error get all city;");
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Collection<City> getByLanguage(int language) {
        try (Connection c = getConnection(); Statement st = c.createStatement();) {
            ResultSet rs = st.executeQuery("SELECT * FROM public.city WHERE language=" + language);
            Collection<City> out = new ArrayList<>();
            while (rs.next()) {
                out.add(new City(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getInt("language")));
            }
            return out;
        } catch (Exception e) {
            System.out.println("Error get city by language;");
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public boolean add(City city) {
        int count = 0;
        try (Connection c = getConnection(); Statement st = c.createStatement();) {
            count = st.executeUpdate(
                    "INSERT INTO public.city VALUES(\'"+city.getId()+"\', \'"+city.getName()+
                    "\',\' "+city.getLanguage()+"\')");

        } catch (Exception e) {
            System.out.println("Error save city;");
            e.printStackTrace();
        }
        return count > 0;
    }


    public boolean createTableCity() {

        try (Connection c = getConnection(); Statement st = c.createStatement();) {
            st.executeUpdate("CREATE TABLE IF NOT EXISTS public.city (id varchar (50) PRIMARY KEY ," +
                    "name varchar(1024) NOT NULL," +
                    "language int NOT NULL)" );
//"picture varchar(1024))");


        } catch (Exception e) {
            System.out.println("Error save city;");
            e.printStackTrace();
        }
        return true;
    }

}
