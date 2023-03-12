// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
public class dz3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(100);
            arr.add(x);
        }
        System.out.println(arr.toString());

        arr.sort(Comparator.naturalOrder());
        Integer min = arr.get(0);
        Integer max = arr.get(arr.size()-1);
        Integer res = 0;
        for (Integer integer : arr) {
            res = res + integer;
        }

        System.out.printf("Максимальное число в списке = %s\nМинимальное число в спике = %s\nСреднее арифметическое всех чисел = %s", max, min, res/arr.size());
    }
}
