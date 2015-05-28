

package animalsheltertester;
import javax.swing.*;

/**
 * @title AnimalShelterTester
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 25-May-2015 1:40:44 PM
 * @purpose The purpose of this program is to emulate how dog shelters function
 */
public class AnimalShelterTester {
    //make text area and scroll pane to output dogs in.
static JTextArea textArea = new JTextArea(30, 30);
static JScrollPane scrollPane;
    public static void main(String[] args) {
        //make a new animal shelter
        AnimalShelter first=new AnimalShelter();
        //create buttons for the menu
                    String buttons[]={"List Dogs","Add Dogs","Remove Dogs","Operating Cost","Exit"};

        int test=0,amount;
         while(test!=4) {
             //repeat until the use chooses to exit
            test=JOptionPane.showOptionDialog(null, "What would you like to do?", "Animal Shelter", JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
        if (test==0) {
            //set the text area to the output when the user wants to list the dog
            textArea.setText(first.toString());
            scrollPane = new JScrollPane(textArea);
            JOptionPane.showMessageDialog(null, scrollPane);
            
        } else if (test==1) {
            
            //add as many dogs as the user want
            amount =Integer.parseInt(JOptionPane.showInputDialog("How many animals would you like to add to the shelter?"));
            first.add(amount);
        } else if (test==2) {
            //remove as many dogs as the user wants
            amount =Integer.parseInt(JOptionPane.showInputDialog("How many animals would you like to remove from the shelter?"));
           first.remove(amount);
            
        } else if (test==3) {
            //output the daily cost
                first.cost();
                }         
        
        }
    }

}
