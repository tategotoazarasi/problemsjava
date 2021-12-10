package problems.sqrtx;

public class Solution {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        long l = 0;
        long r = x / 2;
        long mid = (int) (1 / invSqrt(x));
        if (mid * mid == (long) x || (mid * mid < (long) x && (mid + 1) * (mid + 1) > (long) x)) {
            return (int) mid;
        }
        if ((mid * mid) > (long) x) {
            r = mid;
        } else {
            l = mid;
        }

        while (true) {
            mid = (l + r) / 2;
            if (mid * mid == (long) x || (mid * mid < (long) x && (mid + 1) * (mid + 1) > (long) x)) {
                return (int) mid;
            }
            if ((mid * mid) > (long) x) {
                r = mid;
            } else {
                l = mid;
            }
        }
    }

    public float invSqrt(float x) {
        float xhalf = 0.5f * x;
        int i = Float.floatToIntBits(x);
        i = 0x5f3759df - (i >> 1);
        x = Float.intBitsToFloat(i);
        x *= (1.5f - xhalf * x * x);
        return x;
    }
}

