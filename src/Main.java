import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task22();
        task3();
        task4();
        task5();


    }
        public static void task1() {
        HashSet<Integer> underBase = new HashSet<>();
        underBase.add(1);
            underBase.add(10);
            underBase.add(4);
            underBase.add(2);
            underBase.add(15);

            HashSet<HashSet<Integer>> base = new HashSet<>();
            base.add(underBase);
            System.out.println(base);

            //можно было сделать легче, но я просто игрался)
        }
        public static void task2() {
            HashSet<Integer> base = new HashSet<>();
            base.add(5);
            base.add(10);
            base.add(5);
            base.add(11);
            base.add(10);
            System.out.println(base);
        }
        public static void task22() {
        HashSet<String> base = new HashSet<>();
        base.add("Mama");
            base.add("dog");
            base.add("Dog");
            base.add("Mama");
            base.add("Dog");
            System.out.println(base);
        }
        public static void task3() {
        List<Integer> base = new ArrayList<>();
        base.add(1);
            base.add(10);
            base.add(3);
            base.add(5);
            base.add(100);
            base.add(-100);

            int min = Collections.min(base);
            int max = Collections.max(base);

            System.out.println("Минимальный элемент = " + min);
            System.out.println("Максимальный элемент = " + max);
        }
        public static void task4() {
        List<Integer> base1 = new ArrayList<>();
        base1.add(1);
        base1.add(3);
            base1.add(5);
            base1.add(12);
            base1.add(3);

            List<Integer> base2 = new ArrayList<>();
            base2.add(12);
            base2.add(35);
            base2.add(23);
            base2.add(35);
            base2.add(45);

            Set<Integer> set = new HashSet<>(base1);
            set.addAll(base2);

            List<Integer> combined = new ArrayList<>(set);
            System.out.println(combined);
        }

        public static void task5() {
            List<Integer> myList = new ArrayList<>();
            myList.add(100);
            myList.add(44);
            myList.add(123);
            myList.add(67);
            myList.add(11);

            int desiredElement = 11;

            if (myList.contains(desiredElement)) {
                System.out.println("Елемент '" + desiredElement + "' присутній у списку.");
            } else {
                System.out.println("Елемент '" + desiredElement + "' відсутній у списку.");
            }
        }
        }
