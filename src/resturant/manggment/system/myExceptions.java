/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class myExceptions {
       public boolean CheckName(String x){
        if(x.matches("[a-zA-Z]+")){
            return true;
        }
        else
            return false;
    }
    
    public boolean checkSSN(String x){
        if(x.matches("[0-9]+")&& x.length()==14 && Long.parseLong(x)>0)
            return true;
        else 
            return false;
    }
    
    public boolean Checkmail(String x){
        if (x.contains("@") && x.contains(".")) {
                return true;
            }
        else
            return false;
    }
    
     public boolean CheckPassword(String x){
        if(x.matches("[0-9]+")){
           if(Long.parseLong(x)>0)
           return true;
       } 
     
        return false;
    }
    
    public boolean CheckAge(String x){
        if(Integer.parseInt(x)>=21 && Integer.parseInt(x)<=100){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean CheckPostive(String x){
        if(x.matches("[0-9]+")){
           if(Long.parseLong(x)>0)
           return true;
       } 
     
        return false;
    }
    public boolean McodeCheck(String mcode)
    {
        Customer x=new Customer();
     //   x.(Long.parseLong(mcode));
        if(x==null&&!mcode.matches("[0-9]+")&&Long.parseLong(mcode)<0)
        {
          return true;  
        }
        
        return false;
        
    }
}
