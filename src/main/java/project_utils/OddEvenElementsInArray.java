package project_utils;

public class OddEvenElementsInArray {
    //2.В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
// который принимает на вход массив целых чисел и возвращает массив int[2],
// который содержит количество четных и нечетных элементов входящего массива
    public int[] countOddEvenValuesInArray(int[] array) {
        int[] countOddEvenValuesInArray = {new OddEvenValuesInArray().countEvenValuesInArray(array),
                new OddEvenValuesInArray().countOddValuesInArray(array)};
        return countOddEvenValuesInArray;
    }

//3. В классе OddEvenElementsInArray написать метод createOddEvenArray(), который принимает массив целых случайных чисел,
// и возвращает двумерный массив (массив четных и массив нечетных чисел)
    public int[][] createOddEvenArray(int[] array) {
        int[][] createOddEvenArray = new int[2][];
        createOddEvenArray[0] = new int[new OddEvenValuesInArray().countEvenValuesInArray(array)];
        createOddEvenArray[1] = new int[new OddEvenValuesInArray().countOddValuesInArray(array)];
        int indexEven = 0;
        int indexOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                createOddEvenArray[0][indexEven]=array[i];
                indexEven++;
            } else {
                createOddEvenArray[1][indexOdd] = array[i];
                indexOdd++;
            }
        }
        return createOddEvenArray;
    }
}


