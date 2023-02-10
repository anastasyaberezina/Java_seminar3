package Lesson3;

import java.util.ArrayList;
import java.util.Random;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.lang.Math.round;

public class HomeWork2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = rand.nextInt(1, 100);
            list.add(value);
        }
        System.out.printf(list);

        int min = min(list);
        int max = max(list);
        int minValue = list.get(0);
        int maxValue = list.get(0);
        int sum = 0;
        for (int item : list) {
            if (item > maxValue) {
                maxValue = item;
            }
            if (item < minValue) {
                minValue = item;
            }
            sum += item;
        }
        float average = (float)sum/list.size();

        System.out.printf("Максимальный элемент", maxValue);
        System.out.printf("Минимальный элемент", minValue);
        System.out.printf("Среднее арифметическое", average);

    }
}
