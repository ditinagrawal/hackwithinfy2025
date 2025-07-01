package GreedyApproach;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int[][] activities = { { 1, 3 }, { 2, 4 }, { 3, 5 }, { 0, 6 }, { 5, 7 }, { 8, 9 } };
        System.out.println(solution(activities));
    }

    static int solution(int[][] activities) {
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int[] prev = activities[0];
        for (int i = 1; i < activities.length; i++) {
            int[] cur = activities[i];
            if (cur[0] >= prev[1]) {
                count++;
                prev = cur;
            }
        }
        return count;
    }
}
