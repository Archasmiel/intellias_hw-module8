package net.archasmiel.homework.util;

public class MathHelper {

    public static double findRange(double... nums) {
        return MathHelper.findMax(nums) - MathHelper.findMin(nums);
    }

    private static double findMax(double... nums) {
        double max = Double.MIN_VALUE;
        for (double n: nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    private static double findMin(double... nums) {
        double min = Double.MAX_VALUE;
        for (double n: nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

}
