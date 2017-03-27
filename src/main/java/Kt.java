

public class Kt {
    public static void main(String[] args) {
        int n, g;
        for (n = 101; n <= 200; n++) {

            for (g = 2; g < n; g++)

                if (n % g == 0)
                    break;

            if (n == g) {
                System.out.println(n);
            }
        }



    }
}










