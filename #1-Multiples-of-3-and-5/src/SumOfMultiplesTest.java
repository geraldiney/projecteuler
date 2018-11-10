public class SumOfMultiplesTest {
    public static void main(String[] args) {
        int N = 1000;
        long M = 1_000_000_000L;
        System.out.printf("Sum of all multiples of 3 or 5 below %d = %d%n", N, sumOfAllMultiplesOf3Or5(N-1));
        System.out.printf("Sum of all multiples of 3 or 5 below %d = %d%n", M, sumOfAllMultiplesOf3Or5(M-1));
    }

    public static long sumOfMultiples(long N, long multiple) {
        long n, sum;

        N = N - (N % multiple);
        n = N / multiple;
        sum = multiple * n * (n + 1) / 2;
        return sum;
    }

    public static long sumOfAllMultiplesOf3Or5(long N) {
        return sumOfMultiples(N, 3) + sumOfMultiples(N, 5) - sumOfMultiples(N, 15);
    }
}
