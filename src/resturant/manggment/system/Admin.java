/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 *
 * @author dell
 */
public class Admin extends Person implements Serializable,AcessSystem{
    private String userName;
    private String Password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    //fady codes//
    public void alter(String newUserName , String newPassword)
    {
        this.setUserName(newUserName);
        this.setPassword(newPassword);
    }
    public double makeOffers(double total)
        {
            double discount = 0.0;
            double oldPrice = total;
            if(total>=250.0)
            {
                discount = total*0.2;
                double newPrice = oldPrice-discount;
                return newPrice;
            }
            else
                return total;
        }
    
    ///////////////////////////////////////////////////////////////////////////
    
     public void addNewEmployee(String name,int id,String username,String address,String password ){
        Employee x;
        x = new Employee(name,gender,phone_no,address,id ,username,password);
        if(x.add_employee()){
            System.out.println("Added Successfully...!");
        }
        else{
            System.out.println("failed to insert ...!");
        }
    }
    public void addNewEmployee(String name,String gender,String phone_no,String address,int id,String username,String password ){
        Employee x;
        x = new Employee(name,gender,phone_no,address,id ,username,password);
        if(x.add_employee()){
            System.out.println("Added Successfully...!");
        }
        else{
            System.out.println("failed to insert ...!");
        }
    }
    //لازم ترجع اراي ليست من الايمبولي  الصبببح ناو
     public void listAllEmployee(){
       
        Employee x = new Employee();
        int i=0;
     for(Employee s:x. show_all_employees())
         //for(i=0;)
   System.out.println(s.name+" "+s.id+" ");
     
    }

    public Employee searchForEmployee(int id) {
     
   Employee x = new Employee();
   //الكود ده بيطبع كل حاجه جوا الاوبجيكت جامد فشخ بس مش هستخدمه 
 //  Employee abc = new Employee();
//for (Field field : abc.getClass().getDeclaredFields()) {
//    field.setAccessible(true);
//    String name = field.getName();
//    Object value = field.get(abc);
 //   System.out.printf("%s: %s%n", name, value);
//}

         x=x.search_employee(id);
//         PrintAllInfo(x);
         return x;
 //System.out.println(x);
 
    }

    
    
    
    
    public void updateEmployee(int old_id, Employee newEmployeeValues) {
 
      Employee x = new Employee();
    
    x.updateEmployee(old_id, newEmployeeValues);
  
      System.out.println("Updated Successfully ... !");
    }

    
   public void deleteEmployee(int Id) {
       
   Employee x = new Employee();
      
   x.removeEmployee(Id);
     
   System.out.println("deleted Successfully ... !");
    }
   
  /////////////////////////////////////////////////////////////////////
   //for meals
   
       public void addNewMeal(String name,int id,int price){
        Meals x;
        x = new Meals(name,id,price);
        if(x.add_Meal()){
            System.out.println("Added Successfully...!");
        }
        else{
            System.out.println("failed to insert ...!");
        }
    }
    
     public void listAllMeals(){
       
        Meals x = new Meals();
     
   System.out.println(x. show_all_Meals());
    }

    public Meals searchForMeal(int id) {
   Meals x = new Meals();
              x=x.searchForMeal(id);
           PrintMealsInfo(x);
           return x;
 //System.out.println(x.searchForMeal(id));
    }

    public void updateMeal(int old_id, Meals newMealsValues) {
 
      Meals x = new Meals();
    
    x.updateMeal(old_id, newMealsValues);
  
      System.out.println("Updated Successfully ... !");
    }

    
   public void deleteMeal(int Id) {
       
   Meals x = new Meals();
      
   x.removeMeal(Id);
     
   System.out.println("deleted Successfully ... !");
    }
   
  
   
   
   
   
   
   public void createNewReport(int id , String description)
    {
        Reports report = new Reports(id ,description);
        report.addReport();
    }
  
                
                
     public void listReport(){
       
        Reports x = new Reports();
     
   System.out.println(x. show_all_Reports());
    }
     
      public void searchForReport(int id) {
     
   Reports x = new Reports();
       
 System.out.println(x.searchReport(id));
    }

    public void updateReport(int old_id, Reports newReportValues) {
 
      Reports x = new Reports();
    
    x.updateReport(old_id, newReportValues);
  
      System.out.println("Updated Successfully ... !");
    }

    
   public void deleteReport(int Id) {
       
   Reports x = new Reports();
      
   x.deleteReport(Id);
     
   System.out.println("deleted Successfully ... !");
    }
   
     
   public void PrintAllInfo(Employee e){
      System.out.println(e.getName()+"\n"+e.getGender()+"\n"+e.getId()+"\n"+e.getPhone_no()+"\n"+e.getAddress()+"\n");
  
  }
   public void PrintMealsInfo(Meals e){
      System.out.println(e.getMealName()+"\n"+e.getMeal_id()+"\n"+e.getPrice()+"\n");
  
  }
   
   //login
        @Override
        public boolean login(String userName , String password)
        {
             if(userName.equals("Admin@yahoo.com") && password.equals("12345678")){
            return true;
        }
        return false;
        }
        //logout
        @Override
        public void logout()
        {
            
        }
     
   }
   
    
    
    
    
    
    
    
    

