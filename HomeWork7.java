import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Комп on 22.09.2016.
 */
public class HomeWork7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(sumNumber(n));
        }
    public static int sumNumber(int a){
        if(a>=1) {
            return a + sumNumber(a - 1);
        }
        return 0;

    }
}