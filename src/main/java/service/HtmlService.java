package service;

import enums.CityLanguage;
import enums.RedirectPath;

import java.util.Collection;


import data.City;

public class HtmlService {

//        public String getMainPage(String title, Collection<City> city) {
//            StringBuilder out = new StringBuilder();
//            out.append(getHead(title));
//            out.append("<h1>Car Dealer Shop</h1>");
//            out.append("<table><tr><th>NAME</th><th>TYPE</th><th>PRICE</th><th>DESCRIPTION</th><th>PICTURE</th></tr>");
//            for (City c : city) {
//                out.append("<tr> <td>");
//                out.append(c.getName());
////            out.append("</td><td>");
////            out.append("<a href='");
////            out.append(RedirectPath.DETAIL_PAGE.getValue());
////            out.append("?id=");
////            out.append(c.getId());
////            out.append("'><img style='width: 100px;' src='");
////            out.append(c.getPicture());
////            out.append("' alt='No Picture'/></a>");
////            out.append("</td></tr>");
//                out.append("</td><td>");
//                out.append("<a href='");
//                out.append(RedirectPath.FIRST_PAGE.getValue());
//                //htmlService.getMainPage(Title.MAIN_PAGE.getValue(), carService.getAllCars()
//                out.append("?type=");
//                out.append(c.getLanguage());
//                out.append("'>");
//
//                switch (c.getType()) {
//                    case 1:
//                        out.append(CarType.SEDAN.name());
//                        break;
//                    case 2:
//                        out.append(CarType.HATCHBACK.name());
//                        break;
//                    case 3:
//                        out.append(CarType.CROSSOVER.name());
//                }
//                out.append("</td><td><h2>");
//                out.append(c.getPrice());
//                out.append("</h2> <h4>USD</h4>");
//                out.append("</td><td>");
//                out.append(c.getDescription());
//                out.append("</td><td>");
//                out.append("<a href='");
//                out.append(RedirectPath.DETAIL_PAGE.getValue());
//                out.append("?id=");
//                out.append(c.getId());
//                out.append("'><img style='width: 100px;' src='");
//                out.append(c.getPicture());
//                out.append("' alt='No Picture'/></a>");
//                out.append("</td></tr>");
//            }
//            out.append("</table>");
//            out.append("<form action='");
//            out.append(RedirectPath.ADD_PAGE.getValue());
//            out.append("' method='GET'>\n");
//            out.append("    <input type='submit' value='Add New Car'>\n");
//            out.append("</form>");
//            out.append("<form action='");
//            out.append(RedirectPath.FIRST_PAGE.getValue());
//            out.append("' method='GET'>\n");
//            out.append("    <input type='submit' value='To First Page'>\n");
//            out.append("</form>");
//            out.append(getEnd());
//            return out.toString();
//        }
//
        public String getAddPage(String title) {
            StringBuilder out = new StringBuilder();
            out.append(getHead(title));

            out.append("<form action='");
            out.append(RedirectPath.ADD_CITY.getValue());
            out.append("' method='POST'>\n");
            out.append("    Enter Car Name: <input type='text' name='name'></br>\n");
            out.append("    Enter Description: <input type='text' name='description'></br>\n");
            out.append("    Enter Type: <input type='number' name='type'></br>\n");
            out.append("    Enter Price: <input type='number' name='price'></br>\n");
            out.append("    Enter Picture link: <input type='text' name='picture'></br>\n");
            out.append("    <input type='submit' value='Add Car'>\n");
            out.append("</form>");
            out.append("<form action='");
            out.append(RedirectPath.FIRST_PAGE.getValue());
            out.append("' method='GET'>\n");
            out.append("    <input type='submit' value='To Main Page'>\n");
            out.append("</form>");
            out.append(getEnd());
            return out.toString();
        }

//        public String getAuthPage(String title) {
//            StringBuilder out = new StringBuilder();
//            out.append(getHead(title));
//            out.append("<form action='");
//            out.append(RedirectPath.AUTH_PAGE.getValue());
//            out.append("' method='POST'>\n");
//            out.append("    Enter Login: <input type='text' name='login'>\n");
//            out.append("    Enter Pass: <input type='password' name='pass'>\n");
//            out.append("    <input type='submit' value='Authenticate'>\n");
//            out.append("</form>");
//            out.append("<form action='");
//            out.append(RedirectPath.FIRST_PAGE.getValue());
//            out.append("' method='GET'>\n");
//            out.append("    <input type='submit' value='To First Page'>\n");
//            out.append("</form>");
//            out.append(getEnd());
//            return out.toString();
//        }
//
//        public String getRegPage(String title) {
//            StringBuilder out = new StringBuilder();
//            out.append(getHead(title));
//            out.append("<form action='");
//            out.append(RedirectPath.REG_PAGE.getValue());
//            out.append("' method='POST'>\n");
//            out.append("    Enter Login: <input type='text' name='login'>\n");
//            out.append("    Enter Pass: <input type='password' name='pass1'>\n");
//            out.append("    Enter again: <input type='password' name='pass2'>\n");
//            out.append("    <input type='submit' value='Register'>\n");
//            out.append("</form>");
//            out.append("<form action='");
//            out.append(RedirectPath.FIRST_PAGE.getValue());
//            out.append("' method='GET'>\n");
//            out.append("    <input type='submit' value='To First Page'>\n");
//            out.append("</form>");
//            out.append(getEnd());
//            return out.toString();
//        }
//
        private String getHead(String title) {
            StringBuilder out = new StringBuilder();
            out.append("<html><head>");
           out.append("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/> <title>");

            out.append(title);
            out.append("</title>");
            out.append("<style type='text/css'> " +
                    //"<div class='wrap'> "+
//                " .br1{border-radius:35% 0 0 0;}"+
//                " .br2{border-radius:0 35% 0 0;}"+
                    //  "TABLE { border-collapse: collapse;  border-radius:5x;} " +
                    "TABLE { border-collapse: collapse; border-radius:35px;} " +
                    " TR, TD {border-radius:35px; }"+
                    "TD, TH {  padding: 3px;border: 1px solid black;  border-radius:35px; }" +
                    //border-radius:35%;
                    // "TR, TD: first-of-type {  border-top-left-radius:35px; border-bottom-left-radius:45px;  }" +
                    "TH {background: #b0e0e6;}</style>");
            out.append("</head><body>");
            return out.toString();
        }

