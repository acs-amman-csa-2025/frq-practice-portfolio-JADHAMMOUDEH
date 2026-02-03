import java.util.*;
import java.io.*;

public class Prog404a{
    public static void main(String[] args) throws Exception {
        File K = new File("Prog404a.txt");
        Scanner in = new Scanner(K);
        int[] values = new int[200];
        int count = 0;


        while(in.hasNextInt()){
            values[count] = in.nextInt();
            count++;
        }

        int posCount = 0;
        int negCount = 0;

        for (int i = 0; i < count; i++) {
            if (values[i] > 0)
                posCount++;
            else if (values[i] < 0)
                negCount++;
        }

        int[] positives = new int[posCount];
        int[] negatives = new int[negCount];
        int p = 0;
        int c = 0;
        for(int k = 0; k < count; k++){
            if(values[k] > 0){
                positives[p] = values[k];
                p++;
            }
            if(values[k] < 0){
                negatives[c] = values[k];
                c++;
            }
        }
    }
}