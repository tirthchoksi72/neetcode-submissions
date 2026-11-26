class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i<strs.length; i++){
            int[] count = new int[26];
            for (int j =0; j< strs[i].length(); j++){
                count[strs[i].charAt(j) - 'a']++;
            }
            String finalKey = Arrays.toString(count);
            map.computeIfAbsent(finalKey, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList(map.values());

    }
}
