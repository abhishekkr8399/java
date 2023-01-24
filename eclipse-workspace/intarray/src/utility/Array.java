package utility;

public class Array {
	public static int min(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int max(int a[]) {
        int max = 0;
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void scale(int a[], int scaleFactor) {
        for (int i = 0; i < a.length; i++)
            a[i] *= scaleFactor;
    }

    public static float average(int a[]) {
        int sum = 0;
        for (int x : a)
            sum += x;
        return sum * 1.0f / a.length;
    }
}
