package com.yash.thymleaf.thymleaf.Controller;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class frontController {
    
    @RequestMapping(value="/main/",method=RequestMethod.GET)
    public String mainPage(Model m){
        m.addAttribute("name","yash");
        m.addAttribute("date", new Date().toString());
        return "Main";
    }

    @RequestMapping(value = "/iterator/" , method = RequestMethod.GET)
    public String iterationPage(Model m){

        List<String> lt=List.of("Ram","MOhan","Sohan","Ramesh","Suresh");
        Map<String ,Integer> map=new HashMap<>();
        map.put("Ram",1);
        map.put("Sham",100);
        m.addAttribute("nameMap", map);
        m.addAttribute("names", lt);
        return "Iteration";
    }

    @RequestMapping(value = "/conditions/" , method = RequestMethod.GET)
    public String conditionStatement(Model m){

        m.addAttribute("isActive", true);  
          
        m.addAttribute("gender", "F");

        List<Integer> list=List.of(1,2,3,4);
        m.addAttribute("mylist", list);
            
        return "conditional";
    }
}
