/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

import java.text.DateFormat;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class ResturantManggmentSystem {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Admin x1=new Admin();
    
  //  x1.addNewMeal("pizaa", 55, 555);
   // x1.searchForMeal(55);
   Meals emy=new Meals("CHIECKEN", 7, 405);
      Meals emy2=new Meals("CHIECKEN2", 8, 450);
            Meals emy3=new Meals("CHIECKEN3", 9, 5);
      //  System.out.println(emy.price+emy2.price);
      
  x1.listAllMeals();
            x1.addNewEmployee("Abdelrahman Ragab", "male", "01208648921", "Maadi", 20170287, "abood", "12345678");
          //  x1.addNewEmployee("Asmaa Nasser", "fmale", "01208648921", "Maadi", 2, "abood", "12345678");
          //  x1.addNewEmployee("Abdelrahman Ragab", "fmale", "01208648921", "Maadi", 3, "abood", "12345678");
          //  x1.addNewEmployee("Abdelrahman Ragab", "fmale", "01208648921", "Maadi", 4, "abood", "12345678");
         //   x1.addNewEmployee("Abdelrahman Ragab", "fmale", "01208648921", "Maadi", 5, "abood", "12345678");
          //  x1.addNewEmployee("Abdelrahman Ragab", "male", "01208648921", "Maadi", 6, "abood", "12345678");
        //    x1.searchForEmployee(20170287);
        //    x1.searchForEmployee(2);
         //   x1.searchForEmployee(3);
         //   x1.searchForEmployee(4);
         //   x1.searchForEmployee(5);
        //    x1.searchForEmployee(6);
            Employee n= new Employee();
            Customer c=new Customer();
        Order MyOrder=n.makeOrder("5","1",c);
        x1.makeOffers(MyOrder.getCost());
n.manageBilling(MyOrder);

                //    fileManger.write("Meals.bin","n");
//متنساش تعدل الابديت كلها لانها مش حلوة..
        //   n.addNewCustomer("Abdelrahman Ragab", "male", "01208648921", "Maadi", 4, "abood", "12345678");
          //  n.searchForCustomer(4);//must make it like employee method
           // n.updateCustomer(4, newCustomereValues);
//n.listAllCustomers();
//x1.deleteEmployee(90);
//x1.listAllEmployee();

    }
    
}
