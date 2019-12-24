/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

import java.io.Serializable;

/**
 *
 * @author dell
 */
//public interface Person {}
public abstract class Person  implements Serializable{
	String name;
	String gender;
	String phone_no;
	String address;
        int id;
       
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
    public Person() {
    	   System.err.println("llllllpppp");
    }
	public Person(String name,String gender,String phone_no,String address,int id) {
		this.name=name;
		this.id=id;
		this.phone_no=phone_no;
		this.gender=gender;
		this.address=address;
	}
        public Person(String name,int id,String address) {
		this.name=name;
		this.id=id;
		this.address=address;
	}
         public Person(String name,int id) {
		this.name=name;
		this.id=id;
		this.address=address;
	}
        
        
         public abstract boolean login(String username , String password);
    public abstract void logout();
}
