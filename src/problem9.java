import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args)throws Exception {
        ArrayList <Cat> Cats = new ArrayList <Cat>();
        File f = new File("data/Prog260a.txt");
        Scanner in = new Scanner(f);
        
        //Question 3

        while(in.hasNextLine()){
           String line = in.nextLine();
           String[] parts = line.split(",");
           double w = Double.parseDouble(parts[1]);
           int age = Integer.parseInt(parts[2]);
           double z = Double.parseDouble(parts[3]);
           Cat P = new Cat(parts[0], w, age, z);
           Cats.add(P);
        }
        //Question 4
        for(int i = 0; i < Cats.size(); i++){
            System.out.println("Cat Name: " + Cats.get(i).getName());
        }
        //Question 5

        System.out.println("The third cats name is: " + Cats.get(4).getName());

        // Question 6
        // Question 7

        for(int i = 0; i < Cats.size(); i++){
        int currentAge = Cats.get(i).getAgeM();
        Cats.get(i).setAgeM(currentAge + 6); // Add 6 months
        double currentWeight = Cats.get(i).getWeight();
        Cats.get(i).setWeight(currentWeight + 5); // Add 5 kg
        }
       // Question 8
        for(int i = 0; i <Cats.size(); i++){
            if(Cats.get(i).getName().equals("Rascal")){
                Cats.remove(i);
            }
        }
        
        // Question 9
        Cat A = new Cat("Angel", 3.6, 12, 25.990);
        Cats.add(3,A);

        //Question 10
        Cat G = new Cat("Gimpy", 8.3, 120,  24.990);
        Cats.add(G);
        
        // Question 11
         for(Cat cat : Cats){
          System.out.println(cat.getName() + ", " + cat.getWeight() + ", " + cat.getAgeM() + ", " + cat.getCost());
        }
        //Question 12
        Cat S = new Cat("Sugar", 11.6, 84, 33.25);
        Cats.set(4, S);

        // Question 13
        Cat temp = Cats.get(3);
        Cats.set(3, Cats.get(5));
        Cats.set(5,temp);

        // Question 14
         for(int i = 0; i < Cats.size(); i++){
            System.out.println("Cat Name: " + Cats.get(i).getName());
        }

        // Question 15
         for(int i = 0; i < Cats.size(); i++){
           if(Cats.get(i).getCost() < 40){
            Cats.remove(i);
           }
        }
         for(int i = 0; i < Cats.size(); i++){
            System.out.println("Cat Cost: " + Cats.get(i).getCost());
        }

        //Question 16
        for(int i = 0; i < Cats.size(); i++){
           if(Cats.get(i).getWeight() > 8){
            System.out.println(Cats.get(i).getName() + " Get on a diet FAT ASS");
           }
        }

    }
}
