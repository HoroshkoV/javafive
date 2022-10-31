package project_utils;

public class ManipulationsWithArrays {
    //5Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
// Метод возвращает массив тех же чисел, умноженных на number
    public int[] multiplуArrayByNumber(int[] array, int number) {
        int[] multiplуArrayByNumber = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            multiplуArrayByNumber[i] = array[i] * number;
        }
        return multiplуArrayByNumber;
    }

    //6Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
// и возвращает массив типа double[] из тех же чисел
    public double[] toDoubleArray(int[] array) {
        double[] toDoubleArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            toDoubleArray[i] = array[i];
        }
        return toDoubleArray;
    }

    //7Написать метод toIntArray(), который принимает на вход массив типа double[],
// и возвращает массив типа int[] из тех же чисел
    public int[] toIntArray(double[] array) {
        int[] toIntArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            toIntArray[i] = (int) array[i];
        }
        return toIntArray;
    }

    //8.Написать метод toStringArray(), который принимает на вход массив целых чисел,
// и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
// нужно переводить вручную)
    public String[] toStringArray(int[] array) {
        String[] toStringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            toStringArray[i] = "" + array[i];
        }
        return toStringArray;
    }

    //9.Перегрузить метод toStringArray() параметром double[].
// Этот метод должен возвращать массив типа String[] (желательно не использовать метод .toString(),
// нужно переводить вручную)
    public String[] toStringArray(double[] array) {
        String[] toStringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            toStringArray[i] = "" + array[i];
        }
        return toStringArray;
    }

    //12.В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
// который принимает на вход массив целых чисел и число number. Метод возвращает значение true,
// если все элементы массива больше number, иначе возвращает false
    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= number) {
                index++;
            }
        }
        boolean areValuesGreaterThanNumber = (index == 0);
        return areValuesGreaterThanNumber;
    }

    //4.В классе ManipulationsWithArrays написать метод getTheGreaterHalf(), который принимает массив целых чисел,
// и возвращает  массив из суммарно бОльшей первой или второй половины входящего массива
    public int[] getTheGreaterHalf(int[] array) {
        int lengthHalfArray = array.length / 2;
        int sumFirstHalfArray = 0;
        int sumSecondHalfArray = 0;
        int[] firstHalfArray = new int[lengthHalfArray];
        int[] secondHalfArray = new int[array.length - lengthHalfArray];
        for (int i = 0; i < lengthHalfArray; i++) {
            sumFirstHalfArray = sumFirstHalfArray + array[i];
        }
        for (int i = lengthHalfArray; i < array.length; i++) {
            sumSecondHalfArray = sumSecondHalfArray + array[i];

        }

        for (int i = 0; i < lengthHalfArray; i++) {
            firstHalfArray[i] = array[i];
        }

        int idex = 0;
        for (int i = lengthHalfArray; i < array.length; i++) {
            secondHalfArray[idex] = array[i];
            idex++;
        }
        if (sumFirstHalfArray > sumSecondHalfArray) {
            return firstHalfArray;
        }else {
            return secondHalfArray;
        }

    }
}
