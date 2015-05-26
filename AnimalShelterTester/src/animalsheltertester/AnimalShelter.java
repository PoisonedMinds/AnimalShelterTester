package animalsheltertester;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AnimalShelter {
        List<Dog> dogs =new ArrayList();

    public AnimalShelter() {
        int amount =Integer.parseInt(JOptionPane.showInputDialog("How many animals would you like the shelter to start with?")),test = 0;
        for (int i=0;i<amount;i++) {
            dogs.add(new Dog());
        }    
    }
    public void add(int num) {
        for (int i=0;i<num;i++) {
            dogs.add(new Dog());
        }
    }
    
    public void remove(int num) {
        for (int i=0;i<num;i++){
                dogs.remove(0);
            }
    }
    public void cost() {
                    JOptionPane.showMessageDialog(null, "The shelter costs $"+(dogs.size()*15)+" daily.");

    }
    public String toString() {
        String output="";
         for (int i=0;i<dogs.size();i++) {

                output+=("\n\nDog #"+(i+1)+"\n"+dogs.get(i).toString());
            }
         return output;
    }
    
    
    
}
