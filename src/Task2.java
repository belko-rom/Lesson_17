import java.util.ArrayList;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -4, 5, -6, 7, 8, -9};
        ArrayList<Integer> resultList = new ArrayList<>();

        Predicate<Integer> isPositive = number -> number > 0;
        for (Integer i : numbers){
            if(isPositive.test(i)){
                resultList.add(i);
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Результат: " + resultList);

    }
}