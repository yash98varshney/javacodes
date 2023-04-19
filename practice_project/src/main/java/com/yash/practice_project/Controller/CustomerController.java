package com.yash.practice_project.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.yash.practice_project.Entities.customers;
import com.yash.practice_project.Repository.CustomerRepository;


@RestController
public class CustomerController {
    
    @Autowired
    CustomerRepository repository;
    @Autowired
    frontController fr;

    //Get all customers

    @RequestMapping(value = "/allCustomers/" , method = RequestMethod.GET)
    public ModelAndView getAllCustomer(){
        ModelAndView mav=new ModelAndView("allpeople");
        List<customers> list=repository.findAll();
        mav.addObject("allpeplist", list);
        return mav;
        
    }


    //Find customer by ID
    @RequestMapping(value = "/findcustomerByID/" , method = RequestMethod.POST)
    public ModelAndView findCustomer(@ModelAttribute customers c){
        ModelAndView mav=new ModelAndView("findByIDResult");
        customers ans =repository.findById(c.getCustomer_id()).get();
        mav.addObject("singleCustomer", ans);
        return mav;
    }



    //Add customer to database
    //https://stackoverflow.com/questions/38032635/pass-multiple-parameters-to-rest-api-spring

    @RequestMapping(value = "/addpeople/" , method = RequestMethod.POST)
    public ModelAndView addCustomer(@ModelAttribute customers c){
        repository.save(c);
        ModelAndView mav=getAllCustomer();
        return mav;

    }

    //Delete cusotmer by ID
    @DeleteMapping("/allCustomers/del/{id}")
    public void deleteCustomer(@PathVariable("id") int customer_id){
        repository.deleteById(customer_id);
    }

    //Updatting customer
    @PutMapping("/allCustomers/")
    public customers updateCustomer(@RequestBody customers c){
        return repository.save(c);
        
    }

    @GetMapping("/allCustomers/point/")
    public List<customers> pointsGr(){
        return repository.greater();
    }
 

    
}
