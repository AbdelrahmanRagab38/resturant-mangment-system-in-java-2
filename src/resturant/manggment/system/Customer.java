/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Customer extends Person implements Serializable{
    String wallet;
     private String username;
	//private String password;
        
          final String CFileName = "customer.bin";
    private static ArrayList<Customer> cus_list = new ArrayList<Customer>();    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   


    public Customer(String name, String gender, String phone_no, String address, int id,String username,String password) {
        super(name, gender, phone_no, address, id);
        this.username=username;
      //  this.password=password;
    }
    public Customer(String name, int id,String username) {
        super(name,id);
        this.username=username;
    }

    public Customer() {
       
    }
    
    
    
    
    private boolean commit_to_file() {
        return fileManger.write(CFileName, cus_list);
    }

    private void load_from_file() {
        cus_list = (ArrayList<Customer>) fileManger.read(CFileName);

    }
    
   

    

   
   
    
    ////////////////////////////////////////////////////////////////////////////
public boolean add_Customer() {
		load_from_file();
		cus_list.add(this);
		return commit_to_file();
	}
	
	
	private int get_Customer_index(int id) {
		for (int i=0;i<cus_list.size();i++) {
			if(cus_list.get(i).getId()==id) {
				return i;
			}
		}
		return -1;	
	}
	
	public ArrayList<Customer> show_all_Customers() {
		load_from_file();
		return (cus_list.isEmpty()?null:cus_list);
	}
	public Customer search_Customers(int id) {
		load_from_file();
		int index=get_Customer_index(id);
		if(index!=-1) 
			return cus_list.get(index);
                                
		return null;
	}
	
	public boolean updateCustomer(int old_id,Customer x) {
		load_from_file();
		int index=get_Customer_index(id);
		if (index != -1) {
		cus_list.set(index, x);
		return commit_to_file();
		}
		return false;
	}
	
	public boolean removeCustomer(int id) {
		load_from_file();
		int index=get_Customer_index(id);
        if (index != -1) {
		cus_list.remove(index);
		return commit_to_file();
        }
        return false;
	}
        //////////////////////////////////////////////////////////

   //login
        @Override
        public boolean login(String userName , String password)
        {
           
                return true;
         
        }
        //logout
        @Override
        public void logout()
        {
            
        }

}
