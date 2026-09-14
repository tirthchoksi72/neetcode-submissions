class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1 ; i++){
            int j = i+1;
            int k = nums.length-1;
            int target = - (nums[i]);
            if (i>0 && nums[i]== nums[i-1]){
                continue;
            }
            while(j<k){
                if(nums[j] + nums[k] < target){
                    j++;
                }
                else if (nums[j] + nums[k] > target){
                    k--;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return list;
    }
}
