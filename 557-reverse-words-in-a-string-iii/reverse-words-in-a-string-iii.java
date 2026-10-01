class Solution {
    public String reverseWords(String s) {
        StringBuilder ss = new StringBuilder();
        String s1[] = s.split(" ");

        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            int m = s2.length();

            for (int j = m - 1; j >= 0; j--) {
                char ch = s2.charAt(j);
                ss.append(ch);
            }

            ss.append(" ");
        }

        return ss.toString().trim();
    }
}