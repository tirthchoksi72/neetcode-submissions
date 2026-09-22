class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxlen = 0;
        Set<Character> set = new HashSet<>(); 
        while (j<s.length()){
            int len = 0;
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                len = (j-i) + 1;
                maxlen = Math.max(maxlen,len);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
            
        }
        return maxlen;
    }
}