        private String getEnd() {
            return "</body></html>";
        }
//
//        public String getDetailPage(String title, Car c) {
//            StringBuilder out = new StringBuilder();
//            out.append(getHead(title));
//            out.append("<h1>Car Dealer Shop</h1>");
//            out.append("<table>");
//            //   out.append("TR, TD: first-of-type {  border-top-left-radius:35px; border-bottom-left-radius:45px;  }");
//            //     out.append("TR, TD:  {  border-radius:35px; }");
//            out.append("<tr><td>");
//            // out.append("TR, TD: first-of-type {  border-top-left-radius:35px; border-bottom-left-radius:45px;  }");
//            out.append("Name");
//            out.append("</td><td>");
//            out.append(c.getName());
//            out.append("</td></tr>");
//            out.append("<tr><td>");
//            out.append("Description");
//            out.append("</td><td>");
//            out.append(c.getDescription());
//            out.append("</td></tr>");
//            out.append("<tr><td>");
//            out.append("Price");
//            out.append("</td><td>");
//            out.append(c.getPrice());
//            out.append("</td></tr>");
//            out.append("<tr><td>");
//            out.append("Type");
//            out.append("</td><td>");
//            switch (c.getType()) {
//                case 1:
//                    out.append(CarType.SEDAN.name());
//                    break;
//                case 2:
//                    out.append(CarType.HATCHBACK.name());
//                    break;
//                case 3:
//                    out.append(CarType.CROSSOVER.name());
//            }
//            out.append("</td></tr>");
//            out.append("<tr><td>");
//            out.append("Picture");
//            out.append("</td><td>");
//            out.append("<img src='");
//            out.append(c.getPicture());
//            out.append("' alt='No Picture'/>");
//            out.append("</td></tr>");
//            out.append("</table>");
//            out.append("<form action='");
//            out.append(RedirectPath.MAIN_PAGE.getValue());
//            out.append("' method='GET'>\n");
//            out.append("    <input type='submit' value='To Main Page'>\n");
//            out.append("</form>");
//            out.append(getEnd());
//            return out.toString();
//        }

        public String getAddCity(String title, Collection <City> city) {
            StringBuilder out = new StringBuilder();
            out.append(getHead(title));
            out.append("<form action='");
            out.append(RedirectPath.ADD_CITY.getValue());
            out.append("' method='POST'>\n");
            out.append("    Enter CITY: <input type='text' name='name'>\n");
            //out.append("    Enter type text: <input type='text' name='type'>\n");
            out.append("    Select type: <select name='language' >");
            out.append("         <option value=1> EN </option>");
            out.append("         <option value=2> RU</option>");
            out.append(" <option value=3> UKR</option> ");
            out.append("         </select>");

            out.append("    <input type='submit' value='AddCity' name='add'>\n");
            out.append("    </form>");

            out.append("    <form action='");
            out.append(RedirectPath.ADD_CITY.getValue());
            out.append("' method='POST'>\n");
            out.append("    <input type='submit' value='CreateTable' name='createTbl'>\n");
            out.append("</form>");

            out.append("<h1>Name of City </h1>");
            out.append("<table><tr><th>NAME</th><th>LANGUAGE</th></tr>");
          //  out.append("<table><tr><th>NAME</th></tr>");
            for (City c : city) {
               out.append("<tr> <td>");
                out.append(c.getName());
           out.append("</td><td>");
//
//
//
//                out.append(c.getLanguage());


     //           out.append(c.getLanguage());
    //            out.append("'>");
//
                switch (c.getLanguage()) {
                   case 1:
                       out.append(CityLanguage.EN.name());
                        break;
                   case 2:
                        out.append(CityLanguage.RU.name());
                        break;
                    case 3:
                        out.append(CityLanguage.UA.name());
                }
                out.append("</td></tr>");

            }
            out.append("</table>");



            out.append("    <form action='");
            out.append(RedirectPath.FIRST_PAGE.getValue());
            out.append("' method='GET'>\n");
            out.append("    <input type='submit' value='To First Page'>\n");
            out.append("</form>");
            out.append(getEnd());
            return out.toString();
        }


    }

