class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxCount = 0;
        int counter = 1;
        int i = 0;
        while(i<=nums.length - 2){
            if((nums[i+1] == nums[i] + 1)){
                counter++;
            }
            else if(nums[i+1] == nums[i]){
                counter = counter;
            }
            
            else{
                if(counter > maxCount){
                    maxCount = counter;
                }
                counter = 1;
            }

            i+=1;
        }
        if(counter > maxCount){
            maxCount = counter;

        }
        return maxCount;
    }
}
