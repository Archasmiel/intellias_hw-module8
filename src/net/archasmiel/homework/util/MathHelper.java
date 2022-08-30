package net.archasmiel.homework.util;

public class MathHelper {

    private MathHelper() {

    }



    public static double findRange(double... nums) {
        return MathHelper.findMax(nums) - MathHelper.findMin(nums);
    }

    public static float findRange(float... nums) {
        return MathHelper.findMax(nums) - MathHelper.findMin(nums);
    }

    public static int findRange(int... nums) {
        return MathHelper.findMax(nums) - MathHelper.findMin(nums);
    }

    public static long findRange(long... nums) {
        return MathHelper.findMax(nums) - MathHelper.findMin(nums);
    }

    public static int findRange(byte... nums) {
        return MathHelper.findMax(nums) - MathHelper.findMin(nums);
    }






    public static double findMax(double... nums) {
        double max = Double.MIN_VALUE;
        for (double n: nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static double findMin(double... nums) {
        double min = Double.MAX_VALUE;
        for (double n: nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }



    public static float findMax(float... nums) {
        float max = Float.MIN_VALUE;
        for (float n: nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static float findMin(float... nums) {
        float min = Float.MAX_VALUE;
        for (float n: nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }



    public static int findMax(int... nums) {
        int max = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int findMin(int... nums) {
        int min = Integer.MAX_VALUE;
        for (int n: nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }



    public static long findMax(long... nums) {
        long max = Long.MIN_VALUE;
        for (long n: nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static long findMin(long... nums) {
        long min = Long.MAX_VALUE;
        for (long n: nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }



    public static byte findMax(byte... nums) {
        byte max = Byte.MIN_VALUE;
        for (byte n: nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static byte findMin(byte... nums) {
        byte min = Byte.MAX_VALUE;
        for (byte n: nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }



}
