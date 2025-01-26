
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        double stdDev = calculateStandardDeviation(data, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    public static double calculateMean(int[] data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return (double) sum / data.length;
    }

    public static double calculateMedian(int[] data) {
        Arrays.sort(data);
        int n = data.length;
        if (n % 2 == 0) {
            return (data[n / 2 - 1] + data[n / 2]) / 2.0;
        } else {
            return data[n / 2];
        }
    }

    public static double calculateStandardDeviation(int[] data, double mean) {
        double sumOfSquares = 0;
        for (int num : data) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumOfSquares / data.length);
    }
}
 