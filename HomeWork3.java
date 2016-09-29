import java.io.IOException;

/**
 * Created by Комп on 22.09.2016.
 */
public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        int n = 0;

        for (int i = 0; i <= 9; i++) {
            for (int a = 0; a <= 9; a++) {
                for (int b = 0; b <= 9; b++) {
                    for (int c = 0; c <= 9; c++) {
                        for (int d = 0; d <= 9; d++) {
                            for (int z = 0; z <= 9; z++) {
                                int sum1 = i + a + b;
                                int sum2 = c + d + z;
                                if (sum1 == sum2) {
                                    n++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(n-1); //Я не знаю, но вроде нету билетика с 000000.
    }// Уверен, что код можно было компактнее написать, но мозгов не хватило.
}
