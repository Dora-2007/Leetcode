class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for (int n : nums) {
            s.add(n);
        }

        int lon = 0;

        for (int m : s) {
            if (!s.contains(m - 1)) {
                int len = 1;

                while (s.contains(m + len)) {
                    len++;
                }

                lon = Math.max(lon, len);
            }
        }

        return lon;
    }
}