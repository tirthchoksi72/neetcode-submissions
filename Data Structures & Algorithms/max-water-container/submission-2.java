class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0;
        int i = 0;
        int j = heights.length -1;
        while(i<j){
            int height = Math.min(heights[i], heights[j]);
            int width = Math.abs(j - i);
            int area = height * width;
            if (heights[i]>heights[j]){
                j--;
            }
            else if (heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
                i++;
            }  
            maxarea = Math.max(area, maxarea);  
        }
        return maxarea;
    }
}
