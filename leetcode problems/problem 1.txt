class Solution {
    public int lengthOfLongestSubstring(String s) {
        String subStr = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = 0; j < subStr.length(); j++) {
                if (subStr.charAt(j) == c) {
                    subStr = subStr.substring(j + 1);
                    break;
                }
            }

            subStr += c;
            maxLength = Math.max(maxLength, subStr.length());
        }

        return maxLength;
    }
}