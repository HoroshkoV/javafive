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
        } else if (m % 11 == 0) {
            return "Poor Number";
        } else {
            return "-1";
        }

    }

    //8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
// Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
// и среднее среди всех значений между 2-мя индексами.
    public int[] minMaxAve(int[] array, int a, int b) {
        int[] minMaxAve = new int[3];
        int sum = 0;
        int dil = 0;
        if (array[a] <= array[b]) {
            minMaxAve[0] = array[a];
            minMaxAve[1] = array[b];
        } else {
            minMaxAve[1] = array[a];
            minMaxAve[0] = array[b];
        }
        for (int i = a; i <= b; i++) {
            sum = sum + array[i];
            dil++;
        }
        minMaxAve[2] = sum / dil;
        return minMaxAve;
    }

    //9.Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
    public int[] intersection(int[] arrayOne, int[] arrayTwo) {
        int size = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    size++;
                }
            }
        }
        int[] arrayThree = new int[size];
        int q = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    arrayThree[q] = arrayTwo[j];
                    q++;
                }
            }
        }
        return arrayThree;
    }

    //10.Написать алгоритм PeakElement,который принимает на вход
// массив целых чисел и возвращает значения пиковых элементов
// (элементы, которые больше своих соседей).
    public int[] peakElement(int[] array) {
        int size = 0;
        if (array[0] > array[1]) {
            size++;
        }
        for (int i = 1; i < array.length - 1; i++) {

            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                size++;
            }
        }
        if (array[array.length - 1] > array[array.length - 2]) {
            size++;
        }

        int[] peakElement = new int[size];
        int nnn = 0;

        if (array[0] > array[1]) {
            peakElement[0] = array[0];
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    nnn++;
                    peakElement[nnn] = array[i];
                }
                if (array[array.length - 1] > array[array.length - 2]) {
                    peakElement[size - 1] = array[array.length - 1];
                }
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    peakElement[nnn] = array[i];
                    nnn++;

                }
                if (array[array.length - 1] > array[array.length - 2]) {
                    peakElement[size - 1] = array[array.length - 1];
                }
            }
        }
        return peakElement;
    }

    //11.Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
    public int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int k = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reverseArray[k] = array[i];
            k--;
        }
        return reverseArray;
    }

//12.Написать алгоритм SortArray, который принимает на вход массив целых чисел, и сортирует элементы массива в порядке возрастания.

    public int[] sortArray(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
        return sortArr;
    }

    //13.Написать алгоритм KthLargest,
// который принимает на вход массив целых чисел и число k,
// и возвращает k-тый максимальный элемент.
    public int kthLargest(int[] array, int number) {
        int[] sort = new int[array.length];
        sort = sortArray(array);
        sort = reverseArray(array);
        return sort[number - 1];
    }

    //Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
// в котором все негативные числа находятся во второй половине массива (массив не должен быть отсортирован)
    public int[] negativeOnTheRight(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                index++;
            }
        }
        int[] negativeOnTheRight = new int[array.length];
        int n = 0;
        int m = array.length - index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                negativeOnTheRight[n]=array[i];
                n++;

            }else {
                negativeOnTheRight[m]=array[i];
                m++;
            }
        }
return negativeOnTheRight;
    }
}
