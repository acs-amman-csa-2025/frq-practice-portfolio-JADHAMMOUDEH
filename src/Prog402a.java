import java.util.*;
import java.io.*;

public class Prog402a {
    public static void main(String[] args) throws Exception{
        double sum = 0.0;
        double avg = 0.0;
        File f = new File("data/Prog402a.txt");
        Scanner in = new Scanner(f);
        int[] ids = new int[21];
        int[] scores = new int[21];
    for(int i = 0; i < 21 ; i++){
            ids[i] = in.nextInt();
            scores[i] = in.nextInt();
        }
    
    for(int i = 0; i < 21; i++){
        sum += scores[i];
    }
    avg = sum/21;
    for(int i = 0; i < 21; i++){
        System.out.println(ids[i] + " " + scores[i] + " " + (scores[i] - avg));
    }


 }
}
