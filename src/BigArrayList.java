import java.util.*;

public class BigArrayList {
    public static void main(String[] args)throws Exception {
        ArrayList <Integer> random = new ArrayList <Integer>();
        int ran = 0;

        int center = 0;

        int first = 0;

        int last = 0;

        int avg1 = 0;

        for(int i = 0; i < 19; i++){
            ran = (int)(Math.random() * 71) + 20;
            random.add(ran);
        }
        for(int i = 0; i < random.size(); i++){
            System.out.println(random.get(i));
        }
        center = random.size() / 2;

        System.out.println(random.get(center));

        first = random.get(0);

        last = random.get(random.size() - 1);

        avg1 = (first + last + center) / 3;

        System.out.println(avg1);

        int smallest = random.get(0);

        int largest = random.get(0);

        int indexsmall = 0;

        int indexlarge = 0;

        for(int i = 0; i < random.size(); i++){
            if(random.get(i) > largest){
                largest = random.get(i);
                indexlarge = i;
            }
            if(random.get(i) < smallest){
                smallest = random.get(i);
                indexsmall = i;
            }
        
        }

        System.out.println(smallest);
        System.out.println(largest);

        random.set(indexsmall, random.get(indexlarge));

        random.set(indexlarge, random.get(indexsmall));

        for(int i = 0; i < random.size(); i++){
            System.out.println(random.get(i));
        }
        int ran1 = (int)(Math.random() * 10) + 1;

        random.set(center, ran1);

        for(int i = 0; i < random.size(); i++){
            System.out.println(random.get(i));
        }

        for(int i = 0; i < random.size(); i++){
            random.set(i, random.get(i) + 10);
        }

        for(int i = 0; i < random.size(); i++){
            System.out.println(random.get(i));
        }
        int third = random.get(2);

        random.set(2,5);

        System.out.println(third);

        for(int i = 0; i < random.size(); i++){
            if(random.get(i) >= 50 && random.get(i) <= 59);
            System.out.println(random.get(i));
        }

        for(int i = 0; i < random.size(); i++){
            if(random.get(i) % 4 == 0);
            System.out.println(random.get(i));
        }
    }
}
