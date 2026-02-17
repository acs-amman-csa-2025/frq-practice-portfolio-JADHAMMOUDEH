import java.util.*;
import java.io.*;
public class Prog260a {
    public static void main(String[] args) throws Exception{
    ArrayList <Integer> grades = new ArrayList<Integer>();
    ArrayList <Integer> classes = new ArrayList<Integer>();
    ArrayList <Integer> gender = new ArrayList<Integer>(); 
    int count10 = 0;
    int count11 = 0;
    int count12 = 0;   
    File f = new File("data/Prog260a.txt");
    Scanner in = new Scanner(f);
        while (in.hasNextInt()){
            if(in.nextInt() != 0){
                classes.add(in.nextInt());
                grades.add(in.nextInt());
                gender.add(in.nextInt());
            }
        }
      for(int i = 0; i < classes.size(); i++){
        if(classes.get(i) == 12){
            count12++;
        }
        if(classes.get(i) == 11){
            count11++;
        }
        if(classes.get(i) == 10){
            count10++;
        }
      }
      System.out.println("Class:             Number:");
      System.out.println(".    "  +    12              + "                   " + count12);
      System.out.println(".    "  +    11              + "                   " + count11);
      System.out.println(".    " +     10              + "                   " + count10);
    }
}
