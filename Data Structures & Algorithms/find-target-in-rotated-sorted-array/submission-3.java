class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = (low + high) / 2;

            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        int pivot = low;
        int left = 0;
        int right = nums.length - 1;

        if(pivot == 0){
            while(left <= right){
                int mid = (left + right)/2;
                if(target == nums[mid]){
                    return mid;
                }
                else if(nums[mid] > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            return -1;
        }

        else if(target >= nums[0] && target <= nums[pivot - 1]){
            right = pivot - 1;
            while(left <= right){
                int mid = (left + right)/2;
                if(target == nums[mid]){
                    return mid;
                }
                else if(nums[mid] > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            return -1;
        }
        else{
            left = pivot;
            right = nums.length - 1;
            while(left <= right){
                int mid = (left + right)/2;
                if(target == nums[mid]){
                    return mid;
                }
                else if(nums[mid] > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            return -1;
        }


    }
}
