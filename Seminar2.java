package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.awt.Color.red;

public class Seminar2 {

    private static int[] userInput(String msg) {
        Scaner sc = new Scanner(System.in);
        int inputStr;
        while(true) {
            System.out.print(msg);
            try {
                inputStr = Integer.parseInt(sc.next());
                break;
                ;
            } catch (NumberFormatException e) {
                System.out.println(red + "Неверный ввод! Введите целое число!" + reset);
            }
        }
        return inputStr;
    }


    private static int[] arrCreator() {
        int arrSize = userInput("\nВведите размер массива: ");
        //int[] arr = new int[arrSize];
        ArrayList<Integer> arr = new ArrayList<>();

        int maxVal = userInput("Введите максимальное значение элементов массива: ");
        for (int i = 0; i < 10; i++) {
            arr.add(rand.nextInt(maxVal+1));
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println(red + "_________________________________" + reset);
        return arr;

    }


    public static void main(String[] args) {
        ArrayList<Integer> arr= arrCreator();
        Collections.sort(arr);
        System.out.println(arr);
    }
}

