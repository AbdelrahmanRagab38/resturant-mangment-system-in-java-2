/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Order implements Serializable{
    private String orderNumber;
  public double totalCoast;
    public double Cost;


    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
     private String numberOfMeals;


    public Order(String orderNumber, String numberOfMeals) {
        this.orderNumber = orderNumber;
        this.numberOfMeals = numberOfMeals;
        this.orderOwner = orderOwner;
    }

    public String getNumberOfMeals() {
        return numberOfMeals;
    }

    public void setNumberOfMeals(String numberOfMeals) {
        this.numberOfMeals = numberOfMeals;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        this.Cost = cost;
    }

    public String getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(String orderOwner) {
        this.orderOwner = orderOwner;
    }
    private String orderOwner;
    Date pay_date;
      final String OFileName="Orders.bin";
       private static ArrayList<Order> orders=new ArrayList<Order>();
              private static ArrayList<Order> orderMeals=new ArrayList<Order>();

   // Meals[]orderMealsarr=new Meals[100];
    Employee em=new Employee();
    public double total_price;

    
 public Order() {
    }
static double orderCode;

//    public Order(Meals[]orderMeals,Date pay_date,Employee em) {
//        this.pay_date = pay_date;
//        this.em=em;
//    }
//    
  

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

   

    public Employee getEm() {
        return em;
    }

    public void setEm(Employee em) {
        this.em = em;
    }

    
 //   public double CulclatePrice(Meals[] orderMeals){
 //   for (Meals m : orderMeals) 
//{
    // only changes num, not the array element
  //  total_price = m.getPrice()+total_price;

//}
 //   return total_price;
    
  //  }
  //   public double CulclateTotalPrice(Order o){
         
   // for (Meals m : orderMeals) 
//{
    // only changes num, not the array element
  //  total_price = m.getPrice()+total_price;

//}
   // return total_price;
    
    //}
     
     
     
     
     //fady codes//
      public boolean add()
    {
        load_from_file();
        orders.add(this);
        return commit_to_file();
    }
    public boolean delete(String number)
    {
        load_from_file();
        int index = getOrderIndex(number);
        
        if(index != -1)
        {
            orders.remove(index);
            return commit_to_file();
        }
        return false;
    }
    
   
     private int getOrderIndex(String id) {
         
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber().equals(id) ) {
                return i;
            }
        }
        return -1;
    }
    
     public void totalCost(Meals...meal)
     {
          double total = 0.0;
          double total2 = 0.0;
      //  m.getPrice();
            for(Meals m : meal) {
                 total += m.getPrice();
             }
            Admin a = new Admin();
            total2=a.makeOffers(total);
           this.Cost=total;
     }    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     private boolean commit_to_file() {
		return fileManger.write(OFileName,orders);
	}
	
	private void load_from_file() {
		orders=(ArrayList<Order>)  fileManger.read(OFileName);
	}
	
	

    
    
    
    
    
    
    
    
   
}
