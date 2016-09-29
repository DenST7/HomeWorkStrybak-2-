import java.io.IOException;

/**
 * Created by Комп on 22.09.2016.
 */
public class HomeWork5 {
    public static void main(String[] args) throws IOException {
        int[][] a = new int[8][5];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 5; j++){
                a[i][j] = 0;
                a[i][j] = 10+(int)(Math.random()*(99-10)+1); // Эту штуку в инете нарыл, весьма удобная.
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
