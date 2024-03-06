public class SeriesF {
    public static void main(String args[]) {
            int sum = 0;
            for (int i = 1; i <= 20; i++) {
                int term = (int)Math.pow(2, i);
                if (i % 2 == 0)
                    sum -= term;
                else
                    sum += term;
            }
            System.out.println("S = x1 - x2 - +x3 ... - x20; where x = 2");
            System.out.println("S = " + sum);
        }
    }
// Output:
// S = x1 - x2 - +x3 ... - x20; where x = 2
// S = -699050