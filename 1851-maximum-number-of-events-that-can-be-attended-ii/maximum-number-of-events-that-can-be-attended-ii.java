class Solution {
    private int k, n;
    private int[][] dp;

    private int func(int[][] events, int ind, int cnt, int last) {
        if (cnt == k || ind == n) return 0;

        if (dp[ind][cnt] != -1) return dp[ind][cnt];

        int st = events[ind][0], end = events[ind][1], val = events[ind][2];

        int take = 0;
        if (st > last) {
            int l = ind, r = n - 1, ans = n;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (events[mid][0] > end) {
                    ans = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            take = val + func(events, ans, cnt + 1, end);
        }

        int notTake = func(events, ind + 1, cnt, last);

        return dp[ind][cnt] = Math.max(take, notTake);
    }

    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        this.k = k;
        this.n = events.length;
        dp = new int[n][k + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return func(events, 0, 0, 0);
    }
}