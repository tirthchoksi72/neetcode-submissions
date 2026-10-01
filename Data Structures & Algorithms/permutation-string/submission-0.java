class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] window = new int[26];
        int[] need = new int[26];
        for (char c: s1.toCharArray()){
            need[c - 'a']++;
        }
        int l = 0;
        for (int r = 0; r<s2.length(); r++){
            window[s2.charAt(r) - 'a']++;
            if (r-l + 1 > s1.length()){
                window[s2.charAt(l)- 'a']--;
                l++;
            }
            if(r-l + 1 == s1.length()){
                if (Arrays.equals(window, need)){
                    return true;
                }
            }
        }
        return false;
    }
}
