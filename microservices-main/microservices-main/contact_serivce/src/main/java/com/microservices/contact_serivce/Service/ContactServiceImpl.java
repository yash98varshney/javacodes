package com.microservices.contact_serivce.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.microservices.contact_serivce.Entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> contactList=List.of(
        new Contact(1L,"amit@gmail.com","Amit",1311L),
        new Contact(2L,"anil@gmail.com","Anil",1311L),
        new Contact(3L,"rohan@gmail.com","Rohan",1313L),
        new Contact(4L,"ram@gmail.com","Ram",1314L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userID) {
        return contactList.stream().filter(contact -> contact.getUserID().equals(userID)).collect(Collectors.toList());
    }
    
}
