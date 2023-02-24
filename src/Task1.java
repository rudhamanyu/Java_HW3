//1.Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = init_array();
        System.out.println(Arrays.toString(arr) + " Cтарт");
        split_arr(arr);
        System.out.println(Arrays.toString(arr) + " Финиш");
    }

    public static int[] init_array() { // Создание массива с рандомными числами
        Random rnd = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++)
            array[i] = rnd.nextInt(-10, 10);
        return array;
    }

    public static void split_arr(int[] arr) {
        if (arr.length == 1) return;        //Выход из рекурсии
        int mid = arr.length / 2;           //Делим массив на два
        int[] arr_l = new int[mid];
        int[] arr_r = new int[arr.length - mid];

        for (int i = 0; i < mid; i++)
            arr_l[i] = arr[i];
        for (int i = mid; i < arr.length; i++)
            arr_r[i - mid] = arr[i];

        split_arr(arr_l); //Рекурсия деления массивов
        split_arr(arr_r);
        merge_arrs(arr, arr_l, arr_r); // Слияние массивов
    }

    public static void merge_arrs(int[] arr, int[] arr_l, int[] arr_r) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr_l.length && j < arr_r.length) {
            if (arr_l[i] < arr_r[j]) {
                arr[k] = arr_l[i];
                i++;
//                System.out.println(Arrays.toString(arr) + " l");
            } else {
                arr[k] = arr_r[j];
                j++;
//                System.out.println(Arrays.toString(arr) + " r");
            }
            k++;
        }
        for (int l = i; l < arr_l.length; l++) {
            arr[k++] = arr_l[l];
        }
        for (int r = j; r < arr_l.length; r++) {
            arr[k++] = arr_r[r];
        }
    }
}
