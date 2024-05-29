/*
Задача 1
Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
метод: public static int countEvens(int[] arr)
Задача 2
Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами
переданного не пустого массива.
метод: public static int maxMinDifference(int[] arr)
Задача 3
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента,
с нулевым значением.
метод: public static boolean funcNull(int[] arr)
*/

public class Main {
    public static int countEvens(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count += 1;
        }
        return count;
    }

    public static int maxMinDifference(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<min)
                min = arr[i];
            else if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max - min;
    }
    public static boolean funcNull(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1] & arr[i] == 0)
                res=1;
        }
        if (res == 1)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 2, 3, 4};
        int[] arr1 = new int[] {1, 3, 6};
        int[] arr2 = new int[] {1, 0, 3, 6, 0, 8, 0, 0};
        System.out.println(countEvens(arr));
        System.out.println(maxMinDifference(arr1));
        System.out.println(funcNull(arr2));
    }
}