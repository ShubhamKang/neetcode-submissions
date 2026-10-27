class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length - 1;

        int curr_water = 0;
        int max_water = 0;
        int width = 0;
        int height = 0;

        while(left < right){
            width = right - left;
            height = Math.min(heights[left],heights[right]);
            curr_water = width * height;
            max_water = Math.max(max_water,curr_water);
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_water;
    }
}
