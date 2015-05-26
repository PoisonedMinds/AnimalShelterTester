/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalsheltertester;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Dog {

    //variables for characteristics

    private String dogName, dogBreed,name;
    private int dogAge,dogWeight;
    List<String> names = new ArrayList(),breed = new ArrayList();
    //constructors
    public Dog() {
        names=read("names.txt");
        breed=read("dogs.txt");
        name=names.get((int)(Math.random()*50));
        if ((int)(Math.random()*2)==0) {
            dogName=name.substring(0,name.indexOf(" "));
        } else {
            dogName=name.substring(name.indexOf(" ")+1);
        }
        dogBreed = breed.get((int)(Math.random()*500));
        dogAge = (int)(Math.random()*15+1);
        dogWeight = (int)(Math.random()*50+10);
    }

    
    public String toString() {

        String output = "Name: " + dogName + "\n";
        output += "Breed: " + dogBreed + "\n";
        output += "Age: "+dogAge;
        output += "\nWeight: "+dogWeight+"lbs";
        return output;
    }
    
    
     public static ArrayList read(String path) {
        int num = 0;
        ArrayList contents = new ArrayList();
        String line;
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            while ((line = br.readLine()) != null) {
                contents.add(num, line);
                num++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            System.exit(0);

        } catch (IOException ex) {
            System.out.println("An error has occured");
            System.exit(1);
        }
        return contents;
    }
}
