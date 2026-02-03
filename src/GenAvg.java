public class GenAvg {
    public static void main(String[] args) {
        int sum = 0;
        int[] values = new int[50];
        int avg = 0;
        for(int i = 0; i < values.length; i++){
            values[i] = (int)(Math.random() * 100);
            sum += values[i];
        }
        avg = sum / values.length;
        System.out.println(avg);
    }
}
