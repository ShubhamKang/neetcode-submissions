class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> sett = new HashSet<>();
        for(int num: nums){
            sett.add(num);
        }
        int maxCount = 0;
        for(int num: sett){
            int counter = 1;
            if(!sett.contains(num-1)){
                while(sett.contains(num+1)){
                    num+=1;
                    counter += 1;
                }
            }

            if (counter > maxCount){
                maxCount = counter;
                counter = 0;
            }
        }
        return maxCount;
        
    }
}
