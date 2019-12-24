/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

/**
 *
 * @author dell
 */
public class rewardProgram {
    public boolean makeReward(double total)
        {

            if(total>=150.0)
            {
                return true;
            }
            else
                return false;
        }
}
