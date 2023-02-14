package util;

public class ArrayUtil {

    // Метод поиска, на вход метода принимаем массив чисел и числа, которое будем искать в массиве
    // Метод должен вернуть число - индекс искомого элемента в массиве либо -1
    public static int findElement(int[] array, int searchElement) {
        if (array == null) {
            return -1;
        }
        int rsultOfSearch = -1;
        for (int i = 0; i < array.length; i++) {
            int elementOfArray = array[i];
            if (elementOfArray == searchElement) {
                rsultOfSearch = i;
                break;
            }
        }
        return rsultOfSearch;
    }

    // реализовать метод по заполнению массива каким-то числом
    // Метод принимает на вход два параметра - пустой массив и число, которым будет наполнятся этот массив
    // На выходе должен быть тот же массив, но с заполненными значениями.
    // {0, 0, 0, 0, 0, 0, 0} -> {5, 5, 5, 5, 5, 5, 5}

    // public - доступный всем
    // static - можно вызывать внутри методов через конструкию НазваниеКласса.названиеМетода()
    // то есть можем писать ArrayUtil.fillArray()

    public static int[] fillArray(int[] array, int value) {
        if (array == null) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        return array;
    }
}
