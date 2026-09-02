class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Create buckets where index = frequency
        ArrayList<List<Integer>> buckets = new ArrayList<>();
        
        // Maximum frequency can be nums.length
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        
        // Put each number into its frequency bucket
        for (int num : map.keySet()) {
            int frequency = map.get(num);
            buckets.get(frequency).add(num);
        }
        
        int[] result = new int[k];
        int index = 0;
        
        // Start from highest frequency
        for (int i = buckets.size() - 1; i >= 0 && index < k; i--) {
            
            for (int num : buckets.get(i)) {
                result[index] = num;
                index++;
                
                if (index == k) {
                    break;
                }
            }
        }
        
        return result;
    }
}
