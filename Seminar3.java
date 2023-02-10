package Lesson3;

import java.util.*;

public class Seminar3 {

    //Вариант1
    public static void main(String[] args) {
        public static void main(String[] args) {
            List<String> planets = List.of("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун");
            System.out.println(planets);
            int arrSize = 20;
            ArrayList<String> newArr = new ArrayList<>();

            for (int i = 0; i < arrSize + 1; i++) {
                Scanner rand;
                newArr.add(planets.get(rand.nextInt(planets.size())));
            }
            System.out.println(newArr);
            int counter;
            Collections.sort(newArr);
            for (String planet : planets) {
                counter = Collections.frequency(newArr, planet);
                System.out.println(planet + counter);
            }


            Set<String> newSet = new HashSet<>(newArr);
            System.out.println(newSet);

        }
    }
}


     // Вариант 2

    private static void ex3() {
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun");

        List<String> planets = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            planets.add(names.get(random.nextInt(8)));
        }
        System.out.println("Original list: " + planets);

        for (int i = 0; i < names.size(); i++) {
            int count = 0;

            for (int j = 0; j < planets.size(); j++) {
                if (names.get(i).equals(planets.get(j)) && count < 1){
                    count++;
                    continue;
                }
                if (names.get(i).equals(planets.get(j)) && count == 1){
                    planets.remove(j);
                    j--;
                }
            }
            System.out.println(planets);

        }
//System.out.println(planets);
    }
}
