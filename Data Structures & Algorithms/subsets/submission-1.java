class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> out = new ArrayList<>();
        find_subsets(nums,0,curr,out);

        return out;

    }
    void find_subsets(int[] nums,int index,List<Integer> curr, List<List<Integer>> out){
        if(index >= nums.length){
            out.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[index]);
        find_subsets(nums,index+1,curr,out);
        curr.remove(curr.size() - 1);
        find_subsets(nums,index+1,curr,out);
    }
}



