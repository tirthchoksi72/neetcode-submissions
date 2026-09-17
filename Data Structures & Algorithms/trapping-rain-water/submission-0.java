class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int output = 0;
        while(left <= right){
            if (height[left]<height[right]){
                if(height[left]>maxLeft){
                    maxLeft = Math.max(maxLeft, height[left]);
                }
                else{
                    output += maxLeft - height[left];
                }
                left++;
            }
            else{
                if(height[right]>maxRight){
                    maxRight = Math.max(maxRight, height[right]);
                }
                else{
                    output += maxRight - height[right];
                }
                right--;
            }
        }
        return output;
    }
}
