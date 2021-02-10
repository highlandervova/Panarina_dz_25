package service;


import dao.CityDAO;
//<<<<<<< HEAD

import data.City;


import java.util.Collection;
import java.util.UUID;

import static util.StringUtil.isNotEmpty;

public class CityService<isNotEmpty> {

    public City addNewCity(String name,
                         Integer type
                                     ) {
        City c = new City(
                UUID.randomUUID().toString(),
                //this.id = id;
                name,
                type);
        return new CityDAO().add(c) ? c : null;
    }

    CityDAO cityDAO = new CityDAO();

    public boolean addTableCity( )
    {

        return new CityDAO().createTableCity() ;
    }

    public boolean checkAddCityParameters(String name,  Integer type) {
        return isNotEmpty(name) &&
                type != null && type >= 1 && type <= 3 ;
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
