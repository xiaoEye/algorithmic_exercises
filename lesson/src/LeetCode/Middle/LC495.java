package LeetCode.Middle;

public class LC495 {

    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1, 2}, 2));
        System.out.println(findPoisonedDuration(new int[]{1, 4}, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime = 0;
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] - timeSeries[i] < duration) {
                totalTime += timeSeries[i + 1] - timeSeries[i];
            } else {
                totalTime += duration;
            }
        }
        totalTime += duration;
        return totalTime;
    }
}
