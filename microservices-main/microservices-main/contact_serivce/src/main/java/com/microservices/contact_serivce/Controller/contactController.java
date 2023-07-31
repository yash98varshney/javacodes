package com.microservices.contact_serivce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.contact_serivce.Entity.Contact;
import com.microservices.contact_serivce.Service.ContactService;

@RestController
@RequestMapping("/contacts")
public class contactController {

    @Autowired
    private ContactService contactService;
    
    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){
        return contactService.getContactsOfUser(userId);
    }

}
