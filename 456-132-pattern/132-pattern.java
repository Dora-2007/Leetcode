class Solution {
    public boolean find132pattern (int[] nums) {
        Stack <Integer> st = new Stack ();
        int s = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums [i] < s)
                return true;
            while (!st.isEmpty() && nums [i] > st.peek ())
                s = st.pop ();
            st.push (nums [i]);
        }
        return false;
    }
}