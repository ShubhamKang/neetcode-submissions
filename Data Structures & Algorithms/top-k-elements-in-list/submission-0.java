class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] output = new int[k];

        for(int i: nums){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }
            else{
                mp.put(i,mp.get(i) + 1);
            }    
        }
        // int maxx = Integer.MIN_VALUE;
        // for(int a: mp.keySet()){
        //     if(mp.get(a)>)
        // }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        for(int i = 0; i<k; i++){
            output[i] = list.get(i).getKey();
        }
        return output;
    }
}
