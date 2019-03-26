package com.company.Vasbinder.week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Contact{
    public String email;
    public String name;

    public Contact(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public void display(){
        System.out.println("Name: "+ name + "\n Email: " + email);
    }
}
class Collection implements Iterable<Contact>{
    private List<Contact> list = new ArrayList<>();
    @Override
    public Iterator<Contact> iterator() {
        return list.iterator();
    }
    public void addList(Contact addContact){
        list.add(addContact);
    }
    public void forEach(){
        list.forEach(Contact -> Contact.display() );
    }
}
public class Main {
    /*
    Cam Vasbinder
    3/22/2019
    exercise 10

     */
    public static void main(String[] args) {
        Contact austin = new Contact("015987@swcsd.us", "Cam");
        Contact a1 = new Contact("cameronfulks19@gmail.com", "Faith");
        Contact a2 = new Contact("cameronvasbinder@yahoo.com", "vasbinder");
        Collection myList = new Collection();
        myList.addList(austin);
        myList.addList(a1);
        myList.addList(a2);
        myList.forEach();

    }
}
