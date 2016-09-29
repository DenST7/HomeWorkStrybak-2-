import java.io.IOException;

/**
 * Created by Комп on 22.09.2016.
 */
public class HomeWork6 {
    public static void main(String[] args) throws IOException {
        int[][] a = new int[7][4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = (-5) + (int) (Math.random() * (5 + 5) + 1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        int sum = a[0][0] * a[0][1] * a[0][2] * a[0][3];
        int max = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                if (sum < a[i][0] * a[i][1] * a[i][2] * a[i][3])
                    sum = a[i][0] * a[i][1] * a[i][2] * a[i][3];
                max = i;
            }
        }
        System.out.println(max);
        }
    }
}

