//2.Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = Integer.parseInt(scr.nextLine());
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        Random rnd = new Random();
        for (int i = 0; i < n; i++)
            arr.add(rnd.nextInt(-10, 10));
        System.out.println(arr);

//        arr.removeIf(num -> num % 2 == 0);   // Удаление четных элементов в одну строчку, предложенное IJ
        for (int i = 0; i < n; i++) {   // Удаление стандартным циклом
            System.out.println(arr.get(i) % 2);
            if (arr.get(i) % 2 == 0) {
                arr.remove(arr.get(i--));
                n--;
            }
        }
        System.out.println(arr);
    }
}
