class Solution {
    public String reverseStr(String s, int k) {

        char[] chars = s.toCharArray();
        int len = chars.length;

        for (int i = 0; i < len; i += 2 * k) {
            int start = i;
            int end = i + (k - 1) >= len ? len - 1 : i + (k - 1);

            while (start < end) {
                char tmp = chars[start];
                chars[start++] = chars[end];
                chars[end--] = tmp;
            }
        }

        return new String(chars);
    }
}