package project_utils;

import java.util.Arrays;

public class Utils {
    public static void main(String[] args) {
        int[] number = {-45, 590, 234, 985, 12, 68, 1, 87};
        //  int[] k = new OddEven().oddIndices(number);
        System.out.println(Arrays.toString(new OddEven().oddIndices(number)));

        System.out.println(new OddEven().isPositiveNumber(555));
        System.out.println(new OddEven().isPositiveNumber(0));
        System.out.println(new OddEven().isPositiveNumber(-555));

        String[] qqq = new String[1000];
        for (int i = 63; i < 1000; i = i + 11) {
            System.out.println("Це " + i + " число має значення " + new OddEven().mMetod(i));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);

        }


    }
}
