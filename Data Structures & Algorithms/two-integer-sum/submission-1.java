class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int k = 0;
        int j = 0;
        for (int i = 0; i<nums.length;i++){
            int difference = target - nums[i];
            if (map.containsKey(difference)){
                j = map.get(difference);
                k = i;
            }
            map.put(nums[i], i);
        }
        int [] output = new int[2];
        output[0] = j;
        output[1] = k;
        return output;
    }
}
