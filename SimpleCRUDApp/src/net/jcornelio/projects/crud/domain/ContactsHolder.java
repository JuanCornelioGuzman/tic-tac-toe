package net.jcornelio.projects.crud.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 23, 2013
 * @version: 1.0
 **************************************************/
public class ContactsHolder {

    private static ContactsHolder chHolder;
    private HashMap<String, Contact> contacts;
    private List<Contact> contactList;
    
    private ContactsHolder(){
        contacts = new HashMap<String, Contact>();
        contactList = new ArrayList<Contact>();
    }
    
    public static ContactsHolder getInstance(){
        if(chHolder == null){
            chHolder = new ContactsHolder();
        }
        return chHolder;
    }
    
    public List<Contact> getContacts(){
        populateContactList();
        return contactList;
    }
    
    public void addContact(Contact c){
        contacts.put(c.getContactID(), c);
    }
    
    public void deleteContact(String contactID){
        contacts.remove(contactID);
    }
    
    private void populateContactList(){
        contactList.clear();
        for(Contact c : contacts.values()){
            contactList.add(c);
        }
    }
    
}

