import java.util.*;

public class Main{
    static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    static int findNext(Integer num)
    {
        String sN = num.toString();
        char digits[] = sN.toCharArray();
        int n = digits.length;
        int i;
        for (i = n - 1; i > 0; i--)
        {
            if (digits[i] > digits[i - 1]) {
                break;
            }
        }
        if (i == 0)
        {
            System.out.println("Not possible");
            return 0;
        }
        else
        {
            int x = digits[i - 1], min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (digits[j] > x && digits[j] < digits[min])
                {
                    min = j;
                }
            }
            swap(digits, i - 1, min);
            Arrays.sort(digits, i, n);
            System.out.print("Next number with same set of digits is ");
            for (i = 0; i < n; i++)
                System.out.print(digits[i]);
            int number = Integer.parseInt(new String(digits));
            return number;
        }
    }

    public static void main(String[] args)
    {
        Integer n = 534976;
        int num = findNext(n);
    }
}