import java.util.*;

public class Main {
    static int digitroot(int n)
    {
        int root = 0;
        while (n > 0 || root > 9)
        {
            if (n == 0) {
                System.out.println(root);
                n = root;
                root = 0;
            }
            root += n % 10;
            n /= 10;
        }
        return root;
    }
    public static void main(String argc[])
    {
        int n = 493193;
        System.out.println(digitroot(n));
    }
}