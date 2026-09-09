class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<nums.length ; i++){
            set.add(nums[i]);
        }
        int longestcount = 0;
        for(int i : set){
            if (!set.contains(i-1)){ 
                int count = 1;
                while (set.contains(i + count)){
                    count++;
                }
                longestcount = Math.max(longestcount, count);
            }
        }
        return longestcount;
    }
}
