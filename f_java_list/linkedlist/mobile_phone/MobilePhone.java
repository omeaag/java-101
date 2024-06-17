package f_java_list.linkedlist.mobile_phone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact){
        if(findContact(newContact.getName()) < 0){
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);
        if(index > -1){
            myContacts.set(index,newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if(index > -1){
            myContacts.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            String name = myContacts.get(i).getName();
            String phoneNumber = myContacts.get(i).getPhoneNumber();
            System.out.println((i + 1) + ". " + name + " -> " + phoneNumber);
        }
    }
}
