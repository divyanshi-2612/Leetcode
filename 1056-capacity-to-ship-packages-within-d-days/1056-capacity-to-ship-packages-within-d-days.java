class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int maxWeight = 0;
        for (int w : weights) {
            sum += w;
            maxWeight = Math.max(maxWeight, w);
        }
        int low = maxWeight;  // Minimum possible capacity
        int high = sum;       // Maximum possible capacity
        while (low <= high) {
            int mid = (low + high) / 2;
            int cnt = 0;
            int day = 1;
            for (int i = 0; i < weights.length; i++) {
                if (cnt + weights[i] <= mid) {
                    cnt += weights[i];
                } else {
                    cnt = weights[i];
                    day++;
                }
            }
            if (day <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}