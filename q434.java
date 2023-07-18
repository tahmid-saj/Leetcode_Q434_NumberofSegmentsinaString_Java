class Solution {
    public int countSegments(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                res++;
            }
            if (i + 1 == s.length() && s.charAt(i) != ' ') {
                res++;
            }
        }

        return res;
    }
}
