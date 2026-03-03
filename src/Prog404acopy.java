import java.util.*;
import java.io.*;

public class Prog404acopy {
    public static void main(String[] args) throws Exception{
        File f = new File("data/Prog404a.txt");
    Scanner in = new Scanner(f);
// This makes an array list and teh type of the array list must be written completley.
    ArrayList <Integer> positives = new ArrayList <Integer> ();
    ArrayList <Integer> negatives = new ArrayList <Integer> ();
// This goes through the data and if its a positive it adds it to positives and if its a negative it adds it to negatives.
     while(in.hasNextInt()){
            int next = in.nextInt();
            if(next > 0) {
                positives.add(next);
            } else {
                negatives.add(next);
            }
        }
        // When using the length of array lists the syntax is .size with () not .length.
        // When getting an index you must use a method called .get() and then the counter inside the brackets and for this example its i/
        for (int i = 0; i < positives.size(); i++){
            System.out.println(positives.get(i) + "  " + negatives.get(i));
        }
    }  
}


