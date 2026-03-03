import java.util.*;
import java.io.*;
public class Prog260i {
    public static void main(String[] args) throws Exception{
    ArrayList <Integer> grades = new ArrayList<Integer>();
    ArrayList <Integer> classes = new ArrayList<Integer>();
    ArrayList <Integer> gender = new ArrayList<Integer>(); 
    double count10 = 0;
    double count11 = 0;
    double count12 = 0;   
    double GPA12 = 0.0;
    double GPA11 = 0.0;
    double GPA10 = 0.0;
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
               GPA12 += grades.get(i);
               count12++; 
            }
            if(classes.get(i) == 11){
                GPA11 += grades.get(i);
                count11++;
            }
            if(classes.get(i) == 10){
                GPA10 += grades.get(i);
                count10++;
            }
        }
        GPA12 = GPA12 / count12;
        GPA11 = GPA11 / count11;
        GPA10 = GPA10 / count10;
        System.out.println("Class" + "               " + "Class GPA");
        System.out.println(10 + "               " + GPA10);
        System.out.println(11 + "               " + GPA11);
        System.out.println(12 + "               " + GPA12);

    }
}
