class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word: strs){
            int[] count = new int[26];
            for (char c : word.toCharArray()){
                count[c - 'a']++;
            }
            String freq = Arrays.toString(count);
            if (!map.containsKey(freq)){
                map.put(freq, new ArrayList<>());
            }
            map.get(freq).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}

