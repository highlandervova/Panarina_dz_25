package servlet;



import dao.CityDAO;
import enums.RedirectPath;
import enums.RequestParameter;
import enums.Title;
import service.CityService;
import service.HtmlService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddCityServlet extends HttpServlet {
    CityService cityService = new CityService();
    HtmlService htmlService = new HtmlService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(htmlService.getAddCity(Title.ADD_CITY.getValue(), cityService.getAllCity()));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter(RequestParameter.NAME.getValue());

        //Integer language = Integer.valueOf(req.getParameter(RequestParameter.LANGUAGE.getValue()));



        String language = req.getParameter(RequestParameter.LANGUAGE.getValue());

        String add1 = "";

        add1 = req.getParameter(RequestParameter.BOTTON.getValue());



        if (add1!=null ) {

            //carService.addNewCar(name, description, type, price, picture);
            cityService.addTableCity();
            resp.sendRedirect(RedirectPath.FIRST_PAGE.getValue());
        }  else {

       //"AddCity"

            resp.sendRedirect(RedirectPath.FIRST_PAGE.getValue());

            int language1= Integer.parseInt(language);

            if (cityService.checkAddCityParameters(name, language1)) {
                cityService.addNewCity(name, language1);
            }


            }
        }




       // resp.sendRedirect(RedirectPath.FIRST_PAGE.getValue());

}
/*
    if (


                          req.getParameter(RequestParameter.TYPE.getValue()) == null )


            {
                out.println(htmlService.getMainPage(Title.MAIN_PAGE.getValue(), carService.getAllCars()));
            }
            else
            {


            type =   Integer.parseInt(req.getParameter(RequestParameter.TYPE.getValue()));
            out.println(htmlService.getMainPage(Title.MAIN_PAGE.getValue(), carService.getByType(type)));


        } }
        else {
            resp.sendRedirect(RedirectPath.AUTH_PAGE.getValue());
        }
    }
 */