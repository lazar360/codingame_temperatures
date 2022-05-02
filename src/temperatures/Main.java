package temperatures;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of temperatures to analyse
        if (N == 0) {
            System.out.println("0");
            return;
        }
        in.nextLine();

        String[] tmpsTmp = in.nextLine().split(" ");
        int[] tmps = Arrays.stream(tmpsTmp).mapToInt(Integer::parseInt).toArray();
        int min = tmps[0];

        for (int tmp : tmps){
            if(Math.abs(tmp)<Math.abs(min)){
                min = tmp;
            }else if(Math.abs(tmp) == Math.abs(min)){
                min = (tmp > 0) ? tmp : min;
            }
        }
        System.out.println(min);
    }
}
