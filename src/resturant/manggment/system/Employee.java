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
public class Employee extends Person implements Serializable,AcessSystem{
    	final String eFileName="employee.bin";
       private static ArrayList<Employee> employees=new ArrayList<Employee>();
         private String username;
	private String password;

    

  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(String name, String gender, String phone_no, String address, int id,String username,String password) {
        super(name, gender, phone_no, address, id);
        this.username=username;
        this.password=password;
    }
    
     public Employee(String name , int id,String username,String address,String password) {
        super(name, id , address);
        this.username=username;
        this.password=password;
    }
    
        
    public Employee() {
       System.out.println("empllllll");
    }
private boolean commit_to_file() {
		return fileManger.write(eFileName,employees);
	}
	
	private void load_from_file() {
		employees=(ArrayList<Employee>)  fileManger.read(eFileName);
	}
	
public boolean add_employee() {
		load_from_file();
		employees.add(this);
		return commit_to_file();
	}
	
	
	private int get_employee_index(int id) {
		for (int i=0;i<employees.size();i++) {
			if(employees.get(i).getId()==id) {
				return i;
			}
		}
		return -1;	
	}
	
	public ArrayList<Employee> show_all_employees() {
		load_from_file();
		return (employees.isEmpty()?null:employees);
	}
	public Employee search_employee(int id) {
		load_from_file();
		int index=get_employee_index(id);
		if(index!=-1) 
			return employees.get(index);
                           
		return null;
	}
	
        
        
        
        
	public boolean updateEmployee(int old_id,Employee x) {
		load_from_file();
		int index=get_employee_index(old_id);
		if (index != -1) {
		employees.set(index, x);
		return commit_to_file();
		}
		return false;
	}
	
	public boolean removeEmployee(int id) {
		load_from_file();
		int index=get_employee_index(id);
        if (index != -1) {
		employees.remove(index);
		return commit_to_file();
        }
        return false;
	}
        
        
        
      ///////////////////////////////////////////////////////////////////////////////////////////////////  
        public void addNewCustomer(String name,String gender,String phone_no,String address,int id,String username,String password){
        Customer x;
        x = new Customer(name,gender,phone_no,address,id,username,password);
        if(x.add_Customer()){
            System.out.println("Added Successfully...!");
        }
        else{
            System.out.println("failed to insert ...!");
        }
    }
        
        public void addNewCustomerGUI(String name,int id,String username){
        Customer x;
        x = new Customer(name,id,username);
        if(x.add_Customer()){
            System.out.println("Added Successfully...!");
        }
        else{
            System.out.println("failed to insert ...!");
        }
    }
    ///////////////////////////////////////////////////////////
        // iam here
     public void listAllCustomers(){
       
        Customer x = new Customer();
     
   System.out.println(x. show_all_Customers());
    }

    public Customer searchForCustomer(int id) {
     
   Customer x = new Customer();
        x=x.search_Customers(id);
         PrintAllInfo(x);
         return x;
 //System.out.println(x.search_Customers(id));
    }
    
public void PrintAllInfo(Customer e){
      System.out.println(e.getName()+"\n"+e.getGender()+"\n"+e.getId()+"\n"+e.getPhone_no()+"\n"+e.getAddress()+"\n");
  
  }
    public void updateCustomer(int old_id, Customer newCustomereValues) {
 
      Customer x = new Customer();
    
    x.updateCustomer(old_id, newCustomereValues);
  
      System.out.println("Updated Successfully ... !");
    }

    
   public void deleteCustomer(int Id) {
       
   Customer x = new Customer();
      
   x.removeCustomer(Id);
     
   System.out.println("deleted Successfully ... !");
    }
   
        
        
//fady codes//
   // هنا انات لازم تبعت اراي اوفةومك   //Make order
        public Order makeOrder(String numberOfMeals  , String orderNumber , Customer orderOwner)
        {
            
            
            
            Order order = new Order(orderNumber ,numberOfMeals );
            Admin t=new Admin();
            t.makeOffers(order.getCost());
            if(order.add()==true)
            {
             String name;
            name=String.valueOf(orderOwner.getId());
            String filePath=name+".bin";
            fileManger.write(filePath, name);
                
                System.out.println("Order made successfully !");
                return order;
            }
            else
                System.out.println("Can't make order !");
            return order;
        }
    //Cancel order
        public void cancelOrder(String orderNumber)
        {
            Order order = new Order();
            if(order.delete(orderNumber)==true)
            {
                System.out.println("Order cancelled successfully!");
            }
            else
                System.out.println("Can't cancel order!");
        }
      //Manage billing
        public void manageBilling(Order order)
        {
            System.out.println("The Billing Cost = " + order.getCost());
            rewardProgram rP = new rewardProgram();
            if(rP.makeReward(order.getCost()));
            System.out.println("Take a pepci :D");
        }
        
        //login
        @Override
        public boolean login(String userName , String password)
        {

          if(userName.equals("abdoragab49@yahoo.com") && password.equals("12345678")){
            return true;
        }   
            
       else if(userName.equals("Employee@yahoo.com") && password.equals("12345678")){
            return true;
        }
        return false;

    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }
       
        
        
        
        
        
        
        
        

