import java.util.ArrayList;
import java.util.Random;

// (Дополнительно) Реализовать алгоритм сортировки слиянием

public class dz1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(100);
            arr.add(x);
        }
        System.out.println(arr.toString());
        mergeSort(arr);

        System.out.println(arr.toString());
    }

    private static void mergeSort(ArrayList<Integer> arr) {
        Integer size = arr.size();
        if(size == 1) return ;
        Integer mid = size / 2;
        ArrayList<Integer> lArr = new ArrayList<>(mid);
        ArrayList<Integer> rArr = new ArrayList<>(size - mid);

        for (int i = 0; i < mid; i++) {
            lArr.add(arr.get(i));
        } for (int i = 0; i < size - mid; i++) {
            rArr.add(arr.get(i+mid));
        }

       mergeSort(rArr);
       mergeSort(lArr);
       merge(arr, lArr, rArr);
    }

    private static void merge(ArrayList<Integer> arr, ArrayList<Integer> lArr, ArrayList<Integer> rArr) {
        Integer left = lArr.size();
        Integer right = rArr.size();
        int i = 0;
        int j = 0;
        arr.clear();
        while (i < left && j < right) {
            if (lArr.get(i) < rArr.get(j)) {
                arr.add(lArr.get(i));
                i++;
            } else {
                arr.add(rArr.get(j));
                j++;
            }
        }

        for (int l = i; l < left; l++) {
            arr.add(lArr.get(l));
        }
        for (int r = j; r < right; r++) {
            arr.add(rArr.get(r));
        }
    }
}