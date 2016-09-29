import java.io.IOException;

/**
 * Created by Комп on 22.09.2016.
 */
public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        int n = 11;
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b);
        int f = 2;
        int i = 2;
        while (i < n) {
            f = a + b;
            a = b;
            b = f;
            System.out.print(" " + f);
            i++;
        }
    }
}
