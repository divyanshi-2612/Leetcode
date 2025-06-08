class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;

        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0, flowers = 0;
        for (int d : bloomDay) {
            if (d <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    if (bouquets == m) return true;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return false;
    }
}
