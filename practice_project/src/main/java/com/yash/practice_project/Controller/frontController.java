package com.yash.practice_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.practice_project.Entities.customers;



@Controller
public class frontController {
    
    @RequestMapping(value = "/frontpage/", method = RequestMethod.GET)
    public String frontpage(Model m){
        return "frontpage";
    }

    @RequestMapping(value = "/findbyID/" ,method = RequestMethod.GET)
    public ModelAndView findByIDForm(){
        ModelAndView mav=new ModelAndView("findByIdForm");
        customers c=new customers();
        mav.addObject("customers", c);
        return mav;
    }

    @RequestMapping(value = "/addCustomer/" , method = RequestMethod.GET)
    public ModelAndView addCustomerToRepo(){
        ModelAndView mav=new ModelAndView("addCustomerForm");
        mav.addObject("addcustomer", new customers());
        return mav;

    }


}
