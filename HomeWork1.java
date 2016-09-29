import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Комп on 22.09.2016.
 */
public class HomeWork1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for( int n = scanner.nextInt(); n != 0; n /= 10)
        {
            sum = sum + (n % 10);
        }
        System.out.println(sum);

    }
}

