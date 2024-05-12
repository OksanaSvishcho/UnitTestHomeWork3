public class SumCalculator {
    public int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be a non-negative number");
        }
        return (n * (n + 1)) / 2;
    }
}
