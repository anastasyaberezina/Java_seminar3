package Lesson3;

import java.util.ArrayList;
import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = rand.nextInt(1, 100);
            list.add(value);
        }
        System.out.println(list);

        int count = 0;
        while(count<list.size()){
            if (list.get(count) % 2 == 0){
                list.remove(count);
            } else{
                count++;
            }
        }
        System.out.println(list);
    }
}
