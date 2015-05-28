package animalsheltertester;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 * @title AnimalShelterTester
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 25-May-2015 1:40:44 PM
 * @purpose The purpose of this program is to emulate how dog shelters function
 */

public class AnimalShelter {
    //create a list of dogs
        List<Dog> dogs =new ArrayList();

    public AnimalShelter() {
        //generate the amount of dog objects that the user want
        int amount =Integer.parseInt(JOptionPane.showInputDialog("How many animals would you like the shelter to start with?")),test = 0;
        for (int i=0;i<amount;i++) {
            dogs.add(new Dog());
        }    
    }
    public void add(int num) {//method for adding dogs
        for (int i=0;i<num;i++) {
            dogs.add(new Dog());
        }
    }
    
    public void remove(int num) {//method for removing first dogs in list
        for (int i=0;i<num;i++){
                dogs.remove(0);
            }
    }
    public void cost() {//method for calculating the operating cost of the shelter
                    JOptionPane.showMessageDialog(null, "The shelter costs $"+(dogs.size()*15)+" daily.");

    }
    public String toString() {//method to output the info of the dogs
        String output="";
         for (int i=0;i<dogs.size();i++) {

                output+=("\n\nDog #"+(i+1)+"\n"+dogs.get(i).toString());
            }
         return output;
    }
    
    
    
}
