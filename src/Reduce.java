public class Reduce {
    public static void main(String[] args) {

        int step = 0;

        for (int i = 100; i > 0;) {

            boolean divisibleBy2 = i % 2 == 0;

            if (divisibleBy2) {

                i = i / 2;

            } else {

                i = i - 1;
            }

            step = step + 1;
        }

        System.out.println(step);
    }
}
