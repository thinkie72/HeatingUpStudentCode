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

        int[] lengths = new int[length];
        Arrays.fill(lengths, 1);

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (temperatures[i] > temperatures[j])
                    lengths[i] = Math.max(lengths[i], lengths[j] + 1);
            }
        }

        return 0;
    }
}
