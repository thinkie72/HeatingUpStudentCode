import java.util.Arrays;

/**
 * The class WeatherPatterns finds the longest span of days in which
 * each day’s temperature is higher than on the previous day in that sequence.
 *
 * @author Zach Blick
 * @author Tyler Hinkie
 */

public class WeatherPatterns {


    /**
     * Longest Warming Trend
     * @param temperatures
     * @return the longest run of days with increasing temperatures
     */
    public static int longestWarmingTrend(int[] temperatures) {
        // TODO: Write your code here!
        int length = temperatures.length;

        int[] runs = new int[length];
        Arrays.fill(runs, 1);

        int maxRun = 1;

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (temperatures[i] > temperatures[j])
                    runs[i] = Math.max(runs[i], runs[j] + 1);
            }

            maxRun = Math.max(maxRun, runs[i]);
        }

        return maxRun;
    }
}
