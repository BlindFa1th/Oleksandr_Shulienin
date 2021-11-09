import java.util.*;

public class Main {
    public static void getPairsCountfor(int[] arr, int sum)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
        System.out.println("Count of pairs is " + count);
    }
    public static void getPairsCountstream(List<Integer> list, int sum)
    {
        List count = new ArrayList<>();
        list.stream().forEach((i) -> {
            list.stream().forEach((j) -> {
                if (i + j == sum)
                    count.add(i);
            });
        });
        System.out.println("Count of pairs is " + count.size()/2);
    }
    public static void main(String args[])
    {
        int[] arr = {2, 2, 8, 3, 2, 2};
        int sum = 5;
        getPairsCountfor(arr, sum);
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(2);
        getPairsCountstream(list, sum);
    }
}
