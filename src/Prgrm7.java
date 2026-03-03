import java.util.*;
public class Prgrm7 {
   public static void main(String[] args) throws Exception{

    Animal jeff = new Animal("HammerHead", "jeff", "ZooMarket Firi3 sweileh", "Num num num" );
    Animal Chicken = new Animal("Chicken", "Broski", "ZooMarket Firi3 Abdoun", "Num num num" );
    Animal Chameleon =  new Animal("Blaaaa", "Kbeer", "Zoo Firi3 swefiyeh", "Ah");
    
     ArrayList <Animal> animals = new ArrayList<>();
    animals.add(jeff);
    animals.add(Chicken);
    animals.add(Chameleon);
     for(int i = 0; i < animals.size(); i++){
        Animal a = animals.get(i);
        System.out.println(a.getName() + " is a" + a.getSpecies());
     }
     jeff.setZoo("Zoo Market Firi3 il Rabyeh");
     int num = (int)(Math.random() * 3 );
     if(num == 0){
        System.out.println(jeff.getName() + "is a" + jeff.getSpecies() + "that lives in" + jeff.getZoo() + "and says" + jeff.getSound());
     }
     if(num == 2){
        System.out.println(Chameleon.getName() + "is a" + Chameleon.getSpecies() + "that lives in" + Chameleon.getZoo() + "and says" + Chameleon.getSound());
     }
     if(num == 1){
        System.out.println(Chicken.getName() + "is a" + Chicken.getSpecies() + "that lives in" + Chicken.getZoo() + "and says" + Chicken.getSound());
     }

   }
}
