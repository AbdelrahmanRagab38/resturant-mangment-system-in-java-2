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
 * @author Abdelrahman Ragab
 */
public class Meals implements Serializable{
    final String MFileName="Meals.bin";
       private static ArrayList<Meals> meals=new ArrayList<Meals>();
       
    String mealName;
    int Meal_id;
    double price;

    public Meals() {
    }

    public Meals(String mealName, int Meal_id, double price) {
        this.mealName = mealName;
        this.Meal_id = Meal_id;
        this.price = price;
    }
    
    
    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getMeal_id() {
        return Meal_id;
    }

    public void setMeal_id(int Meal_id) {
        this.Meal_id = Meal_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    /////////////////////////////////////////////////
    private boolean commit_to_file() {
		return fileManger.write(MFileName,meals);
	}
	
	private void load_from_file() {
		meals=(ArrayList<Meals>) fileManger.read(MFileName);
	}

    
    public boolean add_Meal() {
		//load_from_file();
		meals.add(this);
		return commit_to_file();
	}
    private int get_Meal_index(int id) {
		for (int i=0;i<meals.size();i++) {
			if(meals.get(i).getMeal_id()==id) {
				return i;
			}
		}
		return -1;	
	}
	
	public ArrayList<Meals> show_all_Meals() {
		load_from_file();
		return (meals.isEmpty()?null:meals);
	}
	public Meals searchForMeal(int id) {
		load_from_file();
		int index=get_Meal_index(id);
		if(index!=-1) 
			return meals.get(index);
                                
		return null;
	}
	
	public boolean updateMeal(int old_id,Meals x) {
		load_from_file();
		int index=get_Meal_index(old_id);
		if (index != -1) {
		meals.set(index, x);
		return commit_to_file();
		}
		return false;
	}
	
	public boolean removeMeal(int id) {
		load_from_file();
		int index=get_Meal_index(id);
        if (index != -1) {
		meals.remove(index);
		return commit_to_file();
        }
        return false;
	}
        
    
    
    
    
    
    
    
}
