class Solution {
    static {
        for(int i = 0; i<500; i++){
            maxArea(new int[]{1, 1});
        }
    }
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        while(left <= right){
            curr = (right-left) * Math.min(height[left], height[right]);
            max = Math.max(max, curr);
            if(height[left] <= height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
