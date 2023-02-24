import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

//3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
public class Task3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = Integer.parseInt(scr.nextLine());
        ArrayList<Integer> arr = new ArrayList<>(n);
        Random rnd = new Random();
        for (int i = 0; i < n; i++)
            arr.add(rnd.nextInt(-7, 12));
        System.out.println(arr);

        int my_min = Collections.min(arr);
        int my_max = Collections.max(arr);
        double my_avr = (double) arr.stream().mapToInt(Integer::intValue).sum() / n;
        System.out.printf("Минимальное: " + my_min + "\n"
                + "Максимальное: " + my_max + "\n"
                + "Среднее арифметическое: " + my_avr);
    }
}
