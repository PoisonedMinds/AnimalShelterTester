

package animalsheltertester;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @title AnimalShelterTester
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 25-May-2015 1:40:44 PM
 * @purpose The purpose of this program is to
 */
public class AnimalShelterTester {
static JTextArea textArea = new JTextArea(30, 30);
static JScrollPane scrollPane;
    public static void main(String[] args) {
        AnimalShelter first=new AnimalShelter();
                    String buttons[]={"List Dogs","Add Dogs","Remove Dogs","Operating Cost","Exit"};

        int test=0,amount;
         while(test!=4) {
            test=JOptionPane.showOptionDialog(null, "What would you like to do?", "Animal Shelter", JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
        if (test==0) {
            
            textArea.setText(first.toString());
            scrollPane = new JScrollPane(textArea);
            JOptionPane.showMessageDialog(null, scrollPane);
            
        } else if (test==1) {
            amount =Integer.parseInt(JOptionPane.showInputDialog("How many animals would you like to add to the shelter?"));
            first.add(amount);
        } else if (test==2) {
            amount =Integer.parseInt(JOptionPane.showInputDialog("How many animals would you like to remove from the shelter?"));
           first.remove(amount);
            
        } else if (test==3) {
                first.cost();
                }         
        
        }
    }

}
