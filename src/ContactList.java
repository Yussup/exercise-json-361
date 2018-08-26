package kz.edu.nu.cs.exercise;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public class ContactList {
    private List<MyContact> list;
    
    public ContactList() {
        list = new ArrayList<MyContact>();
    }
    
    public static ContactList MakeContactList(String s) {

    		Gson g = new Gson();
        ContactList Cl = g.fromJson(s, ContactList.class);
        return Cl;
        
    }
    
    public void addContact(MyContact c) {
        list.add(c);
    }
    
    public void removeFirstContact() {
        list.remove(0);
    }
    
    public MyContact getFirstContact() {
    	  return list.get(0);
      
    }
    
    public int getSize() {
       
    	return list.size();
        
    }
}
