public class EvenFibonacciNumbersTest {
    public static final int FIB_NUMBER_BOUND = 4000000;

    public static void main(String[] args) {
        int sumOfEvenFibNumbers, sumOfPreviousFibs;
        int[] previousFibs = {1, 1};

        sumOfEvenFibNumbers = 0;
        sumOfPreviousFibs   = previousFibs[0] + previousFibs[1];

        while (sumOfPreviousFibs <= FIB_NUMBER_BOUND) {
            if (sumOfPreviousFibs % 2 == 0)
                sumOfEvenFibNumbers += sumOfPreviousFibs;

            previousFibs[0] = previousFibs[1];
            previousFibs[1] = sumOfPreviousFibs;
            sumOfPreviousFibs = previousFibs[0] + previousFibs[1];
        }

        System.out.printf("The sum of even Fibonacci numbers below the value %d = %d",
                FIB_NUMBER_BOUND,
                sumOfEvenFibNumbers);
    }
}
