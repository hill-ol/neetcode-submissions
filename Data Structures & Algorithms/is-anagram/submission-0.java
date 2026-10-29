class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int index = 0; index < t.length(); index++) {
            char c = t.charAt(index);
            int count = map.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            map.put(c, count - 1);
        }

        return true;
    }
}
