import java.util.ArrayList;
import java.util.Arrays;
// Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.Random;

public class dz2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(100);
            arr.add(x);
        }
        System.out.println(arr.toString());
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }

        System.out.println(arr.toString());
    }
}
