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
        int[] ggg = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        System.out.println(Arrays.toString(new OddEven().minMaxAve(ggg, a, b)));

        int[] arrayOne = {1, 2, 4, 5, 89};
        int[] arrayTwo = {8, 9, 4, 2};
        System.out.println(Arrays.toString(new OddEven().intersection(arrayOne, arrayTwo)));

        int[] arrayOn = {1, 2, 4, 5, 8, 9};
        int[] arrayTw = {8, 9, -4, -2};
        System.out.println(Arrays.toString(new OddEven().intersection(arrayOn, arrayTw)));

        int[] arrayO = {1, 2, 4, 5, 89};
        int[] arrayT = {8, 9, 45};
        System.out.println(Arrays.toString(new OddEven().intersection(arrayO, arrayT)));

        int[] peakElement = {1, 1, 1, 1, 1, 1, 1, 11};
        System.out.println(Arrays.toString(new OddEven().peakElement(peakElement)));


        System.out.println(Arrays.toString(new OddEven().reverseArray(ggg)));


        int[] kkk = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        System.out.println(Arrays.toString(new OddEven().sortArray(kkk)));


        int[] array= {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int numberN = 3;
        System.out.println(new OddEven().kthLargest(array,numberN));

        int[] negative = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        System.out.println(Arrays.toString(new OddEven().negativeOnTheRight(negative)));

    }
}
