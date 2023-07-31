package com.microservices.contact_serivce.Entity;


public class Contact {

    private Long cID;
    private String email;
    private String contactName;
    private Long userID;

    public Contact(Long cID, String email, String contactName, Long userID) {
        this.cID = cID;
        this.email = email;
        this.contactName = contactName;
        this.userID = userID;
    }

    public Contact() {
    }

    public Long getcID() {
        return cID;
    }

    public void setcID(Long cID) {
        this.cID = cID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    

    

}

