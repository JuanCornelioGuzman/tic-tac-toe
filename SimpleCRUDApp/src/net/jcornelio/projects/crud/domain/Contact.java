package net.jcornelio.projects.crud.domain;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 23, 2013
 * @version: 1.0
 **************************************************/
public class Contact {
    
    private String contactID;
    private String name;
    private String number;
    private String address;
    private String email;

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    
}

