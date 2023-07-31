package com.microservices.contact_serivce.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.contact_serivce.Entity.Contact;

@Service
public interface ContactService {
    public List<Contact> getContactsOfUser(Long userID);
}
