package project_utils;

public class OddEven {
    //-----------------------1---------------------
    //В классе OddEven создать алгоритм oddEven(),
    // который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
    // и “Even”, если число четное.
    public String oddEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    //-----------------------1---------------------
    //Написать алгоритм OddIndices, который принимает массив целых чисел,
    // и возвращает массив значений нечетных индексов

    public int[] oddIndices(int[] nuber) {
        int evenLength = 0;
        int oddLength = 0;
        for (int i = 0; i < nuber.length; i++) {
            if (i % 2 == 0) {
                evenLength++;
            } else {
                oddLength++;
            }

        }
        int[] even = new int[evenLength];
        int[] odd = new int[oddLength];
        int p = 0;
        int q = 0;
        for (int i = 0; i < nuber.length; i++) {
            if (i % 2 == 0) {
                even[p] = nuber[i];
                p++;
            } else {
                odd[q] = nuber[i];
                q++;
            }

        }
        return odd;
    }

    //------------------------3-------------------------
//Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    public int sumArray(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        return sum;
    }

    //------------------4-------------------------
//Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бoльше значение.
    public int biggerValue(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    //-------------5----------------
    //Напишите алгоритм IsPositiveNumber,
    //который возвращает true, если численный  параметр больше или равен нулю,
    //и возвращает false, если параметр меньше 0.
    public boolean isPositiveNumber(int number) {
        boolean s = (number >= 0);
        return s;
    }

    //------------------6---------------
//Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
//0, если числа равны
//-1, если первое число меньше второго
//1, если первое число больше второго
    public int areNumbersEqual(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a < b) {
            return -1;
        } else {
            return 1;
        }
    }

    //Для цілого числа M виконайте наступні умовні дії:
//Якщо M кратне 7 і 9, тоді повертається «Good Number».
//Якщо M кратне лише 9, а не 7, тоді повертається "Bad Number"
//Якщо M є лише кратним 11, повертається "Poor Number"
//Якщо M не задовольняє жодній із наведених вище умов, поверніть «-1»
    public String mMetod(int m) {
        if (m % 63 == 0) {
            return "Good Number";
        } else if (m % 9 == 0 && m % 7 != 0) {
            return "Bad Number";
        } else if (m % 11 ==0) {
            return "Poor Number";
        }else {
            return "-1";
        }

    }
}
