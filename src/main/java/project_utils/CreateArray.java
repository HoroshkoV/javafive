package project_utils;

public class CreateArray {
    //1 В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
    // который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
    public int[] createIntArray(int one, int two, int three, int four, int five) {
        int[] createIntArray = {one, two, three, four, five};
        return createIntArray;
    }

    //2 Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
// и возвращает массив из этих же чисел
    public double[] createDoubleArray(double one, double two, double three, double four, double five) {
        double[] createDoubleArray = {one, two, three, four, five};
        return createDoubleArray;
    }

    //3.Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
    public String[] createStringArray(String one, String two, String three, String four, String five) {
        String[] createStringArray = {one, two, three, four, five};
        return createStringArray;
    }

    //4Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов и
// возвращает массив из этих слов.
    public String[] createArrayFromText(String array) {
        String[] createArrayFromText = array.split(" ");
        return createArrayFromText;
    }

    //1.В классе CreateArray написать метод createIntArrayFromText(),
// который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”) и возвращает массив типа int[] из этих чисел.
// (Можно использовать split() или toCharArray())
    public int[] createIntArrayFromText(String str) {
        String[] array = str.split(" ");
        int[] createIntArrayFromText = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            createIntArrayFromText[i] = (int) Double.parseDouble(array[i]);
        }
        return createIntArrayFromText;
    }

    //В классе CreateArray написать метод multiplesOf(),
// который принимает на вход целое положительные число number в пределах от 1 включительно до 10 включительно,
// и возвращает таблицу умножения на это число в виде массива
    public int[] multiplesOf(int number) {
        int[] error = {0};
        int[] multiplesOf = new int[11];
        if (number > 0 && number < 11) {
            for (int i = 0; i < multiplesOf.length; i++) {
                multiplesOf[i] = number * i;
            }return multiplesOf;
        }
        return error;
    }
//1.В классе CreateArray написать метод getPhoneNumberAndCountry(),
// который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
// который содержит номер телефона, состоящий из этих чисел,  и название страны, которой номер принадлежит.
//Например:getPhoneNumberAndCountry({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
    public int[] getPhoneNumberAndCountry(int phoneNumber){
        
    }
}
