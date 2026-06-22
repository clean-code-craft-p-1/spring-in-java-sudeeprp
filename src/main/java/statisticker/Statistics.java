package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {
        public float average;
        public float min;
        public float max;
    }

    public static Stats getStatistics(List<Float> numbers) {
        Stats stats = new Stats();
        if (numbers.isEmpty()) {
            stats.average = Float.NaN;
            stats.min = Float.NaN;
            stats.max = Float.NaN;
            return stats;
        }
        float sum = 0f;
        float min = Float.MAX_VALUE;
        float max = -Float.MAX_VALUE;
        for (float n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        stats.average = sum / numbers.size();
        stats.min = min;
        stats.max = max;
        return stats;
    }
}
