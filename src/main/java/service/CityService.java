package service;


import dao.CityDAO;
//<<<<<<< HEAD

import data.City;


import java.util.Collection;
import java.util.UUID;

import static util.StringUtil.isNotEmpty;

public class CityService<isNotEmpty> {

    public City addNewCity( String name, int language ) {
        City c = new City(
                UUID.randomUUID().toString(),
                //this.id = id;
                name.toString(),
                language);
        return new CityDAO().add(c) ? c : null;
    }

    CityDAO cityDAO = new CityDAO();

    public boolean addTableCity( )
    {

        return new CityDAO().createTableCity() ;
    }

    public boolean checkAddCityParameters(String name,  Integer language) {
        return isNotEmpty(name) &&
                language != null && language >= 1 && language <= 3 ;
    }

//    public City addNewCity(String name, Integer type) {
//        City c = new City(UUID.randomUUID().toString(), name, type);
//        return cityDAO.add(c) ? c : null;
//    }

    public Collection<City> getAllCity() {
        return cityDAO.getAllCity();
    }



    public Collection<City> getByLanguage(int language) { return cityDAO.getByLanguage(language); }

//>>>>>>> e98ff8f9a5ffe716c1db14414f3fcaf9db0da30d
}
