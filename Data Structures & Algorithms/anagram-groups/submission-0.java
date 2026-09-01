class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>());
                }
                map.get(sortedWord).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
