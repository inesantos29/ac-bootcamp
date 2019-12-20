package org.academiadecodigo.stringteasers.controllers;


import org.academiadecodigo.stringteasers.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ControllerServlet {


    private Customer customer;

     /**
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher indexPage = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");

        customer = new Customer();
        customer.setName("Ines");
        customer.setEmail("ines.arts@hotmail.com");


        req.setAttribute("customer", customer);

        indexPage.include(req, resp);

    }

     **/


     // Map the URL/Verb to the method
     @RequestMapping(method = RequestMethod.GET, value = "/hello-user")
     public String sayHello(Model model) {

         String viewName = "index";

         customer = new Customer();
         customer.setName("Ines");
         customer.setEmail("ines.arts@hotmail.com");

         // Add an attribute to the request
         model.addAttribute("customer", customer);

         // Return the view name
         return viewName;
     }
}
